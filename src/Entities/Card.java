package Entities;

public class Card {
    // 52 cards, standard cards in a deck
    // Ace is always Highest value at 52
    // could potentially add joker for some shennanigans

    public enum Suit {
        HEARTS(1),
        DIAMONDS(2),
        SPADES(3),
        CLUBS(4);    // values of the enumeration

        static final Suit[] suits = Suit.values(); // array filled with all the enumeration values
        private final int suitValue;

        Suit(int suitValue) {
            this.suitValue = suitValue;
        }

        public int getSuitValue() {
            return suitValue;
        }

        public static Suit getSuit(int i) {
            return Suit.suits[i];
        }
    }

    public enum Rank {
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);

        static final Rank[] ranks = Rank.values();
        private final int rankValue;

        Rank(int value) {
            this.rankValue = value;
        }

        public int getRankValue() {
            return rankValue;
        }

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

