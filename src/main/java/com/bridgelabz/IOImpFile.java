package com.bridgelabz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOImpFile implements WritingService{

    final static String filePath = "D:\\Bridgelabz\\AddressBookFileIO\\src\\main\\java\\com\\bridgelabz\\contact.txt";

    @Override
    public void writeToIO(List<AddressBook> addressBookList) throws IOException {
        StringBuffer sb = new StringBuffer();
        addressBookList.stream().forEach(addressBook -> {
            String contactString = addressBook.personList.toString().concat("\n");
            sb.append(contactString);
        });
        Files.write(Path.of(filePath),sb.toString().getBytes());
    }

    @Override
    public void readFromIO() throws IOException {
        Files.lines(Path.of(filePath)).forEach(addressBook->{
            System.out.println(addressBook);
        });
    }

    @Override
    public long countEntries() throws IOException {
        long count = Files.lines(Path.of(filePath)).count();
        return count;
    }

}
