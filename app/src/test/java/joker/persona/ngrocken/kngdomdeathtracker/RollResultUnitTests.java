package joker.persona.ngrocken.kngdomdeathtracker;


import org.junit.Test;

import joker.persona.ngrocken.kngdomdeathtracker.model.effects.RollResult;

import static org.junit.Assert.assertEquals;

public class RollResultUnitTests {

    @Test
    public void rollResult_constructorTest() {
        RollResult rollResult = new RollResult(1, 5, "Hello World");
        assertEquals(rollResult.getMinRoll(), 1);
        assertEquals(rollResult.getMaxRoll(), 5);
        assertEquals(rollResult.getResultDesc(), "Hello World");
    }

}
