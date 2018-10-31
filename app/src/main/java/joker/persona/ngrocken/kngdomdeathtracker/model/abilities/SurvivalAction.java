package joker.persona.ngrocken.kngdomdeathtracker.model.abilities;

public class SurvivalAction {

    private String name;
    private String description;

    public SurvivalAction(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
