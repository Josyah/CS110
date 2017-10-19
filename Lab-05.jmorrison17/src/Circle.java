
public class Circle {
	// Define the (private) variables for a square
			// These are the attributes that all squares will have 
			private int x;
			private int y;
			private int radius;
			private String color;
			private static int numberOfCircles =0;
			// constructor 
			public Circle(int newX, int newY, int newRadius, String newColor) {
				x = newX;
				y = newY;
				radius = newRadius;
				color = newColor;
				numberOfCircles ++;
				toString();
			}
			
			public int getX() {
				return x;
			} // returns the int x for the x location of the rectangle
			public int getY() {
				return y;
			} // returns int y for the y location
			public int getRadius(){
				return radius;
			}
			public String getColor() {
				return color;
			}
			public void setX(int newX) {
				x = newX;
			} // returns the int x for the x location of the rectangle
			public void setY(int newY) {
				 y = newY;
			} // returns int y for the y location
			public void setLength(int newRadius){
				// makes sure that the value for the length must be a positive number
				if (newRadius > 0) {
					radius = newRadius;
				} else {
					// otherwise this prompt is printed to get the rectangle creator to reevaluate what they typed
					System.out.println("You need to enter a positive length value");
				}
			}
			public void setColor(String newColor) {
				color = newColor;
			} // gives ability to change color
			public static int getNumberOfCircles() {		
				return numberOfCircles;
			} // returns the number of rectangles
			public String toString(){
				String str = "The circle has a radius of " + radius + " . The circle is located on the following for the x, y plane (" + x + ", " + y + ")."  ;
				return str;
			} //  generates the overall string for printing shit
			public void drawCircle() {
				Magic.drawOval(x, y, radius, radius, color); ;
			}
			public double circumference() {
				double circum = (radius * 2 * Math.PI);
				return circum;
			}
			public double area() {
				double cirArea = Math.PI * radius * radius;
				return cirArea;
			}
			public void move(int amountDown, int amountRight) {
				y = amountDown + y;
				x = amountRight + x;
				
			}
			public boolean isBiggerThan(Circle cir) {
				int thisCircleSize = radius; // radius of first 
				int otherCircleSize = cir.radius; // radius of second
				return thisCircleSize < otherCircleSize; // true if thisCircleSize is smaller (false otherwise)
			}
			
			
}
