// Josyah Morrison
// Lab-03
// BuildingBlocks.java

public class BuildingBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1 (5 points)
		// Modify the isEven method below so that it has one parameter, an integer x.
		// The method should return true if x is even, and it should return false if x is odd.
		// The method should no longer as the user for input.
		// Test your method here.
		isEven(6); 
		// Question 2 (5 points)
		// Make a copy of the modified isEven method, and rename it evenOrOdd.
		// Modify the evenOrOdd method so that it doesn't return anything.
		// Instead, it should print "even" if x is even or "odd" if x is odd.
		evenOrOdd(9);
		// Question 3 (5 points)
		// Modify the isPositive method below so that it returns a boolean value.
		// It should return true if myInt is positive, and false if myInt is not positive.
		// Test your method here.
		isPositive(-11);
		// Question 4 (5 points)
		// Make a copy of the modified isPositive method, and rename it bothPositive.
		// Modify bothPositive so that it has two int parameters, myInt1 and myInt2.
		// It should return true if both integers are positive, and false if they are not both positive.
		// Test your method here.
		bothPositive(2, -1);
		// Question 5 (5 points)
		// Modify the adder method below so that the second parameter is a double and so that the method returns a double.
		// Test your method here.
		adder(1, 2, 3, 14.0);
	}
	
	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void evenOrOdd(int x) {
		if (x % 2 == 0) {
			Magic.println("even");
		} else {
			Magic.println("odd");
		}
	}
	
	public static boolean isPositive(int myInt) {
		if (myInt > 0) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean bothPositive(int myInt1, int myInt2) {
		if (myInt1 > 0 && myInt2 > 0) {
			return true;
		} else {
			return false;
		}
	}
	public static double adder(int a, int b, int c, double ab) {
		int total = a + b + c;
		return ab;
	}
	
	
	

}