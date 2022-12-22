package by.clevertek.test.repository.productRepository.impl;

import by.clevertek.test.model.product.Product;
import by.clevertek.test.repository.productRepository.ProductRepository;
import by.clevertek.test.repository.productRepository.ProductRepositoryException;
import by.clevertek.test.repository.productRepository.ProductType;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * @author Eugene Petrov
 */

public class ProductFileRepository implements ProductRepository {
    private FileReader fileReader;

    public ProductFileRepository(FileReader fileReader){
        this.fileReader = fileReader;
    }
    @Override
    public ProductType getProductTypeById(int id) throws ProductRepositoryException {
        return null;
    }

    @Override
    public Product getProductByType(ProductType type) {
        return null;
    }

    @Override
    public Product getProductById(int id) throws ProductRepositoryException {
        return null;
    }
}
