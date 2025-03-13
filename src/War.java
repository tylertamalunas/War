import Entities.Deck;
import Entities.Player;

public class War {

    War() {
        startGame();
    }

    public void startGame() {
        while(gameOver()) {
            Deck.deal();
        }
    }
    public boolean gameOver() {
        if ()
    }
}
