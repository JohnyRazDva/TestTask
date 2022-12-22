package by.clevertek.test.service.check.impl;

import by.clevertek.test.model.check.Check;
import by.clevertek.test.model.product.Product;
import by.clevertek.test.repository.check.CheckRepository;
import by.clevertek.test.repository.check.CheckRepositoryException;
import by.clevertek.test.service.card.CardService;
import by.clevertek.test.service.card.CardServiceException;
import by.clevertek.test.service.card.impl.CardServiceImpl;
import by.clevertek.test.service.check.CheckService;
import by.clevertek.test.service.check.CheckServiceException;
import by.clevertek.test.service.product.ProductService;
import by.clevertek.test.service.product.ProductServiceException;

import java.util.Map;

/**
 * @author Eugene Petrov
 */

public class CheckServiceImpl implements CheckService {

    private ProductService productService;
    private CardService cardService;
    private CheckRepository checkRepository;

    public static final int PRODUCT_QUANTITY_FOR_PROMOTION = 5;
    public static final int PROMOTION_DISCOUNT_PERCENT = 10;
    public static final String CARD_PATTERN = "card";
    public static final int CARD_IDENTIFIER_INDEX = 0;
    public static final int CARD_ID_INDEX = 1;
    public static final String SPLIT_DATA = "-";


    public CheckServiceImpl (ProductService productService, CardService cardService, CheckRepository checkRepository){
        this.cardService = cardService;
        this.productService = productService;
        this.checkRepository = checkRepository;
    }


    @Override
    public Check getCheck(String[] data) throws CheckServiceException {
        try {
            Check check = new Check();
            String[] productData = getProductData(data);
            check.setProductsInfo(productService.getProducts(productData));
            check.setDiscountCard(cardService.getCardById(getCardId(data)));
            double totalCheckPrice = calculateTotalPrice(check);
            check.setTotalPrice(totalCheckPrice);
            return check;
        } catch (ProductServiceException | CardServiceException e) {
            throw new CheckServiceException(e);
        }
    }

    @Override
    public void addCheck(String[] data) throws CheckServiceException {
        try {
            checkRepository.addCheck(getCheck(data));
        } catch (CheckRepositoryException e) {
            throw new CheckServiceException(e);
        }
    }

    private String[] getProductData(String[] data) {
        String[] productData;
        String checkedCard = data[data.length - 1].split(SPLIT_DATA)[0];
        if (!checkedCard.equals(CARD_PATTERN)) {
            productData = data;
        } else {
            productData = new String[data.length - 1];
            for (int i = 0; i < productData.length; i++) {
                productData[i] = data[i];
            }
        }
        return productData;
    }

    private double calculateTotalPrice(Check check) {
        double result = 0;
        for (Map.Entry<Product, Integer> products : check.getProductsInfo().entrySet()) {
            double total = 0;
            if (products.getKey().getPromotion() && products.getValue() >= PRODUCT_QUANTITY_FOR_PROMOTION) {
                total += products.getKey().getPrice() * products.getValue();
                total -= ((products.getKey().getPrice() * products.getValue()) / 100) * PROMOTION_DISCOUNT_PERCENT;
                check.addProductWithTotalPrice(products.getKey(), total);
            } else {
                total += products.getKey().getPrice() * products.getValue();
                check.addProductWithTotalPrice(products.getKey(), total);
            }
            result += total;
        }
        check.setTotalDiscount(result / 100 * check.getDiscountCard().getDiscountPercent());
        result -= check.getTotalDiscount();
        return result;
    }

    private int getCardId(String[] data) {
        String cardInfo = data[data.length - 1];
        String card = cardInfo.split(SPLIT_DATA)[CARD_IDENTIFIER_INDEX];
        if (card.equals(CARD_PATTERN)) {
            return Integer.parseInt(cardInfo.split(SPLIT_DATA)[CARD_ID_INDEX]);
        } else {
            return 0;  //empty card id;
        }
    }
}
