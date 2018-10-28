package joker.persona.ngrocken.kngdomdeathtracker.model.effects;

import java.util.Comparator;

public class RollResult {

    private int minRoll;
    private int maxRoll;
    private String resultDesc;

    public RollResult(int minRoll, int maxRoll, String resultDesc) {
        this.minRoll = minRoll;
        this.maxRoll = maxRoll;
        this.resultDesc = resultDesc;
    }

    public int getMinRoll() {
        return minRoll;
    }

    public int getMaxRoll() {
        return maxRoll;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public static class RollResultComparator implements Comparator<RollResult> {

        @Override
        public int compare(RollResult rollResult, RollResult t1) {
            return rollResult.getMinRoll() - t1.getMinRoll();
        }
    }
}
