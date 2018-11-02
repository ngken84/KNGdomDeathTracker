package joker.persona.ngrocken.kngdomdeathtracker.model.effects;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EndeavorEvent {

    private int endeavorCost;
    private String description;
    private String condition;
    private List<RollResult> resultList = new LinkedList<>();


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
        resultList.add(result);
        Collections.sort(resultList, new RollResult.RollResultComparator());
    }

    public void addAllRollResults(RollResult... rollResults) {
        for(RollResult result : rollResults) {
            resultList.add(result);
        }
        Collections.sort(resultList, new RollResult.RollResultComparator());
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
