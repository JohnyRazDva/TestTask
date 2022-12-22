package by.clevertek.test.model.product.Cheese;

import by.clevertek.test.model.product.Product;
import by.clevertek.test.model.product.ProductBuilder;

/**
 * @author Eugene Petrov
 */
public class CheeseBuilder implements ProductBuilder {
    Cheese cheese = new Cheese();

    @Override
    public ProductBuilder setPromotion(boolean promotion) {
        cheese.setPromotion(promotion);
        return this;
    }

    @Override
    public ProductBuilder setId(int id) {
        cheese.setId(id);
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        cheese.setPrice(price);
        return this;
    }

    @Override
    public Product build() {
        return cheese;
    }
}
