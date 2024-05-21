package poker.classes;

/**
 * Represents a single playing card with a suit and rank
 */
public class Card {
	
	private String suit;
	private String rank;
	
	/**
	 * Constructor to create a card with a specific suit and rank
	 * 
	 * @param suit
	 * @param rank
	 */
	public Card(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	/**
	 * @return the suit of the card
	 */
	public String getSuit() {
		return suit;
	}

	/**
	 * @return the rank of the card
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @return a string with a combination of the suit and rank
	 */
	@Override
	public String toString() {
		return  suit + rank;
	}
	
}
