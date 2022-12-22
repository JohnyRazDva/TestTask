package by.clevertek.test.service.check;

import by.clevertek.test.service.ServiceException;

/**
 * @author Eugene Petrov
 */
public class CheckServiceException extends ServiceException {
    public CheckServiceException() {
        super();
    }

    public CheckServiceException(String message) {
        super(message);
    }

    public CheckServiceException(Exception e) {
        super(e);
    }

    public CheckServiceException(String message, Exception e) {
        super(message, e);
    }
}
