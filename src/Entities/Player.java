package Entities;

public class Player {
    // two players, each assigned a "Hand" and "Discard" deck
    // when both decks are empty, that player loses

    private Deck hand;
    private Deck discard;

    public Player(Deck hand, Deck discard) {
        this.hand = hand;
        this.discard = discard;
    }

    public Deck getHand() {
        return hand;
    }

    public Deck getDiscard() {
        return discard;
    }

    public void setHand(Deck hand) {
        this.hand = hand;
    }

    public void setDiscard(Deck discard) {
        this.discard = discard;
    }
}
