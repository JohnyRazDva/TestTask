package by.clevertek.test.repository.cardRepository.impl;

import by.clevertek.test.model.card.DiscountCard;
import by.clevertek.test.repository.cardRepository.CardRepository;
import by.clevertek.test.repository.cardRepository.CardRepositoryException;

/**
 * @author Eugene Petrov
 */
public class CardFileRepository implements CardRepository {
    @Override
    public boolean isCardValid(int cardId) {
        return false;
    }

    @Override
    public DiscountCard getCardById(int cardId) throws CardRepositoryException {
        return null;
    }
}
