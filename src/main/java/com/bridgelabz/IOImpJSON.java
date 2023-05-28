package com.bridgelabz;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class IOImpJSON implements WritingService {

    final static String filePath = "D:\\Bridgelabz\\AddressBookIOWorkshop\\src\\main\\java\\com\\bridgelabz\\contacts.json";

    @Override
    public void writeToIO(List<AddressBook> addressBookList) throws IOException{
        Gson gson = new Gson();
        String json = gson.toJson(addressBookList);
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write(json);
        fileWriter.close();
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
