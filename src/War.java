import Entities.*;

public class War {

    War() {
        startGame();
    }

    public void startGame() {
        // create the deck and shuffle
        Deck deck = new Deck();
        System.out.println(deck.toString());
        deck.shuffleCards();
        System.out.println(deck.toString());

        // create the hands and discard piles
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        DiscardPile discardPile1 = new DiscardPile();
        DiscardPile discardPile2 = new DiscardPile();

        // split the cards into the players hands
        deck.deal(hand1, hand2);

        // add the hands and discard piles to the players
        Player player1 = new Player(hand1, discardPile1);
        Player player2 = new Player(hand2, discardPile2);




        System.out.println("Player 1");
        System.out.println(hand1.toString());
        System.out.println(discardPile1.toString());
        System.out.println("\nPlayer 2");
        System.out.println(hand2.toString());
    }
}
