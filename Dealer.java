import java.util.*;

public class Dealer {
    private Stack<Card> deck;

    public Dealer() {
        deck = new Stack<>();
        createDeck();
    }

    private void createDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Jack", "Queen", "King", "Ace" };

        List<Card> tempDeck = new ArrayList<>();

        for (String suit : suits) {
            for (String rank : ranks)
            {
                tempDeck.add(new Card(rank, suit));
            }
        }

        // Shuffle the cards
        Collections.shuffle(tempDeck);

        // Push into stack
        for (Card card : tempDeck) {
            deck.push(card);
        }
    }

    public void pickRandomCard() {
        if (!deck.isEmpty()) {
            Card card = deck.pop();
            System.out.println("Picked card: " + card);
        } else {
            System.out.println("No more cards in the deck!");
        }
    }
}