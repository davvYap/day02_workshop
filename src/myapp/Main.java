package myapp;

import java.io.Console;

public class Main {

    public static void main(String[] args){

        Console cons = System.console();
        int cardNumTotal = Integer.parseInt(cons.readLine("How many cards in total? 52 or 56?\n"));
        Card myCard = new Card(cardNumTotal);

        // check how many cards
        System.out.println("Card number: "+myCard.getNumberOfCards());

        String[] myCardDecks =  myCard.getCardDeck();

        // check the cards
        for (int i = 0; i < myCardDecks.length; i++) {
            System.out.printf("%s ,",myCardDecks[i]);
        }

        System.out.println("\n\n\n");

        // shuffle the cards
        myCard.shuffleDeck();

        // then check the cards again
        System.out.println("After shuffle: ");
        for (int i = 0; i < myCardDecks.length; i++) {
            System.out.printf("%s ,",myCardDecks[i]);
        }

        System.out.println("\n\n\n");

        // take any number of cards
        int cardNum = Integer.parseInt(cons.readLine("How many cards you want to have?\n"));
        String[] newCardDeck = myCard.takeCards(cardNum);

        System.out.println("Choosen cards: ");
        for (int i = 0; i < newCardDeck.length; i++) {
            System.out.printf("Taken new card (%d): %s\n",(i+1),newCardDeck[i]);
        }


    }
    
}
