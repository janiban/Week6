package week6;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		this.hand = new ArrayList<>();
		this.score = 0;
		this.name = name;
		
	}
	
	public void describe() {
		System.out.println("Player: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand:" + hand);
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		if (hand.size() > 0) {
			return hand.remove(0);
		} else {
			return null;
		}
	}
	
	public void draw(Deck deck) {
		Card drawnCard = deck.draw();
		if (drawnCard != null) {
			hand.add(drawnCard);
		}
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Card> getHand() {
		return hand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
