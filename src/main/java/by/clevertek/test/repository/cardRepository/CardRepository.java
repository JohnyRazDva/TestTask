package by.clevertek.test.repository.cardRepository;

import by.clevertek.test.model.card.DiscountCard;

/**
 * @author Eugene Petrov
 */
public interface CardRepository {
    boolean isCardValid(int cardId);
    DiscountCard getCardById(int cardId) throws CardRepositoryException;
}
