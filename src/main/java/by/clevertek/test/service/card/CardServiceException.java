package by.clevertek.test.service.card;

import by.clevertek.test.service.ServiceException;

/**
 * @author Eugene Petrov
 */

public class CardServiceException extends ServiceException {
    public CardServiceException() {
    }

    public CardServiceException(String message) {
        super(message);
    }

    public CardServiceException(Exception e){
        super(e);
    }

    public CardServiceException(String message, Exception e) {
        super(message, e);
    }
}
