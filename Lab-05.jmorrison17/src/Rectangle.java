
public class Rectangle {
	
	
	// Define the (private) variables for a square
		// These are the attributes that all squares will have 
		private int x;
		private int y;
		private int length;
		private int width;
		private String color;
		private static int numberOfRectangles =0;
		// constructor 
		public Rectangle(int newX, int newY, int newLength, int newWidth, String newColor) {
			x = newX;
			y = newY;
			length = newLength;
			width = newWidth;
			color = newColor;
			numberOfRectangles ++;
			toString();
		}
		
		public int getX() {
			return x;
		} // returns the int x for the x location of the rectangle
		public int getY() {
			return y;
		} // returns int y for the y location
		public int getLength(){
			return length;
		}
		public int getWidth() {
			return width;
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
		public void setLength(int newLength){
			// makes sure that the value for the length must be a positive number
			if (newLength > 0) {
				length = newLength;
			} else {
				// otherwise this prompt is printed to get the rectangle creator to reevaluate what they typed
				System.out.println("You need to enter a positive length value");
			}
		}
		public void setWidth(int newWidth) {
			// makes sure that the value for the width must be a positive number
			if (newWidth > 0) {
				width = newWidth;
			} else {
				System.out.println("You need to enter a positive width value");
			}
			} 
		public void setColor(String newColor) {
			color = newColor;
		} // gives ability to change color
		public static int getNumberOfRectangles() {		
			return numberOfRectangles;
		} // returns the number of rectangles
		public String toString(){
			String str = "The rectangle has a length of " + length + " and a width of " + width + " . The rectangle is located on the following for the x, y plane (" + x + ", " + y + ")."  ;
			return str;
		} //  generates the overall string for printing shit
		public void drawRectangle() {
			Magic.drawRectangle(x, y, length, width, color);
		}
		public int perimeter() {
			int recPerim = length + length + width + width;
			return recPerim;
		}
		public int area() {
			int recArea = length * width;
			return recArea;
		}
		public void move(int amountDown, int amountRight) {
			y = amountDown + y;
			x = amountRight + x;
			
		}
		public boolean isLongerThan(Rectangle rec) {
			int thisRecSize = length; // length of rectangle
			int otherRecSize = rec.length; // second length of rectangle
			return thisRecSize < otherRecSize; // true if thisRecSize is smaller (false otherwise)
		}
		public boolean isWiderThan(Rectangle rec) {
			int thisRecSize = width; // width of rectangle
			int otherRecSize = rec.width; // second width of rectangle
			return thisRecSize < otherRecSize; // true if thisRecSize is smaller (false otherwise)
		}
}
