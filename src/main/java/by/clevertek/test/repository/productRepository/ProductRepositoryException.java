package by.clevertek.test.repository.productRepository;

import by.clevertek.test.repository.RepositoryException;

/**
 * @author Eugene Petrov
 */
public class ProductRepositoryException extends RepositoryException {
    public ProductRepositoryException(String message) {
        super(message);
    }

    public ProductRepositoryException(Exception e) {
        super(e);
    }

    public ProductRepositoryException(String message, Exception e) {
        super(message, e);
    }

    public ProductRepositoryException() {
        super();
    }
}
