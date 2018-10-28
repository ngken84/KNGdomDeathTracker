package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;

import joker.persona.ngrocken.kngdomdeathtracker.model.effects.EndeavorEvent;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.RollResult;

import static org.junit.Assert.assertEquals;

public class EndeavorEventUnitTests {

    @Test
    public void endEvent_constructorTest() {
        EndeavorEvent event = new EndeavorEvent(1, "Test Cost");
        assertEquals(event.getEndeavorCost(), 1);
        assertEquals(event.getDescription(), "Test Cost");
    }

}
