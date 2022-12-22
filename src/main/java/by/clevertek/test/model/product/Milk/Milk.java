package by.clevertek.test.model.product.Milk;

import by.clevertek.test.model.product.AbstractProduct;
import by.clevertek.test.repository.productRepository.ProductType;

import java.util.Locale;

/**
 * @author Eugene Petrov
 */
public class Milk extends AbstractProduct {
    private final static ProductType type = ProductType.MILK;

    public Milk() {

    }

    public Milk(double price, boolean promotion){
        this.price = price;
        this.promotion = promotion;
    }

    public Milk(int id, double price, boolean promotion){
        this.id = id;
        this.price = price;
        this.promotion = promotion;
    }



    @Override
    public String getName() {
        return type.name().toLowerCase(Locale.ROOT);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public boolean getPromotion() {
        return promotion;
    }

    @Override
    public void setPromotion(boolean promotion) {
        this.promotion = promotion;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setId(int id) {

    }
}
