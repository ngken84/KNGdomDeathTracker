package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;

import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Card;
import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Innovation;

import static org.junit.Assert.assertEquals;

public class InnovationCardUnitTest {

    @Test
    public void innovation_isInnovationType() {
        Innovation testInnovation = new Innovation();
        assertEquals(testInnovation.getCardType(), Card.CardType.INNOVATION);
    }

}
