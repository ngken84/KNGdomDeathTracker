package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;

import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Card;
import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Innovation;

import static org.junit.Assert.assertEquals;

public class InnovationCardUnitTest {

    @Test
    public void innovation_ConstructorWorks() {
        String name = "Family";
        String description = "";
        String category = "home";
        String consequenceOf = "hovel";
        int slb = 0;

        Innovation testInnovation = new Innovation(name, description, category, consequenceOf, slb);
        assertEquals(testInnovation.getCardType(), Card.CardType.INNOVATION);
        assertEquals(testInnovation.getName(), name);
        assertEquals(testInnovation.getCategory(), category);
    }

}
