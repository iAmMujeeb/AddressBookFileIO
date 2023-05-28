package com.bridgelabz;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddressBookService {

    List<AddressBook> addressBookList;
    WritingService writingService;

    public AddressBookService(List<AddressBook> addressBookList) {
        this.addressBookList = addressBookList;
    }

    public AddressBookService(List<AddressBook> addressBookList, WritingService writingService) {
        this(addressBookList);
        this.writingService = writingService;
    }

    public void writeToIO() {
        try {
            writingService.writeToIO(addressBookList);
        } catch (IOException e) {
            System.out.println("catch");
        } catch (CsvRequiredFieldEmptyException e) {
            throw new RuntimeException(e);
        } catch (CsvDataTypeMismatchException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFromIO() {
        try {
            writingService.readFromIO();
        } catch (IOException e) {
            System.out.println("catch");
        }
    }

    public long countEntries() {
        Long count = null;
        try {
            count = writingService.countEntries();
        } catch (IOException e) {
            System.out.println("catch");
        }
        return count;
    }

}
