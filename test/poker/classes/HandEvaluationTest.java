package poker.classes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;

class HandEvaluationTest {

	@Test
	void testHandEvalution() {
		// The test below asserts the given hand strength will be evaluated correctly
		
		List<Card> hand = Arrays.asList(
					new Card("♠", "A"),
					new Card("♠", "K"),
					new Card("♠", "Q"),
					new Card("♠", "J"),
					new Card("♠", "10")
				);
		
		assertEquals("Straight Flush", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♠", "10")
			);
	
		assertEquals("Four of a Kind", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♠", "K"),
				new Card("♠", "K")
			);
	
		assertEquals("Full House", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "A"),
				new Card("♠", "3"),
				new Card("♠", "5"),
				new Card("♠", "7"),
				new Card("♠", "9")
			);
	
		assertEquals("Flush", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "2"),
				new Card("♦", "3"),
				new Card("♠", "4"),
				new Card("♠", "5"),
				new Card("♠", "6")
			);
		
		assertEquals("Straight", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♦", "K"),
				new Card("♦", "K"),
				new Card("♠", "9")
			);
	
		assertEquals("Two Pair", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "A"),
				new Card("♠", "A"),
				new Card("♦", "K"),
				new Card("♠", "Q"),
				new Card("♠", "9")
			);
	
		assertEquals("One Pair", HandEvaluation.evaluteHand(hand));
		
		hand = Arrays.asList(
				new Card("♠", "A"),
				new Card("♠", "2"),
				new Card("♦", "K"),
				new Card("♠", "Q"),
				new Card("♠", "9")
			);
	
		assertEquals("High Card", HandEvaluation.evaluteHand(hand));
		
	}

}
