package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.exception.StorageOperationException;

/**
 * Created by yihangho on 9/28/16.
 */
public class StorageStub implements Storage {
    private AddressBook addressBook;
    private String path;

    public StorageStub(String path) {
        this.path = path ;
    }

    @Override
    public void save(AddressBook book) throws StorageOperationException {
        this.addressBook = book;
    }

    @Override
    public AddressBook load() throws StorageOperationException {
        return this.addressBook;
    }

    @Override
    public String getPath() {
        return this.path;
    }
}
