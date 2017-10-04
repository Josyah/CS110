// Josyah Morrison
// Lab-02
// BuildingBlocks.java


public class BuildingBlocks { 

	
	public static void main(String[] args) {
		
		// (5 points) Question 1. 
		/* Modify the following lines of code so that you print out five different messages, one for 
		 * each of the following cases:
		 * 1. if value is greater than 100, 
		 * 2. if value is at most 100 but, greater than 50,
		 * 3. if value is equal to 50,
		 * 4. if value is less than 50, but greater than 0,
		 * 5. if value is at most 0.
		 */
		
		int value;
		Magic.println("Please enter a value.");
		value = Magic.nextInt();
		if (value >  100) {
			Magic.println("value is greater than 100");
		} if (value <= 100 && value > 50) {
			Magic.println("value is greater than 50 and less than 100");
		} if (value == 50 ) {
			Magic.println("value is equal to 50");
		} if(value < 50 && value > 0 ){
			Magic.println("value is less than 50 and greater than 0");
		} if(value <= 0 ){
			Magic.println("the value is at most 0");
		}
	
		// (5 points) Question 2. 
		/* Modify the for loop so that it starts when i = 10, 
		 * stops when i is equal to or greater than 50,
		 * and i increases by 5 each iteration.  
		 */
		for (int i = 10; i <= 50; i += 5) {
			Magic.println("The value of i is " + i);
		}
		
		// (5 points) Question 3
		/* Modify the while loop so that it starts when loopIndex = 10, 
		 * stops when loopIndex is equal to or greater than 50,
		 * and loopIndex increases by 5 each iteration.  
		 */
		
		int loopIndex = 10;
		while (loopIndex <= 50) {
			Magic.println("the value of the loop index is " + loopIndex);
			loopIndex = loopIndex+ 5;
		}
		
		// (5 points) Question 4
		/* Modify the following code so that it will keep on looping as long as the user enters
		 * a number that is greater than 0 and less than 100.
		 */
		
		int valueEntered;
		do {
			Magic.println("Please enter a non-negative number");
			valueEntered = Magic.nextInt();
			Magic.println("You entered " + valueEntered);
		} while (valueEntered > 0 && valueEntered < 100);
		
		
		// (5 points) Question 5
		/* Modify the code below so that it does the following:
		 * 1. Create an array of size 5.
		 * 2. Ask the user to input values into the array
		 * 3. Calculate the average of all of the values of the array
		 * 4. Print out the average 
		 */
		
		int[] myArray = new int[5];
		for(int index = 0; index < myArray.length; index++) {
			Magic.println("Input 5 values into the array, real quick");
			myArray[index] = Magic.nextInt();
		}
		
		int total = 0;
		for(int index = 0; index < myArray.length; index++ ) {
			total += myArray[index];
		}
		
		int avg = total / myArray.length;
		Magic.println("The average is " + avg);
	
	}

}
