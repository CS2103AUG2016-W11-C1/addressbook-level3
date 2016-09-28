package seedu.addressbook.storage;

import seedu.addressbook.data.AddressBook;
import seedu.addressbook.storage.exception.StorageOperationException;

/**
 * Created by yihangho on 9/28/16.
 */
public interface Storage {

    void save(AddressBook book) throws StorageOperationException;
    AddressBook load() throws StorageOperationException;
    String getPath();

}
