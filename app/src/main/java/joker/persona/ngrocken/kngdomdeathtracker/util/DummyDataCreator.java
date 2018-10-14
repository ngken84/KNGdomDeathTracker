package joker.persona.ngrocken.kngdomdeathtracker.util;

import joker.persona.ngrocken.kngdomdeathtracker.model.cards.Innovation;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.EndeavorEvent;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.RollResult;

public class DummyDataCreator {

    public static Innovation createForbiddenDanceInnovation() {
        Innovation card = new Innovation("Forbidden Dance", "", "music", "drums", 0);
        Effect bonus = new Effect(Effect.GamePhase.SHOWDOWN, "When a survivor uses the " +
                "<b>Synchronized Strike</b> secret fighting art, reroll missed attack rolls once.");
        card.addEffect(bonus);
        EndeavorEvent event = new EndeavorEvent(1, "Once per lifetime roll 1d10");
        RollResult rollOne = new RollResult(1,5, "Ruined. Suffer -1 permanent movement.");
        RollResult rollTwo = new RollResult(6,9, "Perfect! Gaine +1 Permanent Evasion.");
        RollResult rollThree = new RollResult(10, 0, "Gain the <b>King's Step</b> secret fighting art.");
        event.addAllRollResults(rollOne, rollTwo, rollThree);
        card.addEndeavorEvent(event);
        return card;
    }

    public static Innovation createFamilyInnovation() {
        Innovation card = new Innovation("Family", "", "home", "hovel", 0);
        card.addEffect(createDepartingSurvivalEffect());
        card.addEffect(new Effect(Effect.GamePhase.SETTLEMENT, "Survivors nominated for " +
                "<b>intimacy</b> may give themselves a surname if they do not have one.<br>A newborn " +
                "survivor inherits the surname of one parent, their weapon type, and half " +
                "(rounded-down) of their weapon proficiency levels.", 0));

        return card;
    }

    public static Effect createDepartingSurvivalEffect() {
        return new Effect(Effect.GamePhase.HUNT, "<b>Departing Survivors</b> gain +{{v}} survival", 1);
    }

}
