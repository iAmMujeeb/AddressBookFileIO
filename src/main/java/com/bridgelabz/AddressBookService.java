package com.bridgelabz;

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
