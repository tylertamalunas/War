package Entities;

public class Player {
    // two players, each assigned a "Hand" and "Discard" deck
    // when both decks are empty, that player loses

    private Hand hand;

    public Player(Hand hand) {
        this.hand = hand;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
