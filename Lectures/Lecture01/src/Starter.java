// Catie Patterson
// Lecture01
// Starter.java

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This is a comment
		//  I can write whatever I want here
		// The computer won't read this
		
		/* This
		 * is
		 * a
		 * multiline
		 * comment
		 */
		
		int myFirstVariable;  // Declare a new int variable
		int anotherVariable, z, year;  // Declare multiple ints at once
		// Use descriptive variable names!
		
		// Assign values to our ints
		myFirstVariable = 7;
		anotherVariable = -10;
		z = 0;
		year = 2017;
		
		// Declare a variable and assign it a value in one line
		int numStudents = 21;
		
		// More variable types
		double myGPA = 4.0;
		double pi = 3.14159;
		String greeting = "Hello world!";
		boolean isRaining = false;
		boolean isFriday = true;
		// The only possible values for a boolean are true and false
		// (without quotes)
		// String has a capital S, and strings have quotes around them
		
		// Implicitly convert from int to double
		int numWeeksInYearInt = 52;
		double numWeeksInYearDouble = numWeeksInYearInt;
		// Now numWeeksInYearDouble's value is 52.0
		
		// Explicitly convert from double to int (round down)
		double twix = 14.7;
		int snickers = (int) twix;
		// Now the value assigned to snickers is 14 (round down from 14.7)
		
		// Mathematical operations
		int macAndCheese = snickers + 7 * 4 - 8 / 3;
		// Order of operations!
		int spaghetti = (4 + 3) * 2;
		// 8/3 is 2 since 8 and 3 are ints (so the answer is an int)
		
		// Variables applying operations to themselves
		int myInt = 3;
		myInt = myInt + 7;
		// myInt is 10
		myInt = myInt + snickers;
		// myInt is 24
		
		// Let's do this faster!
		int x = 5;
		x += 2;
		// This is the same as x = x + 2;
		
		// This works for other operations too
		int y = -3;
		y = y - 1;
		// y is -4
		y -= 1;
		// y is -5
		y *= 2;
		// y is -10
		y /= 5;
		// y is -2;
		
		y = 5/y; //write this out
		
		// Extra special shortcut for adding 1
		int z2 = 3;
		z = z + 1;
		// now z is 4
		z += 1;
		// now z is 5
		z++;
		// now z is 6
		
		// Similar for subtraction
		z = z - 1;
		// now z is 5
		z -= 1;
		// now z is 4
		z--;
		// now z is 3
		
		// % find the remainder (from division)
		int rem = 15 % 2;  // gives the remainder of 15/2, which is 1
		int myVar = 20;
		myVar %= 7;  // takes the remainder of 20/7 (which is 6) and stores that value in myVar
		// This is the same as myVar = myVar % 7;
		
		// String concatenation
		String firstName = "Catie";
		String lastName = "Patterson";
		String fullName = firstName + " " + lastName;
		// fullName's value is "Catie Patterson"
		String lastFirst = lastName + ", " + firstName;
		// lastFirst's value is "Patterson, Catie"
		
		// Declare an array of ints
		int myArray[];
		// Construct the array and make it have 10 elements in it
		myArray = new int[10];
		// the first index is 0
		// the last index is 9
		// there are 10 things total in the array
		
		// Declare and construct an array on the same line
		int anotherArray[] = new int[5];
		// this array has space for 5 things in it
		// first index: 0
		// last index: 4
		
		// If I know what values I want in the array:
		int oneMoreArray[] = {4, -1, 0, 24, 18};
		
		//  Access the element with index 3
		int anElement = oneMoreArray[3];
		// anElement's value is 24
		int oneMoreElement = oneMoreArray[0];
		// oneMoreElement's value is 4
		
		// Get the length of an array (number of elements in it)
		int arrayLength = oneMoreArray.length;
		// arrayLength is 5
		
		// Get the index of the last element in oneMoreArray
		int lastIndex = oneMoreArray.length - 1;
		int lastIndex2 = arrayLength - 1;
		
		// Printing
		Magic.println("Hello world");
		Magic.println(6784);
		Magic.println(arrayLength);
		Magic.println("arrayLength");
		Magic.println(fullName);
		Magic.println(lastFirst);
		
		// More output: writing an array of ints to a file
		// First declare and construct the array
		int[] valuesToWrite = new int[4];
		// Now put values in the array
		valuesToWrite[0] = 4;
		valuesToWrite[1] = -10;
		valuesToWrite[2] = 67;
		valuesToWrite[3] = 0;
		// Write these values to a file
		Magic.simpleIntFileWrite("fourInts.txt", valuesToWrite);
		
//		// Get input from the user
//		Magic.println("Please enter an integer.");
//		int userInput = Magic.nextInt();
//		// Tell the user what they entered
//		Magic.println("You entered the number");
//		Magic.println(userInput);
//				
//		// Similar for doubles
//		Magic.println("Please enter the digits of pi that you know.");
//		double userPi = Magic.nextDouble();
//		Magic.println("You entered");
//		Magic.println(userPi);
		
//		// Now with strings
//		Magic.println("Please enter your name.");
//		String userName = Magic.nextLine();
//		Magic.println("Your name is");
//		Magic.println(userName);
//		Magic.println("Your name is " + userName + ".");
//		// Now the answer is in the same line as the rest of the sentence
//		
//		// Now with booleans
//		Magic.println("Is today Monday? Please enter true or false.");
//		boolean isMonday = Magic.nextBoolean();
//		Magic.println(isMonday);
		
		// Input: read ints from a file
		// Create an array and put the data from the file in the array
		int[] data = Magic.simpleIntFileRead("fourInts.txt");
		Magic.println(data[0]);
		// Add up all of the numbers in the file
		int total = data[0] + data[1] + data[2] + data[3];
		Magic.println(total);
		// Calculate the average
		int avg = total/data.length;
		Magic.println(avg);
		// We used integer division (round down)
		
		// Output: Drawing
		Magic.drawOval(200, 400, 100, 200, "Green");
		
		
		
	}

}
