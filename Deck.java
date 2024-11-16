package week6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();
		populateDeck();
	}
	
	private void populateDeck() {
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		
		int value = 2;
		
		for (String name : names) {
			for (String suit : suits) {
				cards.add(new Card(value, name + " of " + suit));
			}
			value++;
			}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		if (cards.size() > 0) {
			return cards.remove(0);
		} else {
			return null;
		}
	}
	
	public List<Card> getCards() {
		return cards;
	}
}
