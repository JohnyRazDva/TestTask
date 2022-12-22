package by.clevertek.test.service.product;

import by.clevertek.test.service.ServiceException;

/**
 * @author Eugene Petrov
 */
public class ProductServiceException extends ServiceException {
    public ProductServiceException() {
        super();
    }

    public ProductServiceException(String message) {
        super(message);
    }

    public ProductServiceException(Exception e) {
        super(e);
    }

    public ProductServiceException(String message, Exception e) {
        super(message, e);
    }
}
