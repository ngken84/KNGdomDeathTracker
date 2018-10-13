package joker.persona.ngrocken.kngdomdeathtracker.model.effects;

import java.util.LinkedList;
import java.util.List;

public class EndeavorEvent {

    private int endeavorCost;
    private String description;
    private List<RollResult> resultList;


    public EndeavorEvent(int endeavorCost, String description) {
        this.endeavorCost = endeavorCost;
        this.description = description;
    }

    public int getEndeavorCost() {
        return endeavorCost;
    }

    public String getDescription() {
        return description;
    }

    public List<RollResult> getResultList() {
        return resultList;
    }

    public void addRollResult(RollResult result) {
        if(resultList == null) {
            resultList = new LinkedList<>();
        }
        resultList.add(result);
    }
}
