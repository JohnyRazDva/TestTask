package by.clevertek.test.repository.cardRepository.impl;

import by.clevertek.test.model.card.DiscountCard;
import by.clevertek.test.model.card.DiscountCardImpl;
import by.clevertek.test.repository.cardRepository.CardRepository;
import by.clevertek.test.repository.cardRepository.CardRepositoryException;


import java.util.HashMap;

/**
 * @author Eugene Petrov
 */
public class CardRepositoryImpl implements CardRepository {

    private final HashMap<Integer, Integer> discountCards = new HashMap<>();

    public CardRepositoryImpl() {
        discountCards.put(0, 0); //empty card
        discountCards.put(1234, 10); // id and discount for example
        discountCards.put(1235, 5);
        discountCards.put(1236, 25);
    }

    @Override
    public boolean isCardValid(int cardId) {
        return discountCards.containsKey(cardId);
    }

    @Override
    public DiscountCard getCardById(int cardId) throws CardRepositoryException {
        if (isCardValid(cardId)) {
            DiscountCard discountCard = new DiscountCardImpl(cardId, discountCards.get(cardId));
            return discountCard;
        } else {
            throw new CardRepositoryException("Wrong card number");
        }

    }
}
