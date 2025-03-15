import Entities.*;

public class War {

    War() {
        startGame();
    }

    public void startGame() {
        // create the deck and shuffle
        Deck deck = new Deck();
        deck.shuffleCards();

        // create the hands and discard piles
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();

        // split the cards into the players hands
        deck.deal(hand1, hand2);

        // add the hands and discard piles to the players
        Player player1 = new Player(hand1);
        Player player2 = new Player(hand2);




        System.out.println("Player 1");
        System.out.println(hand1.toString());
        System.out.println("\nPlayer 2");
        System.out.println(hand2.toString());
        System.out.println(discardPile2.toString());
    }
}
