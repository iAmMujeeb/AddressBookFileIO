package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class AddressBookIOMain {

    public static void main(String[] args) {
        List<AddressBook> addressBookList = new ArrayList<>();
        AddressBook addressBook = new AddressBook();
        addressBook.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook1.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook1);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact("Mujeeb", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujbi", "Saifi", "Mumbai", "Maharashtra", 400089);
        addressBook2.addContact("Mujju", "Saifi", "Mumbai", "Maharashtra", 400099);
        addressBookList.add(addressBook2);
        WritingService writingService = new IOImpFile();
        AddressBookService addressBookService = new AddressBookService(addressBookList, writingService);
        addressBookService.writeToIO();
        addressBookService.readFromIO();
        long actualCount = addressBookService.countEntries();
        if (actualCount == 3) {
            System.out.println("AddressBook contacts successfully written into the file");
        } else {
            System.out.println("AddressBook contacts has not written into the file");
        }
    }
}
