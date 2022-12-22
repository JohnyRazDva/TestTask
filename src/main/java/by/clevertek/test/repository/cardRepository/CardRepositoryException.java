package by.clevertek.test.repository.cardRepository;

import by.clevertek.test.repository.RepositoryException;

/**
 * @author Eugene Petrov
 */
public class CardRepositoryException extends RepositoryException {
    public CardRepositoryException() {
        super();
    }

    public CardRepositoryException(String message) {
        super(message);
    }

    public CardRepositoryException(Exception e) {
        super(e);
    }

    public CardRepositoryException(String message, Exception e) {
        super(message);
    }
}
