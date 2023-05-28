package com.bridgelabz;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    List<Contact> personList = new ArrayList<>();

    public void addContact(String firstName, String lastName, String city, String state, int zip) {
        Contact contact = new Contact();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        personList.add(contact);
    }

}
