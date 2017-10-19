// Josyah Morrison
// Lab-05
// Starter.java

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I CALL THE CIRCLE AND RECTANGLE METHODS HERE
		Rectangle myRectangle;
		myRectangle = new Rectangle(40, 50, 140, 120, "Yellow");
		myRectangle.drawRectangle();
		myRectangle.perimeter();
		myRectangle.area();
		myRectangle.move(20, 30);
		Circle myCircle;
		myCircle = new Circle(200, 300, 200, "black");
		myCircle.drawCircle();
		myCircle.circumference();
		myCircle.area();
		myCircle.move(200, 200);
		// I ALSO call RockPaperScissors
		RockPaperScissors myRockPaperScissors;
		myRockPaperScissors = new RockPaperScissors();
		// And call Blackjack
		Blackjack myBlackjack;
		myBlackjack = new Blackjack();
		
	}
	
}
