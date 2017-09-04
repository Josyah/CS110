// Josyah Morrison
// Lab-01
// Starter.java

public class Starter {

	public static void main(String[] args) {
		// 1. VARIABLES AND PRINTING
		Magic.println("Go Roos!");
		int firstVar = 5;
		// Below handles printing of variable
		Magic.println(firstVar);
		//Creates a string and prints it
		String iceCream = "Mint Chocolate Chip";
		Magic.println(iceCream);
		// The boolean printing 
		boolean timeLength = true;
		Magic.println(timeLength);
		// Double variable
		double myNumber = 6.0;
		Magic.println(myNumber);
		// 2. INPUT
		Magic.println("Enter two intergers");
		// These bottom lines will allow for user input
		int myInteger1 = Magic.nextInt();
		int myInteger2 = Magic.nextInt();
		// The following lines will be for the user input of doubles
		// Also prompt the user to enter the doubles
		Magic.println("Now enter two doubles");
		double myDouble1 = Magic.nextDouble();
		double myDouble2 = Magic.nextDouble();
		// Printing all of the user input options
		Magic.println("You entered the following integers and doubles");
		Magic.println(myInteger1);
		Magic.println(myInteger2);
		Magic.println(myDouble1);
		Magic.println(myDouble2);
		// 3. ARITHMETIC
		Magic.println("The following is just some basic arithmetic with the doubles and integers you entered!");
		Magic.println(myDouble1 + myDouble2);
		Magic.println(myDouble1 - myDouble2);
		Magic.println(myDouble1 * myDouble2);
		Magic.println(myDouble1 / myDouble2);
		Magic.println(myInteger1 % myInteger2);
		myInteger1 -= myInteger2;
		Magic.println(myInteger1);
		myDouble1 *= myDouble2;
		Magic.println(myDouble1);
		int myVar = 17;
		myVar = myVar + 1;
		Magic.println("The first of + 1's to myVar is " + myVar);
		myVar = myVar + 1;
		Magic.println("The second of + 1's to myVar is " + myVar);
		myVar = myVar += 1;
		Magic.println("The third of + 1's to myVar is " + myVar);
		myVar = myVar ++;
		Magic.println("The final of + 1's to myVar is " + myVar);
		// 4. STRINGS
		Magic.println("Enter your favorite cereal below, please.");
		String favCereal = Magic.nextLine();
		Magic.println("Oh wow, what a coincidence, I too like " + favCereal);
		// 5. ARRAYS AND FILES
		//int myArray[] = {3, -1, 4, 2, 10, -7};
		//int arrayLength = myArray.length; 
		//Magic.println("The length of this array is " + arrayLength); 
		// I don't really understand how to do this mess,
		//In the .txt file how do you even add an array for that mess
		// 6. DRAWING
		// All of these are for various shapes
		Magic.drawRectangle(100, 50, 20, 75, "Pink");
		Magic.drawRectangle(150, 200, 15, 60, "Magenta");
		Magic.drawEmptyRectangle(30, 122, 75, 20, "Black");
		Magic.drawEmptyRectangle(200, 240, 100, 40, "Cyan");
		Magic.drawOval(400, 300, 30, 60, "Yellow");
		Magic.drawOval(500, 400, 60, 120, "DarkGray");
		Magic.drawLine(50, 90, 300, 450, "Red");
		Magic.drawLine(50, 180, 300, 450, "Green");
		// 7. DRAWING WITH INPUT
		Magic.println("Input the x-value");
		int x = Magic.nextInt();
		Magic.println("Input the y-value");
		int y = Magic.nextInt();
		Magic.println("Input the height");
		int height = Magic.nextInt();
		Magic.println("Input the width");
		int width = Magic.nextInt();
		Magic.drawRectangle(x, y, height, width, "DarkGray");
	}

}
