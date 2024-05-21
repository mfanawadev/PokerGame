package poker.classes;

import java.util.List;


/**
 * Evaluates a poker hand to determine its rank
 */

public class HandEvaluation {
	/**
	 * The method below assess a given hand and provides its strength
	 * 
	 * @param hand is the list of cards representing the hand
	 * @return a string describing the hand's rank
	 */
	
	public static String evaluteHand(List<Card> hand) {
		
		int[] ranksCount = new int[13];
		int[] suitsCount = new int[4];
		String[] suits = {"♥","♦","♠","♣"};
		String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		
		for(Card card: hand) {
			for(int i = 0; i < ranks.length; i++) {
				if(card.getRank().equals(ranks[i])) {
					ranksCount[i]++;
				}
			}
			
			for(int j = 0; j < suits.length; j++) {
				if(card.getSuit().equals(suits[j])) {
					suitsCount[j]++;
				}
			}
		}
		
		boolean flush = false;
		for(int count: suitsCount) {
			if(count == 5) flush = true;
		}
		
		boolean straight = false;
		for(int i = 0; i < ranksCount.length - 4; i++) {
			if(ranksCount[i] == 1 && ranksCount[i+1] == 1 && ranksCount[i+2] == 1 
					&& ranksCount[i+3] == 1 && ranksCount[i+4] == 1) {
				straight = true;
			}
		}
		
		if (flush && straight) return "Straight Flush";
		
		int fourOfAKind = 0;
		int threeOfAKind = 0;
		int pairs = 0;
		
		for(int count: ranksCount) {
			if (count == 4) fourOfAKind++;
			if (count == 3) threeOfAKind++;
			if (count == 2) pairs++;
			
		}
		
		if (fourOfAKind == 1) return "Four of a Kind";
		if (threeOfAKind == 1 && pairs == 1) return "Full House";
		if (flush) return "Flush";
		if(straight) return "Straight";
		if (threeOfAKind == 1) return "Three of a Kind";
		if (pairs == 2) return "Two Pair";
		if (pairs == 1) return "One Pair";
		
		return "High Card";
	}
}
