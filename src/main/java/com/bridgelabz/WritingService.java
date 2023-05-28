package com.bridgelabz;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.IOException;
import java.util.List;

interface WritingService {

    void writeToIO(List<AddressBook> addressBookList) throws IOException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, CsvDataTypeMismatchException;

    void readFromIO() throws IOException;

    long countEntries() throws IOException;
}
