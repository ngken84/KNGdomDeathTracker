package joker.persona.ngrocken.kngdomdeathtracker;

import org.junit.Test;


import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;

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
}
