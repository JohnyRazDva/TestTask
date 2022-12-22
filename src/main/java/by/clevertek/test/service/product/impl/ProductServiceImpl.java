package by.clevertek.test.service.product.impl;

import by.clevertek.test.model.product.Product;
import by.clevertek.test.repository.productRepository.ProductRepository;
import by.clevertek.test.repository.productRepository.ProductRepositoryException;
import by.clevertek.test.service.product.ProductService;
import by.clevertek.test.service.product.ProductServiceException;


import java.util.HashMap;

/**
 * @author Eugene Petrov
 */

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public static final String PRODUCT_INFO_SPLIT_SYMBOL = "-";
    public static final int PRODUCT_ID_INDEX = 0;
    public static final int PRODUCT_QUANTITY_INDEX = 1;

    public ProductServiceImpl (ProductRepository productRepository){
        this.productRepository = productRepository;
    }


    @Override
    public HashMap<Product, Integer> getProducts(String[] data) throws ProductServiceException {
        try {
            HashMap<Product, Integer> products = new HashMap<>();
            for (String productInfo : data) {
                int id = getProductId(productInfo);
                int quantity = getQuantityOfProduct(productInfo);
                Product product = productRepository.getProductById(id);
                products.put(product, quantity);
            }
            return products;
        } catch (ProductRepositoryException e) {
            throw new ProductServiceException(e);
        }
    }

    private int getProductId(String data) {
        String stringID = data.split(PRODUCT_INFO_SPLIT_SYMBOL)[PRODUCT_ID_INDEX];
        return Integer.parseInt(stringID);
    }

    private int getQuantityOfProduct(String data) {
        String stringQuantity = data.split(PRODUCT_INFO_SPLIT_SYMBOL)[PRODUCT_QUANTITY_INDEX];
        return Integer.parseInt(stringQuantity);
    }

}
