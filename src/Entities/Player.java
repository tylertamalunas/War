package Entities;

public class Player {
    // two players, each assigned a "Hand" and "Discard" deck
    // when both decks are empty, that player loses

    private Hand hand;
    private DiscardPile discard;

    public Player(Hand hand, DiscardPile discard) {
        this.hand = hand;
        this.discard = discard;
    }

    public Hand getHand() {
        return hand;
    }

    public DiscardPile getDiscard() {
        return discard;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setDiscard(DiscardPile discard) {
        this.discard = discard;
    }
}
