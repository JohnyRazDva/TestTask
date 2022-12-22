package by.clevertek.test.model.card;


/**
 * @author Eugene Petrov
 */
public class DiscountCardImpl implements DiscountCard {
    private int discountPercent;
    private int id;

    public DiscountCardImpl() {
    }

    public DiscountCardImpl(int id, int discountPercent) {
        this.id = id;
        this.discountPercent = discountPercent;
    }

    @Override
    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }
}
