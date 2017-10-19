// Josyah Morrison
// Lab05
// RockPaperScissors.java

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	private enum Move {
		Rock, Paper, Scissors;
	}
	private Move computerMove;
	private Move playerMove;

	private String playerName;

	public void setPlayerName() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name");
		// asks the player name, gets it through input and puts it into the playerName variable
		playerName = scan.nextLine();
	}
	public void askPlayerMove(String playerName) {
		Scanner scan = new Scanner(System.in);
			// SHOULD say while playerMove != null, meaning that while playerMove is equal to something
			// print this
			System.out.println(playerName + ", do you want rock, paper, or scissors");
			String playerMove = scan.nextLine();
			// should show player the option to enter in a Rock, paper, scissors choice
		while(playerMove == null) {
			if(playerMove.equals(Move.Rock)) {
				// if player move is equal to rock
				System.out.println("You chose " + Move.Rock + ".");
			} else if(playerMove.equals(Move.Paper)) {
				// if player move is equal to paper
				System.out.println("You chose " + Move.Paper + ".");
			} else if(playerMove.equals(Move.Scissors)) {
				// if player move is equal to scissors
				System.out.println("You chose " + Move.Scissors + ".");
			} else {
				System.out.println("Invalid choice.");
			}		
		}
		System.out.println("You selected " + playerMove + ".");
	}
	public void determineComputerMove() {
		Move [] moves = Move.values();
		Random random = new Random();
		int index = moves.length;
		int RPS = random.nextInt(index);
		// Randomly selects rock, paper, or scissors
		Move computerValue = moves[RPS];
		System.out.println("The computer selected " + computerValue + ".");
	}
	public RockPaperScissors() {
		setPlayerName();
		
		askPlayerMove(playerName);
		
		determineComputerMove();
		
		determineWinner();
		
	}
	public void determineWinner() {
		// Switch + If statements use the input stuff from above to decide who the winner of the game is
		String winner = " ";

		switch(computerMove) {
		case Rock:
			switch(playerMove){
				case	 Rock:
					System.out.println("It's a tie!");
				break;
				case Paper:
					winner = "Player";
				break;
				case Scissors:
					winner = "Computer";
				break;
				}
		break;
		case Paper:
			switch(playerMove){
				case Rock:
					winner = "Computer";
				break;
				case Paper:
					System.out.println("It's a tie!");
				break;
				case Scissors:
					winner = "Player";
				break;
				}
		break;
		case Scissors:
			switch(playerMove){
				case Rock:	
					winner = "Player";
				break;
				case Paper:
					winner = "Computer";
				break;
				case Scissors:
					System.out.println("It's a tie!");
				break;
				}
			break;
			}
		if(winner != null){
		System.out.println("The "+ winner + "wins!"); 
		}
		
	}	
}

