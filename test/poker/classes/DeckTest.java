package poker.classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class DeckTest {

	@Test
	void testDeckCreation() {
		// The test below ensures that after a hand is dealt with a number of cards 
		// the deck size should decrease with the same number of cards provided
		
		Deck deck = new Deck();
		List<Card> hand = deck.deal(5);
		
		assertEquals(5, hand.size());
		assertEquals(47, deck.getDeckSize());
	}
	
	@Test
	void testShuffle() {
		// Compares two decks with one shuffled to assert they will not be equal
		
		Deck deckOne = new Deck();
		Deck deckTwo = new Deck();
		
		deckOne.shuffle();
		
		assertNotEquals(deckOne,deckTwo);
		
	}

}
