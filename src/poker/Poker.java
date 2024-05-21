package poker;

import java.util.List;

import poker.classes.Card;
import poker.classes.Deck;
import poker.classes.HandEvaluation;

/**
 * Main class for running the poker game
 */

public class Poker {

	public static void main(String[] args) {
		
		// Initialize the deck and shuffle it
		Deck deck = new Deck();
		System.out.println("Shuffling...Shuffling...Shuffling...");
		deck.shuffle();
		
		// Deal 5 cards to a player
		List<Card> hand = deck.deal(5);
		System.out.print("Your hand: ");
		for(Card card: hand) {
			System.out.print(card + " ");
		}
		System.out.println();
		
		// Evaluate the player's hand and display the hand strength
		String handValue = HandEvaluation.evaluteHand(hand);
		System.out.println("You have: " + handValue);

	}

}
