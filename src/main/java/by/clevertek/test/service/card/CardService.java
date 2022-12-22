package by.clevertek.test.service.card;

import by.clevertek.test.model.card.DiscountCard;

/**
 * @author Eugene Petrov
 */
public interface CardService {
    DiscountCard getCardById(int cardId) throws CardServiceException;
}
