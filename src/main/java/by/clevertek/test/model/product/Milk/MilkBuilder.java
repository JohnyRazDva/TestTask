package by.clevertek.test.model.product.Milk;

import by.clevertek.test.model.product.Product;
import by.clevertek.test.model.product.ProductBuilder;

/**
 * @author Eugene Petrov
 */
public class MilkBuilder implements ProductBuilder {
    private final Milk milk = new Milk();

    @Override
    public ProductBuilder setPromotion(boolean promotion) {
        milk.setPromotion(promotion);
        return this;
    }

    @Override
    public ProductBuilder setId(int id) {
        milk.setId(id);
        return this;
    }

    @Override
    public ProductBuilder setPrice(double price) {
        milk.setPrice(price);
        return this;
    }

    @Override
    public Product build() {
        return milk;
    }
}
