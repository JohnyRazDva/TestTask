package by.clevertek.test.model.product;

/**
 * @author Eugene Petrov
 */
public interface Product {
    String getName();

    double getPrice();

    boolean getPromotion();

    void setPromotion(boolean promotion);

    void setPrice(double price);

    void setId(int id);
}
