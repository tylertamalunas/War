package Entities;

import java.util.ArrayList;
import java.util.Random;

import static Entities.Card.Rank.ranks;
import static Entities.Card.Suit.suits;

public class Deck {
    // two decks, "Hand" and "Discard"
    // they are arrays that get randomized when shuffled
    // when "Hand" is empty, "Discard" gets randomized and moved to "Hand"

    public static ArrayList<Card> startingDeck;
    public static ArrayList<Card> player1Hand;
    public static ArrayList<Card> player1Discard;
    public static ArrayList<Card> player2Hand;
    public static ArrayList<Card> player2Discard;
    private static Card[] cards;

    // fill in deck with card values and suits
    public static void buildStartingDeck() {
        startingDeck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card(ranks[j], suits[i]);
                startingDeck.add(card);
            }
        }
//        System.out.println("Building Deck");
//        System.out.println(startingDeck.toString());
    }

    // sort the cards in the Deck/Hand into a random order using the Fisher-Yates shuffle algorithm.
    // Linear Time, but this is dealing with small lists, so it works best.
    public static void shuffle(ArrayList<Card> deck) {
        Random rand = new Random();

        // start from last element, dont need to use on first element
        for (int i = deck.size()-1; i > 0; i--) {

            // pick random index from 0 to i
            int index = rand.nextInt(i+1);

            // swap i with randomly chosen element
            Card temp = deck.get(i);
            deck.set(i, deck.get(index));
            deck.set(index, temp);
        }
//        System.out.println("Shuffling Deck");
//        System.out.println(deck.toString());
    }

    // only happens at game start, shuffles deck, and splits deck in half to give to players hands
    public static void deal() {
        player1Hand = new ArrayList<>();
        player1Discard = new ArrayList<>();
        player2Hand = new ArrayList<>();
        player2Discard = new ArrayList<>();

        buildStartingDeck();
        shuffle(startingDeck);

        // split deck into player hands
        for (int i = 0; i < 26; i++) {
            player1Hand.add(startingDeck.get(i));
        }
        for (int i = 26; i < 52; i++) {
            player2Hand.add(startingDeck.get(i));
        }
        System.out.println("Player 1");
        System.out.println("Hand size " + player1Hand.size());
        System.out.println("Discard size " + player1Discard.size());
        System.out.println(player1Hand.toString());
        System.out.println("\nPlayer 2");
        System.out.println("Deck size " + player2Hand.size());
        System.out.println("Discard size " + player2Discard.size());
        System.out.println(player2Hand.toString());
    }

    public static void whatNow()
}
