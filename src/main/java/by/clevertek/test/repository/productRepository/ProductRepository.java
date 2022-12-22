package by.clevertek.test.repository.productRepository;

import by.clevertek.test.model.product.Product;

/**
 * @author Eugene Petrov
 */
public interface ProductRepository {
    ProductType getProductTypeById(int id) throws ProductRepositoryException;
    Product getProductByType(ProductType type);
    Product getProductById(int id) throws ProductRepositoryException;
}
