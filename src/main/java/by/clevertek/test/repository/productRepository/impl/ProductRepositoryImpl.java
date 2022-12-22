package by.clevertek.test.repository.productRepository.impl;

import by.clevertek.test.model.product.Product;
import by.clevertek.test.repository.productRepository.*;


import java.util.HashMap;

/**
 * @author Eugene Petrov
 */

public class ProductRepositoryImpl implements ProductRepository {
    private ProductFactory factory;
    private final HashMap<Integer, ProductType> products = new HashMap<>();


    public ProductRepositoryImpl(ProductFactory factory) {
        this.factory = factory;
        products.put(1, ProductType.MILK);
        products.put(2, ProductType.CHEESE);
    }




    @Override
    public ProductType getProductTypeById(int id) throws ProductRepositoryException {
        if (products.containsKey(id)) {
            return products.get(id);
        } else {
            throw new ProductRepositoryException("Wrong product id");
        }
    }

    @Override
    public Product getProductByType(ProductType type) {
        return factory.getProduct(type);
    }

    @Override
    public Product getProductById(int id) throws ProductRepositoryException {
        return factory.getProduct(getProductTypeById(id));
    }
}
