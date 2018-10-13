package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;


import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.EndeavorEvent;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.RollResult;

import static org.junit.Assert.assertEquals;

public class EffectUnitTests {

    @Test
    public void effect_constructorWorks() {
        Effect.GamePhase phase = Effect.GamePhase.SHOWDOWN;
        String effectString = "Departing Survivors gain + {{1}} survival.";
        int value = 1;
        Effect testEffect = new Effect(phase, effectString, value);
        assertEquals(testEffect.getEffectPhase(), phase);
        assertEquals(testEffect.getEffectText(), effectString);
        assertEquals(testEffect.getEffectValue(), value);
    }

    @Test
    public void endeavor_constructorWorks() {
        int cost = 1;
        String description = "Once per lifetime roll 1d10";
        EndeavorEvent event = new EndeavorEvent(cost, description);
        assertEquals(event.getEndeavorCost(), cost);
        assertEquals(event.getDescription(), description);
    }

    @Test
    public void rollResult_constructorWorks() {
        int min = 1;
        int max = 5;
        String description = "Ruined. Suffer -1 permanent movement.";
        RollResult res = new RollResult(min, max, description);
        assertEquals(res.getMinRoll(), min);
        assertEquals(res.getMaxRoll(), max);
        assertEquals(res.getResultDesc(), description);
    }
}
