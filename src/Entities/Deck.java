package Entities;

import java.util.ArrayList;

import static Entities.Card.Rank.ranks;
import static Entities.Card.Suit.suits;

public class Deck extends CardCollection{

    public Deck() {
        super();
        buildDeck();
    }

    // fill in deck with card values and suits
    private void buildDeck() {
        cards = new ArrayList<>();

        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                Card card = new Card(ranks[j], suits[i]);
                cards.add(card);
            }
        }
    }

    // only happens at game start, shuffles deck, and splits deck in half to give to players hands
    // currently hardcoded for only 2 players
    public void deal(Hand player1Hand, Hand player2Hand) {

        // split deck into player hands
        for (int i = 0; i < 26; i++) {
            player1Hand.addCard(cards.get(i));
        }
        for (int i = 26; i < 52; i++) {
            player2Hand.addCard(cards.get(i));
        }
    }
}
