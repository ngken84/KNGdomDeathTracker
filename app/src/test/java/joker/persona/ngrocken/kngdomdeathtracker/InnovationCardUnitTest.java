package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;

import joker.persona.ngrocken.kngdomdeathtracker.model.abilities.SurvivalAction;
import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Card;
import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Innovation;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.RollResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class InnovationCardUnitTest {

    String fam_name = "Family";
    String fam_description = "";
    String fam_category = "home";
    String fam_consequenceOf = "hovel";
    int fam_slb = 0;

    String departEffect = "Departing survivors gain + {{val}} + survival";
    int departVal = 1;


    private Innovation createFamilyInnovationCard() {
        return new Innovation(fam_name, fam_description, fam_category, fam_consequenceOf, fam_slb);
    }

    @Test
    public void innovation_ConstructorWorks() {
        Innovation testInnovation = createFamilyInnovationCard();
        assertEquals(testInnovation.getCardType(), Card.CardType.INNOVATION);
        assertEquals(testInnovation.getName(), fam_name);
        assertEquals(testInnovation.getCategory(), fam_category);
        assertEquals(testInnovation.getDescription(), fam_description);
        assertEquals(testInnovation.getConsequenceOf(), fam_consequenceOf);
    }

    @Test
    public void innovation_AddEffects() {
        Innovation testInn = createFamilyInnovationCard();
        Effect testEffect = new Effect(Effect.GamePhase.HUNT, departEffect, departVal);
        testInn.addEffect(testEffect);
        assertEquals(testInn.getEffectList().size(), 1);
        assertEquals(testInn.getEffectList().get(0), testEffect);
    }

    @Test
    public void innovation_AddSurvivalAction() {
        Innovation testInn = createFamilyInnovationCard();
        assertNull(testInn.getSurvivalAction());
        SurvivalAction action = new SurvivalAction("Test", "Test");
        testInn.setSurvivalAction(action);
        assertEquals(testInn.getSurvivalAction(), action);
    }

}
