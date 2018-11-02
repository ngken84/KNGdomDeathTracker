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
        Innovation card = new Innovation("Scarification", "", "faith",
                "inner lantern", 0);
        return card;
    }

    //TO-DO Add Endeavor Events
    public static Innovation createFacePaintingInnovation() {
        Innovation card = new Innovation("Face Painting", "", "art",
                "paint", 0);
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
        Innovation card = new Innovation("Bloodletting", null, "science",
                "ammonia", 0);
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
        Innovation card = new Innovation("Partnership", null, "home",
                "hovel", 0);
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
        Innovation card = new Innovation("Ammonia", "A pungent, bilious substance " +
                "ideal for crafting leather and treating wounds.", "science",
                "language", 0);
        card.addEffect(createDepartingSurvivalEffect());
        return card;
    }

    //TO-DO Add Survival Action
    public static Innovation createPaintInnovation() {
        Innovation card = new Innovation("Paint", "The settlement swells with " +
                "creative energy. All survivors gain the <b>Dash</b> survival action.",
                "art", "language", 0);
        return card;
    }

    //TO-DO Add Effects
    public static Innovation createSongOfTheBraveInnovation() {
        Innovation card = new Innovation("Song of the Brave", null, "music",
                "drums", 0);
        return card;
    }

    //TO-DO Add Events
    public static Innovation createScupltureInnovation() {
        Innovation card = new Innovation("Sculpture", null, "art",
                "paint", 0);
        return card;
    }

    //TO-DO Add Effects
    public static Innovation createPictographInnovation() {
        Innovation card = new Innovation("Pictograph", null, "art",
                "paint", 0);
        return card;
    }

    //TO-DO Add Effects
    public static Innovation createBarbaricInnovation() {
        Innovation card = new Innovation("Barbaric", "Believe in the power of human " +
                "strength to overcome any obstacle", "conviction principle",
                null, 1);
        return card;
    }

    //TO-DO add event
    public static Innovation createScrapSmeltingInnovation() {
        Innovation card = new Innovation("Scrap Smelting", null,
                "science", "lantern oven", 0);
        return card;
    }

    //TODO add event
    public static Innovation createCookingInnovation() {
        Innovation card = new Innovation("Cooking", null, "science",
                "lantern oven", 1);
        return card;
    }

    //TODO add effect
    public static Innovation createSurvivalOfTheFittest() {
        Innovation card = new Innovation("Survival of the Fittest", null,
                "new life principle",null,1);
        return card;
    }

    //TODO add unlock
    public static Innovation createLanternOvenInnovation() {
        Innovation card = new Innovation("Lantern Oven", "By agitating lanterns, a " +
                "source of <b>Heat</b> becomes available to the settlement.", "science",
                "ammonia", 0);
        card.addEffect(createDepartingSurvivalEffect());
        return card;
    }

    //TODO add event
    public static Innovation createGuidepostInnovation() {
        Innovation card = new Innovation("Guidepost", "The soft glow of its light " +
                "fills the survivors with a sense of security.", "other",
                null, 0);
        card.addEffect(createDepartingSurvivalEffect());
        return card;
    }

    //TODO Add Events
    public static Innovation createRecordsInnovation() {
        Innovation card = new Innovation("Records", null, "education",
                "storytelling", 0);
        return card;
    }

    //TODO Add Events
    public static Innovation createStorytellingInnovation() {
        Innovation card = new Innovation("Storytelling", null, "education",
                "symposium", 1);
        return card;
    }

    //TODO Add Events
    public static Innovation createMomentoMoriInnovation() {
        Innovation card = new Innovation("Momentor Mori", null, "art",
                "pictograph", 0);
        return card;
    }

    //TODO Add Events
    public static Innovation createPotteryInnovation() {
        Innovation card = new Innovation("Pottery", null, "art",
                "sculpture", 1);
        return card;
    }

    //TODO Add Events
    public static Innovation createHeartFluteInnovation() {
        Innovation card = new Innovation("Heart Flute", null, "music",
                "forbidden dance", 0);
        return card;
    }

    //TODO Add Ability
    public static Innovation createDestinyInnovation() {
        Innovation card = new Innovation("Destiny", "The settlement's future is " +
                "unavoidable. All Survivors gain the <b>Endure</b> surival action.",
                "faith", null, 1);
        return card;
    }

    //TODO Add Effect
    public static Innovation createUltimateWeaponInnovation() {
        Innovation card = new Innovation("Ultimate Weapon", null, "science",
                null, 1);
        return card;
    }

    //TODO Add Effect
    public static Innovation createFinalFightingArtInnovation() {
        Innovation card = new Innovation("Final Fighting Art", null,
                "education", null, 1);
        return card;
    }

    //TODO Add Event
    public static Innovation createSacrificeInnovation() {
        Innovation card = new Innovation("Sacrifice", null, "faith",
                "shrine", 0);
        return card;
    }

    //TODO Add Event
    public static Innovation createNightmareTrainingInnovation() {
        Innovation card = new Innovation("Nightmare Training", null,
                "education", "symposium", 0);
        return card;
    }

    //TODO Add Effect
    public static Innovation createCannibalizeInnovation() {
        Innovation card = new Innovation("Cannibalize", null,
                "death principle", null, 1);
        return card;
    }

    //TODO Add Effect
    public static Innovation createAcceptDarknessInnovation() {
        Innovation card = new Innovation("Accept Darkness", "The settlement no " +
                "longer fears the darkness. Letting go means your resolve cannot be cracked",
                "society principle", null, 0);
        return card;
    }

    //TODO Add Effect
    public static Innovation createCollectiveToilInnovation() {
        Innovation card = new Innovation("Collective Toil", "Your settlement leans " +
                "into the storm. If everyone holds strong, you will triumph.",
                "society principle", null, 0);
        return card;
    }

    //TODO Add Effect
    public static Innovation createRomanticInnovation() {
        Innovation card = new Innovation("Romantic", "Believe in the potential for " +
                "beauty, decency, and ingenuity in others.", "conviction principle",
                null, 0);
        return card;
    }

    public static Effect createDepartingSurvivalEffect() {
        return new Effect(Effect.GamePhase.HUNT, "<b>Departing Survivors</b> gain +{{v}} survival", 1);
    }

}
