package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;

import joker.persona.ngrocken.kngdomdeathtracker.model.effects.EndeavorEvent;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.RollResult;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class EndeavorEventUnitTests {

    private EndeavorEvent createTestEndeavorEvent() {
        return new EndeavorEvent(1, "Test Cost");
    }

    @Test
    public void endEvent_constructorTest() {
        EndeavorEvent event = createTestEndeavorEvent();
        assertEquals(event.getEndeavorCost(), 1);
        assertEquals(event.getDescription(), "Test Cost");
    }

    @Test
    public void endEvent_addRollResult() {
        EndeavorEvent event = createTestEndeavorEvent();
        RollResult result = new RollResult(1, 4, "Test Description");
        event.addRollResult(result);
        assertTrue(event.getResultList().contains(result));
    }

    @Test
    public void endEvent_addMultipleRollResult() {
        EndeavorEvent event = createTestEndeavorEvent();
        RollResult result1 = new RollResult(1, 5, "1");
        RollResult result2 = new RollResult(6, 8, "2");
        event.addAllRollResults(result1, result2);
        assertTrue(event.getResultList().contains(result1));
        assertTrue(event.getResultList().contains(result2));
    }

    @Test
    public void endEvent_addMultipleRollResultOrderedCorrectly() {
        EndeavorEvent event = createTestEndeavorEvent();
        RollResult result1 = new RollResult(1, 5, "1");
        RollResult result2 = new RollResult(6, 8, "2");
        event.addAllRollResults(result2, result1);
        assertEquals(event.getResultList().get(0), result1);
        assertEquals(event.getResultList().get(1), result2);
    }

}
