import Entities.*;

public class War {

    War() {
        startGame();
    }

    public void startGame() {
        // create the deck and shuffle it
        Deck deck = new Deck();
        deck.shuffleCards();

        // create and give the hands to the players
        Hand player1Hand = new Hand();
        Hand player2Hand = new Hand();
        Player player1 = new Player(player1Hand);
        Player player2 = new Player(player2Hand);

        // split the cards into two hands
        deck.deal(player1Hand, player2Hand);
        while (true) {
            if (player1Hand.getCards().isEmpty()) {
                System.out.println("Player 1 ran out of cards and lost the game...Player 2 WINS!!!");
                break;
            } else if (player2Hand.getCards().isEmpty()) {
                System.out.println("Player 2 ran out of cards and lost the game...Player 1 WINS!!!");
                break;
            } else {

                // flip top cards [0] and compare them
                System.out.println("Player 1 card: " + player1Hand.getCards().get(0));
                System.out.println("Player 2 card: " + player2Hand.getCards().get(0));

                // test below
                System.out.println("player 1: " + player1Hand.getCards().size());
                System.out.println("player 2: " + player2Hand.getCards().size());
                // end test

                // player 1 wins hand
                if (player1Hand.getCards().get(0).getRank().getRankValue() > player2Hand.getCards().get(0).getRank().getRankValue()) {
                    System.out.println("Player 1 won that battle!\n");

                    // move those cards on bottom of player1 hand
                    player1Hand.addToHand(player2Hand.getCards().get(0));
                    player2Hand.removeCard();
                    player1Hand.addToHand(player1Hand.getCards().get(0));
                    player1Hand.removeCard();
                }
                // player 2 wins hand
                else if (player1Hand.getCards().get(0).getRank().getRankValue() < player2Hand.getCards().get(0).getRank().getRankValue()) {
                    System.out.println("Player 2 won that battle!\n");

                    // move those cards on bottom of player2 hand
                    player2Hand.addToHand(player1Hand.getCards().get(0));
                    player1Hand.removeCard();
                    player2Hand.addToHand(player2Hand.getCards().get(0));
                    player2Hand.removeCard();
                }
                // tie, go to WAR
                else {
                    System.out.println("This battle is a tie, it's time for War!\n");
                    goToWar(player1Hand, player2Hand);
                }
            }
        }
    }

    // method to handle tiebreakers
    private void goToWar(Hand player1Hand, Hand player2Hand) {
        int index = 2;
        while (true) {
            if (player1Hand.getCards().size() < index + 1) {
                System.out.println("Player 1 ran out of cards and lost the game...Player 2 WINS!!!");
                return;
            } else if (player2Hand.getCards().size() < index + 1) {
                System.out.println("Player 2 ran out of cards and lost the game...Player 1 WINS!!!");
                return;
            } else if (player1Hand.getCards().get(index).getRank().getRankValue() > player2Hand.getCards().get(index).getRank().getRankValue()) {
                System.out.println("Player 1 won that War!\n");

                // for loop here to add all the winning cards
                for (int j = index; j >= 0; j--) {
                    player1Hand.addToHand(player2Hand.getCards().get(j));
                    player2Hand.removeCard();
                    player1Hand.addToHand(player1Hand.getCards().get(j));
                    player1Hand.removeCard();
                }
                break;
            } else if (player1Hand.getCards().get(index).getRank().getRankValue() < player2Hand.getCards().get(index).getRank().getRankValue()) {
                System.out.println("Player 2 won that War!\n");
                for (int j = index; j >= 0; j--) {
                    player2Hand.addToHand(player1Hand.getCards().get(j));
                    player1Hand.removeCard();
                    player2Hand.addToHand(player2Hand.getCards().get(j));
                    player2Hand.removeCard();
                }
                break;
            } else {
                System.out.println("This battle is another tie, it's to War again!\n");
                index += 2;
            }
        }
    }
}

