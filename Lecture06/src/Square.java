
public class Square {
	
	// Define the (private) variables for a square
	// These are the attributes that all squares will have 
	private int x;
	private int y;
	private int sideLength;
	private String color;
	
	private static int numberOfSquares = 0; // keep track of squares (start at 0)
	
	public Square(int newX, int newY, int newSideLength, String newColor) {
		// constructor 
		// needs parameters for all of the class variables that I want to be able to define
		x = newX;
		y = newY;
		sideLength = newSideLength;
		color = newColor;
		numberOfSquares ++; // everytime I create a square, the number of squares increases by one
	}
	
	// create a method that draws our square
	public void drawSquare( ) {
		Magic.drawRectangle(x, y, sideLength, sideLength, color);
		
	}
	// Create a method that computes the perimeter of the square
	public int perimeter() {
		int perim = 4 * sideLength;
		return perim;
	}
	// Practice: write a method that computes the area of the square
	public int area() {
		int a = sideLength * sideLength;
		return a;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSideLength() {
		return sideLength;
	}
	public String getColor() {
		return color;
	}
	
	// Setters: methods that allow people to change the values of class
	public void setX(int newX) {
		x = newX; // change the value of x to newX
	}
	public void setY(int newY) {
		y = newY;
	}
	public void setSideLength(int newSideLength) {
		if (newSideLength > 0) {
			sideLength = newSideLength;
			// don't allow the value of sidelength to be changed unless
			// it is valid
		}
	}
	// write a move method
	public void move(int amountDown, int amountRight) {
		// change the coordinates
		x += amountRight;
		y += amountDown;
		// draw the square @ these new coords
		drawSquare();
	}
	public String toString() {
		String str = "The square with side length " + sideLength + " is at ( " + x + ", " + y + ") and is " + color + ".";
		return str;
	}
	public boolean isSmallerThan(Square sq) {
		int thisSquareSize = sideLength; // Side length of square that calls the method
		int otherSquareSize = sq.sideLength; // this is the side length of the second square
		return thisSquareSize < otherSquareSize; // true if thisSquareSize is smaller (false otherwise)
	}
	
	public static int getNumberSquares() {
		return numberOfSquares;
	}
	
}
