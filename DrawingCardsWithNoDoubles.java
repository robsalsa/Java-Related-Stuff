package Homework1_OddNumbers_and_Cards;
import java.util.*;

public class DrawingCardsWithNoDoubles {
    public static void main(String[] args) {
    	System.out.println("          _____");
    	System.out.println("         |A .  | _____");
    	System.out.println("         | /.\\ ||A ^  | _____");
    	System.out.println("         |(_._)|| / \\ ||A _  | _____");
    	System.out.println("         |  |  || \\ / || ( ) ||A_ _ |");
    	System.out.println("         |____V||  .  ||(_'_)||( v )|");
    	System.out.println("                |____V||  |  || \\ / |");
    	System.out.println("                       |____V||  .  |");
    	System.out.println("                              |____V|");
        Scanner something = new Scanner(System.in);
        System.out.println("Enter the number of card pulls:");
        int pulls = something.nextInt();
        
        
        Deck yugiohDeck = new Deck();
        yugiohDeck.GotchaPulls(pulls);
        yugiohDeck.Reveal();

        something.close();
    }
}

class Deck {
    private String[] suit = {"Club", "Heart", "Diamonds", "Spade"};
    private String[] value = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private ArrayList<Card> cards = new ArrayList<>();

    public void GotchaPulls(int pulls) {
        // Quick validation
        if (pulls < 0 || pulls > 52) {
            System.out.println("Invalid number of card pulls. Please choose a number between 0 and 52.");
            return;
        }
        Random random = new Random();

        for (int innie = 0; innie < pulls; innie++) {
            String randomSuit;
            String randomValue;

            do {
                randomSuit = suit[random.nextInt(suit.length)];
                randomValue = value[random.nextInt(value.length)];
            } while (isCardInDeck(randomSuit, randomValue));

            cards.add(new Card(randomSuit, randomValue));
        }
    }

    private boolean isCardInDeck(String suit, String value) {
        for (Card card : cards) {
            if (card.getSuit().equals(suit) && card.getValue().equals(value)) {
                return true; 
            }
        }
        return false;
    }

    public void Reveal() {
        System.out.println("Your hand: ");
        for (Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }
}


class Card {
    private String suit;
    private String value;

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public String getValue() {
        return value;
    }
}