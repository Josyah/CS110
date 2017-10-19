// Josyah Morrison
// Lab-05
// Blackjack.java

public class Blackjack {
	private Player player1;
	private Player player2;
	
	public void determineWinner() {
		if(player1.hand <= 21) {
			System.out.println(player1 + " wins.");
		} else if(player2.hand <= 21) {
			System.out.println(player2 + " wins.");
		} else if(player1.hand == player2.hand) {
			System.out.println("It's a tie");
		} else {}
		// allows the game to determine the winner and provide one of the above outputs
	}
	public void playGame(Player newPlayer1, Player newPlayer2) {
		toString();
		
		determineWinner();
		
		player1 = newPlayer1;
		
		player2 = newPlayer2;
	} // determines the winner, puts up the toString, and the player's as well
}
