package myapp;

import java.util.Random;

public class Card{

    // fields
    private int numberOfCards;
    private String[] selectedCardDeck;

    // constructors
    public Card(int cardNumbers){
        this.numberOfCards = cardNumbers;

        if(this.numberOfCards == 52){
            this.selectedCardDeck = createDeck52();
        }else{
            this.selectedCardDeck = createDeck56();
        }
    }


    // get and set
    public void setCardDeck(){
        if(this.numberOfCards == 52){
            this.selectedCardDeck = createDeck52();
        }else{
            this.selectedCardDeck = createDeck56();
        }
    }

    public int getNumberOfCards() {
        return numberOfCards;
    }

    public String[] getCardDeck(){
        return this.selectedCardDeck;
    }

    



    // methods to create decks
    public String[] createDeck52(){
        String[] cardDeck = new String[52]; 
    
        int i = 0;
        int position = 0;
        int cardNumber = 2;
    
        // put number cards in the deck
        while(i<(36/4)){
            int j = 0;
            while(j<4){
                cardDeck[position] = String.valueOf(cardNumber);
                position++;
                j++;
            }
            i++;
            cardNumber++;
        }
    
        // put letter cards in the deck 
        for(int j=0;j<4;j++){
            cardDeck[position] = "J";
            position++;
        }
        for(int j=0;j<4;j++){
            cardDeck[position] = "Q";
            position++;
        }
        for(int j=0;j<4;j++){
            cardDeck[position] = "K";
            position++;
        }
        for(int j=0;j<4;j++){
            cardDeck[position] = "A";
            position++;
        }
    
        // for(int j=0;j<cardDeck.length;j++){
        //     System.out.println("Cards: "+cardDeck[j]);
        // }

        return cardDeck;

    } 

    public String[] createDeck56(){
        String[] cardDeck = new String[56]; // total 36 number cards in a deck, each 4 numbers
    
        int i = 0;
        int position = 0;
        int cardNumber = 2;
    
        // put number cards in the deck
        while(i<(36/4)){
            int j = 0;
            while(j<4){
                cardDeck[position] = String.valueOf(cardNumber);
                position++;
                j++;
            }
            i++;
            cardNumber++;
        }
    
        // put letter cards in the deck 
        for(int j=0;j<4;j++){
            cardDeck[position] = "J";
            position++;
        }
        for(int j=0;j<4;j++){
            cardDeck[position] = "Q";
            position++;
        }
        for(int j=0;j<4;j++){
            cardDeck[position] = "K";
            position++;
        }
        for(int j=0;j<4;j++){
            cardDeck[position] = "A";
            position++;
        }

        for(int j=0;j<4;j++){
            cardDeck[position] = "JOKER";
            position++;
        }
    
        // for(int j=0;j<cardDeck.length;j++){
        //     System.out.println("Cards: "+cardDeck[j]);
        // }

        return cardDeck;

    }


    // method to shuffle decks
    public void shuffleDeck(){
        
        String[] tempCardDeck = this.selectedCardDeck;

        for (int i = 0; i < selectedCardDeck.length; i++) {
            Random rand = new Random();
            int randomPosition = rand.nextInt(this.numberOfCards == 52? 52:56);
            selectedCardDeck[randomPosition] = tempCardDeck[i];
        }
        return;
    }

    // method to take any number of cards
    public String[] takeCards(int numbers){

        String[] takenCardsDeck = new String[numbers];

        for (int i = 0; i < numbers; i++) {
            takenCardsDeck[i] = selectedCardDeck[i];
        }

        return takenCardsDeck;
    }   

}