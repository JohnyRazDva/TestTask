package by.clevertek.test.repository;

/**
 * @author Eugene Petrov
 */
public class RepositoryException extends Exception {

    public RepositoryException(String message) {
        super(message);
    }

    public RepositoryException(Exception e) {
        super(e);
    }

    public RepositoryException(String message, Exception e) {
        super(message, e);
    }

    public RepositoryException() {

    }
}
