package com.bridgelabz;

import com.opencsv.CSVWriter;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IOImpCSV implements WritingService {
    private static final String filePath = "D:\\Bridgelabz\\AddressBookIOWorkshop\\src\\main\\java\\com\\bridgelabz\\contacts.csv";

    @Override
    public void writeToIO(List<AddressBook> addressBookList) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException {
        try(
                Writer writer = Files.newBufferedWriter(Paths.get(filePath));
        ) {
            StatefulBeanToCsv<Contact> beanToCsv = new StatefulBeanToCsvBuilder(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .build();
            for (int i=0; i<addressBookList.size(); i++)
                beanToCsv.write(addressBookList.get(i).personList);
        }

    }


    @Override
    public void readFromIO() throws IOException {
        Files.lines(Path.of(filePath)).forEach(addressBook -> {
            System.out.println(addressBook);
        });
    }

    @Override
    public long countEntries() throws IOException {
        long count = Files.lines(Path.of(filePath)).count();
        return count;
    }
}
