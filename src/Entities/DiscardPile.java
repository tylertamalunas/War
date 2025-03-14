package Entities;

public class DiscardPile extends CardCollection{

    public DiscardPile(){
        super();
    }

    public void addToDiscardPile(Card card){
        addCard(card);
    }
}


// is this really needed? can i just transfer the played cards to the hand?