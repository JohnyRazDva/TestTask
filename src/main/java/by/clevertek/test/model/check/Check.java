package by.clevertek.test.model.check;

import by.clevertek.test.model.card.DiscountCard;
import by.clevertek.test.model.product.Product;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Eugene Petrov
 */
public class Check {

    /**
     * HashMap with {@link Product} and numbers of products in check
     */
    private HashMap<Product, Integer> productsInfo;

    /**
     * HashMap with {@link Product} and total price of products
     */
    private HashMap<Product, Double> productsTotalPrice = new HashMap<>();


    private DiscountCard discountCard;

    private Double totalDiscount;

    private double totalPrice;

    public Check() {
    }

    public Check(HashMap<Product, Integer> products) {
        this.productsInfo = products;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }


    public HashMap<Product, Integer> getProductsInfo() {
        return productsInfo;
    }

    public void setProductsInfo(HashMap<Product, Integer> productsInfo) {
        this.productsInfo = productsInfo;
    }

    public void addProductWithTotalPrice(Product product, Double totalPrice) {
        productsTotalPrice.put(product, totalPrice);
    }

    public HashMap<Product, Double> getProductsTotalPrice() {
        return productsTotalPrice;
    }

    public DiscountCard getDiscountCard() {
        return discountCard;
    }

    public void setDiscountCard(DiscountCard discountCard) {
        this.discountCard = discountCard;
    }

    public void setTotalDiscount(Double totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public Double getTotalDiscount() {
        return totalDiscount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n    CASH RECEIPT    ");
        for (Map.Entry<Product, Double> productTotalPrice : getProductsTotalPrice().entrySet()) {
            builder.append("\n")
                    .append(productTotalPrice.getKey().getName())
                    .append("(")
                    .append(getProductsInfo().get(productTotalPrice.getKey()))
                    .append(")")
                    .append("    price: ")
                    .append(productTotalPrice.getKey().getPrice());
            if (productTotalPrice.getKey().getPromotion()) {
                builder.append("  promotion discount: 5%");
            }
            builder.append("    total: ")
                    .append(productTotalPrice.getValue());
        }
        builder.append("\nDiscount card ")
                .append(getDiscountCard().getDiscountPercent())
                .append("%: ");
        String totalDiscount = String.format("%.2f %n",getTotalDiscount());
        builder.append(totalDiscount)
                .append("\nTOTAL: ")
                .append(getTotalPrice());
        return builder.toString();
    }
}
