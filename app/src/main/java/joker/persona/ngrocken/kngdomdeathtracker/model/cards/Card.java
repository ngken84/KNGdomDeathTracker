package joker.persona.ngrocken.kngdomdeathtracker.model.cards;

public abstract class Card {

    public enum CardType {
        INNOVATION
    }

    public static final String SET_DEFAULT = "DEFAULT";

    protected String name;
    protected String description;
    protected String cardSet = SET_DEFAULT;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract CardType getCardType();

    public String getCardSet() {
        return cardSet;
    }

    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }
}
