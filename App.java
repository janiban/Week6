package week6;

public class App {
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Player player1 = new Player("Player 1");
		Player player2 = new Player("Player 2");
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }
		
		for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();
            
            System.out.println("Round " + (i + 1) + ":");
            System.out.println(player1.getName() + " plays " + player1Card.getName() + " (Value: " + player1Card.getValue() + ")");
            System.out.println(player2.getName() + " plays " + player2Card.getName() + " (Value: " + player2Card.getValue() + ")");
            
            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " wins this round!");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " wins this round!");
            } else {
                System.out.println("It's a tie! No points awarded.");
            }

            System.out.println();
        }
		
		System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player2.getScore() > player1.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
	}
}
