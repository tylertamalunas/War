package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class CardCollection {
    protected ArrayList<Card> cards;

    public CardCollection() {
        cards = new ArrayList<>();
    }

    // sort the cards in the Deck/Hand into a random order using the Fisher-Yates shuffle algorithm.
    // Linear Time, but this is dealing with small lists, so it works best.
    public void shuffleCards() {
        System.out.println("Shuffling....");
        Random rand = new Random();

        // start from last element, dont need to use on first element
        for (int i = cards.size()-1; i > 0; i--) {

            // pick random index from 0 to i
            int index = rand.nextInt(i+1);

            // swap i with randomly chosen element
            Card temp = cards.get(i);
            cards.set(i, cards.get(index));
            cards.set(index, temp);
        }
    }

    // add a card to the pile
    public void addCard(Card card) {
        cards.add(card);
    }

    // remove a card from the pile
    public Card removeCard() {
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "cards = " + cards;
    }
}
