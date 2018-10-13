package joker.persona.ngrocken.kngdomdeathtracker.model.cards;

import java.util.LinkedList;
import java.util.List;

import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;

public class Innovation extends Card {

    private String category;
    private String consequenceOf;
    private int survivalLimitBonus;
    private List<Effect> effectList;

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
        if(effectList == null) {
            effectList = new LinkedList<>();
        }
        effectList.add(effect);
    }



}
