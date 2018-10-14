package joker.persona.ngrocken.kngdomdeathtracker.model.effects;

public class Effect {

    public enum GamePhase {
        SETTLEMENT, SHOWDOWN, HUNT, ALL
    }

    private GamePhase effectPhase;
    private String effectText;
    private int effectValue;

    public Effect(GamePhase effectPhase, String effectText, int effectValue) {
        this.effectPhase = effectPhase;
        this.effectText = effectText;
        this.effectValue = effectValue;
    }

    public Effect(GamePhase effectPhase, String effectText) {
        this.effectPhase = effectPhase;
        this.effectText = effectText;
        this.effectValue = 0;
    }

    public GamePhase getEffectPhase() {
        return effectPhase;
    }

    public void setEffectPhase(GamePhase effectPhase) {
        this.effectPhase = effectPhase;
    }

    public String getEffectText() {
        return effectText;
    }

    public void setEffectText(String effectText) {
        this.effectText = effectText;
    }

    public int getEffectValue() {
        return effectValue;
    }

    public void setEffectValue(int effectValue) {
        this.effectValue = effectValue;
    }
}
