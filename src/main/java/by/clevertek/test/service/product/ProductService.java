package by.clevertek.test.service.product;

import by.clevertek.test.model.check.Check;
import by.clevertek.test.model.product.Product;

import java.util.HashMap;
import java.util.List;

/**
 * @author Eugene Petrov
 */
public interface ProductService {

    /**
     * @param data - String array. Each element of which is a string with the product id and quantity
     * @return HashMap with {@link Product} like a key and quantity like a value
     */
    HashMap<Product, Integer> getProducts(String[] data) throws ProductServiceException;

}
