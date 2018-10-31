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

    public static Innovation createGravesInnovation() {
        Innovation card = new Innovation("Graves", "", "death principle", null, 0);
        card.addEffect(new Effect(Effect.GamePhase.SETTLEMENT, "All new survivors gain " +
                "+{{v}} understanding.", 1));
        card.addEffect(new Effect(Effect.GamePhase.HUNT_SHOWDOWN, "When a survivor dies " +
                "during the hunt or showdown phase, gain +2{{e}}"));
        card.addEffect(new Effect(Effect.GamePhase.SETTLEMENT, "When a survivor dies during " +
                "the settlement phase, gain +1{{e}}."));
        return card;
    }

    public static Innovation createSymposiumInnovation() {
        Innovation card = new Innovation("Symposium", "", "education", "language", 1);
        card.addEffect(new Effect(Effect.GamePhase.SETTLEMENT, "When a survivor innovates, " +
                "draw an additional 2 innovation Cards to choose from."));
        return card;
    }

    public static Innovation createBedInnovation() {
        Innovation card = new Innovation("Bed", "", "home", "hovel", 1);
        EndeavorEvent event = new EndeavorEvent(1, "Rest - roll 1d10");
        RollResult result1 = new RollResult(1,3, "Nightmares. Gain +1 insanity");
        RollResult result2 = new RollResult(4, 0, "You cannot endeavor again" +
                " this settlement phase. Skip the next hunt. You may remove on of the following: <br><br>" +
                " - All <b>Broken Arm</b> severe injuries. <br>" +
                " - All <b>Broken Hip</b> severe injuries. <br>" +
                ""); // TO-DO : finish this one
        event.addAllRollResults(result1, result2);
        card.addEndeavorEvent(event);
        return card;
    }

    //TO-DO Add Endeavor Event
    public static Innovation createScarificationInnovation() {
        Innovation card = new Innovation("Scarification", "", "faith", "inner lantern", 0);
        return card;
    }

    //TO-DO Add Endeavor Events
    public static Innovation createFacePaintingInnovation() {
        Innovation card = new Innovation("Face Painting", "", "art", "paint", 0);
        return card;
    }

    //TO-DO Add Effect
    public static Innovation createSagaInnovation() {
        Innovation card = new Innovation("Saga", "A telling of the settlement's " +
                "survival set to a soft rhythmic beating of drums.", "music",
                "song of the brave", 0);
        return card;
    }

    //TO-DO Add Effect
    public static Innovation createClanOfDeathInnovation() {
        Innovation card = new Innovation("Clan of Death", "The enduring strength of " +
                "your clan passes through generations.", "home", "family", 0);
        return card;
    }

    //TO-DO Add Event
    public static Innovation createBloodlettingInnovation() {
        Innovation card = new Innovation("Bloodletting", null, "science", "ammonia", 0);
        return card;
    }

    //TO-DO Add Event
    public static Innovation createShrineInnovation() {
        Innovation card = new Innovation("Shrine",
                "May be used once per settlement phase.", "faith",
                "inner lantern", 0);
        return card;
    }

    //TO-DO Add Survival Action
    public static Innovation createInnerLanternInnovation() {
        Innovation card = new Innovation("Inner Lantern", "The settlement finds the " +
                "light within. All survivors gain the <b>Surge</b> survival action.",
                "faith", "language", 0);
        return card;
    }

    //TO-DO Add Survival Action
    public static Innovation createLanguageInnovation() {
        Innovation card = new Innovation("Language", "All survivors gain the " +
                "<b>Encourage</b> survival action.", "starting innovation",
                null, 1);
        return card;
    }

    //TO-DO Add Event
    public static Innovation  createPartnershipInnovation() {
        Innovation card = new Innovation("Partnership", null, "home", "hovel", 0);
        return card;
    }

    //TO-DO Add Effect
    public static Innovation createHovelInnovation() {
        Innovation card = new Innovation("Hovel",
                "The settlement accepts this nightmarish landscape as their home.",
                "home", "language", 1);
        return card;
    }

    public static Innovation createAmmoniaInnovation() {
        Innovation card = new Innovation("Ammonia", "A pungent, billious substance ideal for crafting leather and treating wounds.", "science", "language", 0);
        card.addEffect(createDepartingSurvivalEffect());
        return card;
    }



    public static Effect createDepartingSurvivalEffect() {
        return new Effect(Effect.GamePhase.HUNT, "<b>Departing Survivors</b> gain +{{v}} survival", 1);
    }

}
