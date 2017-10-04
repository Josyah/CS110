// Catie Patterson
// Lecture 04
// Starter.java

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// new primitive types
		byte myByte = -11;
		// byte myByte2 = 128;  // 128 is too big to be a byte
		short myShort = 128;
		short myShort2 = -45;
		// short myShort3 = 32768;  // 32768 is too big to be a short
		long myLong = 2147483648L;  // use L to indicate that it is a long
		// int myInt = 2147483648;  // 2147483648 is too big to be an int
		double myDouble = 3.14;
		float myFloat = 3.14F;  // use F to indicate that it is a float
		
		// make a final
		final int freezingPoint = 32;
		Magic.println(freezingPoint);
		// freezingPoint = 0;  // I can't change the value of freezingPoint because it is a final
		
//		goldenRectangle();
		
		double myArea = areaCircle(4);
		Magic.println(myArea);
		Magic.println(areaCircle(5));
		myArea++;
		Magic.println(myArea);
		

	}
	
	public static void goldenRectangle() {
		// golden ratio constant (final)
		final double GOLDEN_RATIO = 1.61803309887;
		
		// get one side length from the user
		Magic.println("Please enter one side length of your rectangle.");
		int sideA = Magic.nextInt();
		
		// compute the other side length (using the golden ratio)
		double sideBDouble = sideA * GOLDEN_RATIO;
		
		// convert sideBDouble to an int so I can draw
		int sideB = (int) sideBDouble;
		
		// draw
		Magic.drawRectangle(200, 200, sideA, sideB, "Yellow");
		
	}
	
	public static double areaCircle(double radius) {
		final double PI = 3.14159265359;
		double area = PI * radius * radius;
		return area;
	}

}
