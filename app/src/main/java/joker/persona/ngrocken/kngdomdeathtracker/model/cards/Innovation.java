package joker.persona.ngrocken.kngdomdeathtracker.model.cards;

import java.util.LinkedList;
import java.util.List;

import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;
import joker.persona.ngrocken.kngdomdeathtracker.model.effects.EndeavorEvent;

public class Innovation extends Card {

    private String category;
    private String consequenceOf;
    private int survivalLimitBonus;
    private List<Effect> effectList = new LinkedList<>();
    private List<EndeavorEvent> endEventList = new LinkedList<>();
    

    public Innovation(String name, String description, String category, String consequenceOf, int survivalLimitBonus) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.consequenceOf = consequenceOf;
        this.survivalLimitBonus = survivalLimitBonus;
    }

    @Override
    public CardType getCardType() {
        return CardType.INNOVATION;
    }

    public String getConsequenceOf() {
        return consequenceOf;
    }

    public String getCategory() {
        return category;
    }

    public int getSurvivalLimitBonus() {
        return survivalLimitBonus;
    }

    public List<Effect> getEffectList() {
        return effectList;
    }

    public void addEffect(Effect effect) {
        effectList.add(effect);
    }

    public void addAllEffects(Effect... effects) {
        for(Effect effect : effects) {
            addEffect(effect);
        }
    }

    public void addEndeavorEvent(EndeavorEvent event) {
        endEventList.add(event);
    }

    public void addAllEndeavorEvents(EndeavorEvent... events) {
        for(EndeavorEvent event : events) {
            addEndeavorEvent(event);
        }
    }



}
