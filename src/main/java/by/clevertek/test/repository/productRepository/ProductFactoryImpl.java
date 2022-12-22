package by.clevertek.test.repository.productRepository;

import by.clevertek.test.model.product.Cheese.CheeseBuilder;
import by.clevertek.test.model.product.Milk.MilkBuilder;
import by.clevertek.test.model.product.Product;


/**
 * @author Eugene Petrov
 */
public class ProductFactoryImpl implements ProductFactory {

    private final double milkPrice = 7;
    private final boolean milkPromotion = false;
    private final double cheesePrice = 10;
    private final boolean cheesePromotion = true;

    @Override
    public Product getProduct(ProductType type) {
        Product product = null;
        switch (type) {
            case MILK -> product = new MilkBuilder().setPrice(milkPrice).setPromotion(milkPromotion).build();
            case CHEESE -> product = new CheeseBuilder().setPrice(cheesePrice).setPromotion(cheesePromotion).build();
        }
        return product;
    }
}
