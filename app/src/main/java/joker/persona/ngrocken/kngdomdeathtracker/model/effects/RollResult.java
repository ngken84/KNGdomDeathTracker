package joker.persona.ngrocken.kngdomdeathtracker.model.effects;

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
}
