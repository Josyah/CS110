// Josyah Morrison
// Lab-05
// Card.java
import java.util.Random;
import java.util.Scanner;

public class Card {
	private String suit;
	private String value;
	private int points;
	// defines points, value, and suit as constant private terms across this class
	
	
	public String getSuit() {
		return suit;
	} // returns suit after getting it
	public String getValue() {
		return value;
	} // returns value after getting it
	public int getpoints(){
		return points;
	}// returns points after getting it
	public void setSuit(String newSuit) {
		suit = newSuit;
	}// sets suit
	public void setValue(String newValue) {
		value = newValue;
	} // sets value
	public void setPoints(int newPoints){
		points = newPoints;
	}// sets points
	public String toString() {
		String str = value + "of" + suit ; 
		return str;
	} // defines the initial string with value and suit
	public void selectSuit() {
		String suit[] = {"hearts", "diamonds", "clubs", "spades"};
		Random random = new Random();
		int index = random.nextInt(suit.length);
		System.out.println(suit[index]);
	} // creates an array for suit
	public int selectValue() {
		String value[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
		Random random = new Random();
		int i = random.nextInt(value.length);
		System.out.println(value[i]);
		// defines an array for the values
		// randomizes that array
		if(value[i].equals("2")) {
			points = 2;
		} else if(value[i].equals("3")) {
			points = 3;
		} else if(value[i].equals("4")) {
			points = 4;
		} else if(value[i].equals("5")) {
			points = 5;
		} else if(value[i].equals("6")) {
			points = 6;
		} else if(value[i].equals("7")) {
			points = 7;
		} else if(value[i].equals("8")) {
			points = 8;
		} else if(value[i].equals("9")) {
			points = 9;
		} else if(value[i].equals("10")) {
			points = 10;
		} else if(value[i].equals("jack")) {
			points = 10;
		} else if(value[i].equals("queen")) {
			points = 10;
		} else if(value[i].equals("king")) {
			points = 10;
		} else if(value[i].equals("ace")) {
			points = 11;
		}
		return points;
	} // defines the points for each of these values, using this else if statement
	public Card(String newSuit, int newPoints, String newValue) {
		suit = newSuit;
		value = newValue;
		points = newPoints;
		selectSuit();
		
		selectValue();
		
		toString();
		// creates constructor and defines each of the privates as equal to new(insertname)
		// call's the toString for the next method
	}
}
