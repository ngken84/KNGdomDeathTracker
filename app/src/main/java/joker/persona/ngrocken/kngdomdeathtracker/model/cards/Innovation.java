package joker.persona.ngrocken.kngdomdeathtracker.model.cards;

import java.util.List;

import joker.persona.ngrocken.kngdomdeathtracker.model.effects.Effect;

public class Innovation extends Card {

    private String consequence;
    private String consequenceOf;
    private int survivalLimitBonus;
    private List<Effect> effectList;


    @Override
    public CardType getCardType() {
        return CardType.INNOVATION;
    }








}
