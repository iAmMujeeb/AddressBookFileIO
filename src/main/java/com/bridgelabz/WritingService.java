package com.bridgelabz;

import java.io.IOException;
import java.util.List;

interface WritingService {

    void writeToIO(List<AddressBook> addressBookList) throws IOException;

    void readFromIO() throws IOException;

    long countEntries() throws IOException;
}
