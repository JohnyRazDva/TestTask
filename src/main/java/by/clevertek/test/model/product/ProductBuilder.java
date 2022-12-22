package by.clevertek.test.model.product;

/**
 * @author Eugene Petrov
 */
public interface ProductBuilder {
    ProductBuilder setPromotion(boolean promotion);
    ProductBuilder setId(int id);
    ProductBuilder setPrice(double price);
    Product build();
}
