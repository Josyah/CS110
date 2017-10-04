// Josyah Morrison
// Lab-04
// StartD.java

public class StartD {
	public static void main(String[] args) { // pushes all of the methods to work and run
		c2fint(100);
		productArray(3, 5);
	}
	// This is Part 1
	public static double c2fint(double degreeC) {
		// Establishes a final that will be useful in the degreeF equation
		final int freezingPoint = 32;
		// Required final for the 5 points
		final double tempDoub = 1.8;
		// converts degreeC to degreeF
		double degreeF = freezingPoint + (9 * (degreeC / 5));
		// PRINTS degreeF, showing the Celsius temperature as Fahrenheit
		Magic.println(degreeF);
		// returns degreeF
		return degreeF;
	}
	// This is Part 2
	public static int[][] arrayOfOnes(int numRows, int numCols) {
		int[][] arrayOfInts = new int[numRows][numCols];
		// turns the int arrayOfInts into a user input accepting numRows and Cols from the user
		arrayOfInts[numRows][numCols] = 1;
		return arrayOfInts;
	}
	// This is Part 3
	public static int productArray(int numRows, int numCols) {
		int [][] prodArray = new int [numRows][numCols];
		// This one does a very similar thing to the upper one
		prodArray[numRows][numCols] = numRows + numCols;
		return numCols;
	}
	// This is Part 4
	// creates the enum for all of the months
	public enum MonthsWithLeap {
		January, February, FebruaryLeap, March, April, May, June, July, August, September,
		October, November, December
	};
	// This is Part 5
	public static int daysInMonth(MonthsWithLeap month) {
		// defines the days within each of the months and returns an output telling of the day
		int days = 0;
		 switch(month){
		 case January:
		 Magic.println("It's January, there are 31 days in this month");
		 days = 31;
		 break;
		 case February:
		 Magic.println("It's February, there are 28 days in this month");
		 days = 28;
		 break;
		 case FebruaryLeap:
	     Magic.println("It's a leap year February, there are 29 days in this month");
			 days = 29;
		 break;
		 case March:
		 Magic.println("It's March, there are 31 days in this month");
		 days = 31;
		 break;
		 case April:
		 Magic.println("It's April, there are 30 days in this month");
		 days = 30;
		 break;
		 case May:
		 Magic.println("It's May, there are 31 days in this month");
		 days = 31;
		 break;
		 case June:
		 Magic.println("It's June, there are 30 days in this month");
		 days = 30;
		 break;
		 case July:
		 Magic.println("It's July, there are 31 days in this month");
		 days = 31;
		 break;
		 case August:
		 Magic.println("It's August, there are 31 days in this month");
		 days = 31;
		 break;
		 case September:
		 Magic.println("It's September, there are 30 days in this month");
		 days = 30;
		 break;
		 case October:
		 Magic.println("It's October, there are 31 days in this month");
		 days = 31;
		 break;
		 case November:
		 Magic.println("It's November, there are 30 days in this month");
		 days = 30;
		 break;
		 case December:
		 Magic.println("It's December, there are 31 days in this month");
		 days = 31;
		 break;
		 }
		 return days;
	}
	// This is Part 5
	public enum Coins {
		// creates coins as enums
		Penny, Nickel, Dime, Quarter
	}
	public static int coinValue(Coins coin) {
		// determines and returns values of each of the coins
		int value = 0;
		switch(coin){
		case Penny:
		Magic.println("The coin is worth 1 cent");
		value = 1;
		break;
		case Nickel:
		Magic.println("This coin is worth 5 cents");
		value = 5;
		break;
		case Dime:
		Magic.println("This coin is worth 10 cents");
		value = 10;
		break;
		case Quarter:
		Magic.println("This coin is worth 25 cents");
		value = 25;
		break;
		} // returns the value to the function at the end
		return value;
	}

}
