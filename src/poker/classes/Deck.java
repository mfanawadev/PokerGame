package poker.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Represents a deck of 52 cards
 */

public class Deck {
	private List<Card> cards;
	
	/**
	 * Constructor initializes a deck of 52 cards
	 */
	
	public Deck() {
		String[] suits = {"♥","♦","♠","♣"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		cards = new ArrayList<>();
		
		for(String suit: suits) {
			for(String rank: ranks) {
				cards.add(new Card(suit, rank));
			}
		}
	}
	
	/**
	 * Shuffles the deck in a random order
	 */
	
	public void shuffle() {
		Collections.shuffle(cards, new Random());
	}
	
	/**
	 * Deals the specified number of cards from the deck
	 * 
	 * @param numberOfCards the number of cards to deal
	 * @return a list of dealt cards
	 */
	
	public List<Card> deal(int numberOfCards){
		List<Card> hand = new ArrayList<> ();
		for(int i = 0; i < numberOfCards; i++) {
			hand.add(cards.remove(i));
		}
		
		return hand;
	}
	
	/**
	 * @return the size of the deck
	 */
	
	public int getDeckSize() {
		return cards.size();
	}

}
