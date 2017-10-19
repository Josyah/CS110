// Josyah Morrison
// Lecture06
// Hangman.java

import java.util.Scanner;

public class Hangman {
	
	private String correctAnswer;
	private int numLives = 10;
	private String[] answerArray;
	private String[] guessArray;
	private String guessedLetters = "";
	
	// constructor 
	public Hangman() {
		// get the correct answer(string)
		getWord();
		// use the length of the correct answer to set up blanks
		// use arrays to hold blanks
		// one for the correct answer
		// one for blanks that player 2 can fill in
		makeArray();
	}
	
	public void getWord() {
		// get the word from player 1
		Scanner scan = new Scanner(System.in);
		System.out.println("PLayer 1, please enter a word for player 2 to guess.");
		correctAnswer = scan.nextLine();
		System.out.println("Thanks!");
	}
	public void makeArray() {
		int numLetters = correctAnswer.length();
		// determine the length of the two arrays
		answerArray = new String[numLetters];
		guessArray = new String[numLetters];
		// fill in the two arrays
		for (int i = 0; i<numLetters; i++) {
			answerArray[i] = correctAnswer.charAt(i) + " ";
			// m i s s i s s i p p i
			guessArray[i] = "_ ";
			// _ _ _ _ _ _ 
		}
	}
	public void playGame() {
		// display the blanks
		
		// put this in a while loop
		// should stop when run out of lives or when the guess is totally correct
		while (numLives > 0 && !isCorrect()) {
		displayGuess();
		guess();
		System.out.println("You have guessed the following letters so far");
		System.out.println("guessedLetters");
			}
		if(isCorrect()) {
			displayGuess();
			System.out.println("You won!");
		}
		}
	
	public void displayGuess() {
		// show the player the current state of the word they're guessing 
		// m _ _ _ _ _ _ _ p p _
		String guess = "";
		// append the strings from guessArray to the guess string
		for (int i = 0; i < guessArray.length; i++) {
			guess += guessArray[i];
		}
		System.out.println(guess);
	}
	public void guess() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player 2, please guess a letter.");
		String guess = scan.nextLine() + " ";
		int numCorrectLetters = 0;
		guessedLetters = guess;
		// compare guess with all elements in the answerArray to see if it is right
		for (int i = 0; i < answerArray.length; i++) {
			if (guess.equalsIgnoreCase(answerArray[i])) {
				// if the guess is good, fill in the guess array with correct letters
				guessArray[i] = guess;
				numCorrectLetters++;
			}
		}
		// once I've gone through all of the blanks, take away a life if appropriate
		if(numCorrectLetters == 0 && numLives > 1) {
			// my guess is wrong
			System.out.println("Sorry... Guess again!");
			numLives--; // take away a life
		} else if (numCorrectLetters == 0 && numLives == 1) {
			numLives --;
			System.out.println("You lose.");
		}
	}
	public boolean isCorrect() {
		for (int i = 0; i < guessArray.length; i++) {
			if (guessArray[i].equalsIgnoreCase(answerArray[i])) {
				// if the two letters aren't the same
				return false;
			}
		}
		return true; // if I haven't returned false so far, then the letters are the same
	}
	// To do:
	// say if they win or lose
	// say if lost a life(how many are left)
	// show a list of letters that they have guessed
	// make it so that the correct answer isn't directly showed
	// make it so they can't guess the same letter twice
}
