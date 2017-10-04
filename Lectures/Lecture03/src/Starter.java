// Catie Patterson
// Lecture 03
// Starter.java

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// call the feetToInches method to convert 3 feet to inches
//		int myInches = feetToInches(3);
//		Magic.println(myInches);
//		
//		// call a method from another file
//		double myFeet = AnotherFile.inchesToFeet(myInches);
//		Magic.println(myFeet);
//		// println gives a line break afterwards
//		
//		// call a method with no parameters
//		int int1 = askUserForInt();
//		Magic.println(int1);
		// now i can do some calculations with that integer
//		int1 *= 100;
//		Magic.println(int1);
//		
//		int int2 = askUserForInt();
//		Magic.println(int1+int2);
		
		// call my method that returns nothing
//		drawRedSquare(100,200,75);
		// no need to create a new variable here because there's nothing returned
		
		// Scope
//		int total = 100;  // this is different from the totals below (SCOPE!)
//		int grades[] = {95, 100, 90};
//		int myAvg = avgOfArray(grades);
//		Magic.println("My average is " + myAvg + ".");
//		Magic.println(sumOfThreeInts(-10,4,60));
		
		// test the getGrades method
//		int[] myHWGrades = getGrades("HW");
//		Magic.println(myHWGrades[0]);
//		Magic.println(myHWGrades[1]);
//		Magic.println(myHWGrades[2]);
		
		// test the averageGrades method
//		int myAvg1 = averageGrade();
//		Magic.println(myAvg1);
		
		// test the count method
//		count(5);
		
		// test the fib method
//		Magic.println(fib(11));
		
		// test the sliceArray method
//		Magic.println("start");
//		int myGrades[] = {85, 90, 88, 95, 100};
//		int mySlicedGrades[] = sliceArray(myGrades, 1, 1);
//		for (int index = 0; index < mySlicedGrades.length; index++) {
//			Magic.println(mySlicedGrades[index]);
//		}
		
		// test isElementInArray
		int searchArray[] = {2, 4, 6, 9, 10, 11, 12, 14, 16, 19, 25, 29};
		Magic.println(isElementInArray(searchArray,30));
		
	}
	
	public static int feetToInches(int feet) {
		// method that converts feet to inches
		int inches = feet * 12;
		return inches;
	}
	
	public static int askUserForInt() {
		// method that asks the user to enter an int
		// no parameters
		Magic.println("Please enter an integer.");
		int userInt = Magic.nextInt();
		return userInt;
	}
	
	public static void drawRedSquare(int x, int y, int sideLength) {
		Magic.drawRectangle(x, y, sideLength, sideLength, "Red");
		return; // this line is optional
	}
	
	// Scope
	
	// write a method that finds the average value in an array of ints
	// input: array of ints
	// output: average (int)
	public static int avgOfArray(int[] myArray) {
		// Step 1:  add up all the numbers in myArray
		int total = 0;  // this is where I'm going to store the sum of the elements
		for (int index = 0; index < myArray.length; index++) {
			// total = total + myArray[index];
			total += myArray[index];
		}
		// Step 2: divide the total by the number of elements in myArray
		int avg = total/myArray.length; // the avg needs to be outside of the loop
		
		return avg;
	}
	
	public static int sumOfThreeInts(int a, int b, int c) {
		int total = a + b + c;  // this total is differen from the total in the last method (different scope)
		return total;
	}
	
	// write a method to get the grades from the user
	// input: category (HW, lab, quiz, etc)
	// output: array of grades
	
	public static int[] getGrades(String category) {
		// method that accepts a list of grades from the user
		// returns those grades in an array
		Magic.println("How many " + category + " grades are there?");
		int numGrades = Magic.nextInt(); // get the total number of grades
		// create an array where I can store the grades
		int gradeArray[] = new int[numGrades];
		for (int count = 0; count < numGrades; count++) {
			Magic.println("Please enter the next " + category + " grade.");
			// store the grade in our array
			gradeArray[count] = Magic.nextInt();
		}
		return gradeArray;
		
	}
	
	// write an method that computes the student's average in the class
	public static int averageGrade() {
		// calculates the overall average grade
		// get HW grades
		int hwGrades[] = getGrades("homework");
		// get lab grades
		int labGrades[] = getGrades("lab");
		// get quiz grades
		int quizGrades[] = getGrades("quiz");
		// average the hw grades
		int hwAvg = avgOfArray(hwGrades);
		// average the lab grades
		int labAvg = avgOfArray(labGrades);
		// average the quiz grades
		int quizAvg = avgOfArray(quizGrades);
		// average all of the average grades
		int averages[] = {hwAvg, quizAvg, labAvg};
		int overallAvg = avgOfArray(averages);
		return overallAvg;
		
	}
	
	// write a recursive method
	public static void count(int x) {
		// method that counts from x down to 0, recursively
		Magic.println("The count is " + x +".");  // prints out the current x
		if (x == 0) {
			// if x is 0, we want to stop counting
			// so return nothing to end the method
			return;
		} else {
			count(x-1); // otherwise, reduce the count by 1 and begin again
		}
	}
	
	// write a method that calculates the n'th indexed fibonacci number
	public static int fib(int n) {
		// input: an index n
		// output: the n'th fibonacci number
		
		// for recursive functions, we need base case(s) and recusrive step
		if (n == 0) {
			// the 0th fibonacci number is 0
			return 0;
		} else if (n == 1) {
			// the 1st fibonacci number is 1
			return 1;
		} else {
			// recursive step
			// to get the nth number, add the (n-1) and (n-2) fib numbers together
			return fib(n-1) + fib(n-2);
		}
	}
	
	// Exponential Decay: figure out whether or not an element is in a sorted array
	// use recursion
	
	public static boolean isElementInArray(int[] myArray, int myElement) {
		// input: an array and the element we're looking for in that array
		// output: true if it's in the array, false if it isn't
		
		
		if (myArray.length == 1) {
			// base case: one element left
			// what do I return?
			if (myElement == myArray[0]) {
				// if the one remaining element is the right one, return true
				return true;
			} else {
				// otherwise, false
				return false;
			}
		} else {
			// if the array length is not 1, cut the array in half, and figure out which half our element might be in
			// {0, 1, 2, 3, 4, 5} -> {0, 1, 2} and {3, 4, 5}
			int newLength  = myArray.length/2;
			
			// make two new arrays
			// firstHalf: 0 --> newLength-1
			int firstHalf[] = sliceArray(myArray, 0, newLength - 1);
			// secondHalf: newLength --> myArray.length - 1 (go all the way to the last index in myArray)
			int secondHalf[] = sliceArray(myArray, newLength, myArray.length-1);
			
			// which half could our element be in?
			if (myElement >= secondHalf[0]) {
				// if the element is of the right size to be in the second half, continue searching in secondHalf
				return isElementInArray(secondHalf, myElement);
			} else {
				return isElementInArray(firstHalf, myElement);
			}
			
		}
	}
	
	public static int[] sliceArray(int[] myArray, int firstIndex, int lastIndex) {
		// Goal: {10, 20, 30, 40, 50}, firstIndex = 2, lastIndex = 4  -> {30, 40, 50}
		
		// create the array that I'm going to return
		// how many elements are in that array?
		int newLength = lastIndex - firstIndex + 1;
		// 4 - 2 + 1 = 3
		int[] newArray = new int[newLength];
		
		// Next, fill in newArray with elements from myArray
		int newIndex = 0;
		int oldIndex = firstIndex;
		while (newIndex < newLength) {
			// fill in the newArray
			newArray[newIndex] = myArray[oldIndex];
			// move to the next element
			newIndex++;
			oldIndex++;
		}
		return newArray;
	}
	
	
	
	
	
	
	
	
	
	
	

}
