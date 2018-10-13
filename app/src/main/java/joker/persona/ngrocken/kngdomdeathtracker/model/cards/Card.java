package joker.persona.ngrocken.kngdomdeathtracker.model.cards;

public abstract class Card {

    public enum CardType {
        INNOVATION
    }

    protected String name;
    protected String description;

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
}
