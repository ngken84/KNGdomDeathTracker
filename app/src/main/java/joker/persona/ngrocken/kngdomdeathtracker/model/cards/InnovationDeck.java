package joker.persona.ngrocken.kngdomdeathtracker.model.cards;

import java.util.Arrays;
import java.util.LinkedList;

public class InnovationDeck {

    private LinkedList<Innovation> allCardList = new LinkedList<>();

    public void addInnovationCards(Innovation... cards) {
        allCardList.addAll(Arrays.asList(cards));
    }
    

}
