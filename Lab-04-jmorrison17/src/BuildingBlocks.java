// Josyah Morrison
// Lab-04
// BuildingBlocks.java

public class BuildingBlocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Question 1 (5 points)
		// Make 5 copies of the line of code below.
		// Modify each one so that you have created a byte, a short, a long, a double, and a float
		int myInt = -6;
		byte myByte = 99;
		short myShort = -45;
		long myLong = 9223372036854775807L;
		double myDouble = 4.0;
		float myFloat = (float) 2.02;
		
		
		// Question 2 (5 points)
		// Modify the function degreesToRadians so that ratio is a final.
		// Be sure to make ratio follow our naming conventions for finals.
		// Test your method here.
		degreesToRadians(4.0);
		
		// Question 3 (5 points)
		// Modify TacoToppings below to include Guacamole as a topping.
		// Then modify the switch below to include a case for Guacamole.
		// In this case, write a statement for Guacamole (it can be anything you like).
		
		TacoToppings myTopping = TacoToppings.Cheese;
		String statement;
		switch (myTopping) {
		case Tomato:
		case Lettuce:
		case Guacamole:
			statement = "good for you and Mexican food";
			break;
		case Cheese:
			statement = "basic taco";
			break;
		case Onion:
			statement = "bad breath";
			break;
		case Cilantro:
			statement = "some people think this tastes soapy";
			break;
		case Salsa:
			statement = "green or red?";
			break;
		default:
			statement = "this shouldn't ever be printed";
		}
		Magic.println(statement);
		
		// Question 4 (5 points)
		// Fill in the missing elements of my2dArray with values (any values you like).
		// Write my2dArray to a file called "weirdData.txt"
		int my2dArray[][] = new int[2][5];
		my2dArray[0][0] = 1;
		my2dArray[0][1] = 10;
		my2dArray[0][2] = 100;
		my2dArray[0][3] = 1000;
		my2dArray[0][4] = 10000;
		my2dArray[1][0] = 2;
		my2dArray[1][1] = 4;
		my2dArray[1][2] = 6;
		my2dArray[1][3] = 8;
		my2dArray[1][4] = 10;
		Magic.intFileWrite("weirdData.txt", my2dArray);
	}  // end of main
	
	public static double degreesToRadians(double degrees) {
		final double ratio = 0.01745329251;
		final double radians = degrees * ratio;
		return radians;
	}
	
	public enum TacoToppings {
		Tomato, Lettuce, Cheese, Onion, Cilantro, Salsa , Guacamole
	}


}  // end of class