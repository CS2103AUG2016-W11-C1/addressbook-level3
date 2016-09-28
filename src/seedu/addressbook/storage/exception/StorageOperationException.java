package seedu.addressbook.storage.exception;

/**
 * Created by yihangho on 9/28/16.
 */
/**
 * Signals that some error has occured while trying to convert and read/write data between the application
 * and the storage file.
 */
public class StorageOperationException extends Exception {
    public StorageOperationException(String message) {
        super(message);
    }
}
