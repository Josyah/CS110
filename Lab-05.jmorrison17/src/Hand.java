// Josyah Morrison
// Lab-05
// Hand.java

public class Hand {
	private Card card1;
	private Card card2;
	// defines card1 and 2 for the hand to have access to
	
	public String toString() {
		String str = card1.toString() + " and a " + card2.toString() + " .";
		return str;
	} // string is created with previous string inside of it
	public int getPoints() {
		int totalPoints = card1.getpoints() + card2.getpoints();
		return totalPoints;
	} // totalPoints found in this section
	public Hand(Card newCard1, Card newCard2) {
		toString();
		
		getPoints();
		
		card1 = newCard1;
		
		card2 = newCard2;
		
		// creates constructor and defines each of the privates as equal to new(insertname)
	}
}
