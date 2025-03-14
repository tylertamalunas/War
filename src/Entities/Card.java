package Entities;

public class Card {
    // 52 cards, standard cards in a deck
    // Ace is always Highest value at 52
    // could potentially add joker for some shennanigans

    public enum Suit {
        HEARTS, DIAMONDS, SPADES, CLUBS;    // values of the enumeration

        static final Suit[] suits = Suit.values(); // array filled with all the enumeration values
        public static Suit getSuit(int i) {
            return Suit.suits[i];
        }
    }

    public enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE;

        static final Rank[] ranks = Rank.values();
        public static Rank getRank(int i) {
            return Rank.ranks[i];
        }
    }

    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }
    public Suit getSuit() {
        return suit;
    }
    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}

