package by.clevertek.test.service.card.impl;

import by.clevertek.test.model.card.DiscountCard;
import by.clevertek.test.repository.cardRepository.CardRepository;
import by.clevertek.test.repository.cardRepository.CardRepositoryException;
import by.clevertek.test.repository.cardRepository.impl.CardRepositoryImpl;
import by.clevertek.test.service.card.CardService;
import by.clevertek.test.service.card.CardServiceException;


/**
 * @author Eugene Petrov
 */

public class CardServiceImpl implements CardService {

    private CardRepository cardRepository;

    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }


    @Override
    public DiscountCard getCardById(int cardId) throws CardServiceException {
        try {
            return cardRepository.getCardById(cardId);
        } catch (CardRepositoryException e) {
            throw new CardServiceException(e);
        }
    }
}
