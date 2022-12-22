package by.clevertek.test.service.card.impl;

import by.clevertek.test.model.card.DiscountCard;
import by.clevertek.test.model.card.DiscountCardImpl;
import by.clevertek.test.repository.cardRepository.impl.CardRepositoryImpl;
import by.clevertek.test.service.card.CardServiceException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Eugene Petrov
 */
class CardServiceImplTest {
    @Test
    void testGetDiscountCardByIdOneTwoThreeFour() throws CardServiceException {
        try {
            CardServiceImpl cardService = new CardServiceImpl(new CardRepositoryImpl());
            DiscountCard discountCard = cardService.getCardById(1234);
            assertNotNull(discountCard);
            assertInstanceOf(DiscountCardImpl.class, discountCard);
        }catch (Exception e){
            fail("got Exception");
        }
    }

    @Test
    void testGetDiscountCardByIdZeroZeroZeroZero() throws CardServiceException {
        try {
            CardServiceImpl cardService = new CardServiceImpl(new CardRepositoryImpl());
            DiscountCard discountCard = cardService.getCardById(0000);
            assertEquals(0,discountCard.getDiscountPercent());
        }catch (Exception e){
            fail("got Exception");
        }
    }
}