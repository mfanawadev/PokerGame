package poker.classes;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CardTest {

	@Test
	void testCardCreation() {
		// The test below asserts the suit and rank of the card object 
		// will yield the equal results with the same strings provide to it
		
		Card card = new Card("♥","A");
		assertEquals("♥", card.getSuit());
		assertEquals("A", card.getRank());
		assertEquals("♥A", card.toString());
		
	}

}
