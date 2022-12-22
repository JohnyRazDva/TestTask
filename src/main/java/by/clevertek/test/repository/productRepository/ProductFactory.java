package by.clevertek.test.repository.productRepository;

import by.clevertek.test.model.product.Product;

/**
 * @author Eugene Petrov
 */
public interface ProductFactory {
    Product getProduct(ProductType type);
}
