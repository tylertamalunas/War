package Entities;

public class cards {
    // 52 cards, standard cards in a deck
    // Ace is always Highest value at 52
    // could potentially add joker for some shennanigans

    private int cardValue;
    private String cardName;
    private String cardSuit;

    public cards(int cardValue, String cardName, String cardSuit) {
        this.cardValue = cardValue;
        this.cardName = cardName;
        this.cardSuit = cardSuit;
    }


    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
    }

    public String getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(String cardSuit) {
        this.cardSuit = cardSuit;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
}
