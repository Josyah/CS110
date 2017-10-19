import java.util.Scanner; // step one for input

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		// new way to print
//		System.out.println(5);
//		
//		// Scanner: get user input
//		Scanner scan = new Scanner(System.in); // step 2 for getting input
//		
//		System.out.println("Please enter an integer.");
//		int userInt = scan.nextInt();
//		System.out.println("You entered " + userInt + ".");
//		
//		System.out.println("Please enter a number.");
//		double userDouble = scan.nextDouble();
//		System.out.println("You entered " + userDouble + ".");
		
		// create the professor class (with appropriate number variables and methods)
		
		// length of a string
		String myName = "Josyah";
		int numLetters = myName.length();
		System.out.println(numLetters);
		
		// Chars
		char myChar = 'z';
		System.out.println(myChar);
		
		// Get one letter from a String
		char firstLetter = myName.charAt(0);
		System.out.println(firstLetter);
		char lastLetter = myName.charAt(numLetters - 1);
		System.out.println(lastLetter);
		
		// Print each letter in myName individually
		for (int i = 0; i < numLetters; i++) {
			char currentLetter = myName.charAt(i);
			System.out.println(currentLetter);
		}
		
		// Play  hangman
		// make the game
		Hangman myHangman = new Hangman();
		// play the game
		myHangman.playGame();
		
	}

}
