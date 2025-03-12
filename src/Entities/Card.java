package Entities;

public class Card {
    // 52 cards, standard cards in a deck
    // Ace is always Highest value at 52
    // could potentially add joker for some shennanigans

    private final int cardValue;
    private final String cardName;
    private final String cardSuit;

    public Card(int cardValue, String cardName, String cardSuit) {
        this.cardValue = cardValue;
        this.cardName = cardName;
        this.cardSuit = cardSuit;
    }


    public int getCardValue() {
        return cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public String getCardName() {
        return cardName;
    }

}
