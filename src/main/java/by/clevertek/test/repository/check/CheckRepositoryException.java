package by.clevertek.test.repository.check;

import by.clevertek.test.repository.RepositoryException;

/**
 * @author Eugene Petrov
 */
public class CheckRepositoryException extends RepositoryException {
    public CheckRepositoryException(String message) {
        super(message);
    }

    public CheckRepositoryException(Exception e) {
        super(e);
    }

    public CheckRepositoryException(String message, Exception e) {
        super(message, e);
    }

    public CheckRepositoryException() {
        super();
    }
}
