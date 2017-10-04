
public class Starter {
	
	public static void main(String[] args) {
		// Declare a square object (the object is called mySquare)
		Square mySquare;
		
		// initialize mySquare
		mySquare = new Square(10, 100, 15, "Red");
		// Call methods on mySquare
		mySquare.drawSquare();
		mySquare.move(100, 50);
		// Make another square
		Square anotherSquare = new Square(50, 5, 100,"Blue");
		// call methods on it
		anotherSquare.drawSquare();
		anotherSquare.move(150, 75);
		
		// call more methods on mySquare
		int myPerim = mySquare.perimeter();
		Magic.println(myPerim);
	}
}
