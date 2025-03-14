package Entities;

public class Hand extends CardCollection{

    public Hand() {
        super();
    }

    public void addToHand(Card card) {
        addCard(card);
    }
}
