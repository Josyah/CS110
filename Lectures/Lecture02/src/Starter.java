//Catie Patterson
// Lecture 02
// Starter.java

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// >, <, >=, <=
		boolean a = 2 < 3;
		Magic.println(a);
		boolean b = 3 >= 2;
		Magic.println(b);
		boolean c = 3 < 2;
		Magic.println(c);
		boolean d = 3 <= 3;
		Magic.println(d);
		
		// == (comparison) vs. = (assignment)
		Magic.println(1==1);
		boolean e = 1 == 2;
		Magic.println(e);
		
		// != (not equals)
		boolean f = 1 != 1;
		Magic.println(f);
		boolean g = 1 != 2;
		Magic.println(g);
		
		// if, else, else if
		Magic.println("Please enter an integer.");
		int userInt = Magic.nextInt();
		if (userInt > 5) {
			Magic.println("Greater than 5.");
		} else if (userInt > 2) {
			Magic.println("Less than or equal to 5 and greater than 2.");
		} else if (userInt == 2) {
			Magic.println("Equal to 2.");
		} else {
			Magic.println("Less than 2.");
		}
		
		// Boolean operations: Not, Or, And
		Magic.println("Please enter another integer.");
		int userInt2 = Magic.nextInt();
		if (userInt2 > 0 && userInt2 < 10) {
			// AND
			Magic.println("Greater than 0 and less than 10");
			int newInt = 1;
			Magic.println(newInt+1);
			Magic.println("I can do more stuff in an if");
		} else if (userInt2 < 0 || userInt2 > 100) {
			// OR
			Magic.println("Negative number or greater than 100");
		} else if (userInt2 > 100) {
			Magic.println("This will never happen.");
		}
		
		if (userInt2 > 100) {
			Magic.println("Greater than 100");
		}
		
		if (userInt2 < 1) {
			Magic.println("Another if statement");
		}
		
		if (!(userInt2 < 7)) {
			// NOT
			// false becomes true and true becomes false
			Magic.println("not less than 7.");
		}
		
		Magic.println("This isn't in the if statement");
		
		
		// Comparing Strings
		Magic.println("Please enter two strings, one at a time.");
		String strA = Magic.nextLine();
		String strB = Magic.nextLine();
		Magic.println(strA);
		Magic.println(strB);
		if (strA.equalsIgnoreCase(strB)) {
			Magic.println("Match! (ignoring case)");
		} else {
			Magic.println("Not a match...");
		}
		
		
		// Does this file exist?
		boolean fileIsMade = Magic.fileExists("userInts.txt");
		Magic.println(fileIsMade);
		
		int myArray[] = {userInt,userInt2};
		Magic.simpleIntFileWrite("userInts.txt", myArray);
		
		boolean fileIsMade2 = Magic.fileExists("userInts.txt");
		Magic.println(fileIsMade2);
		
		// Count from 0 to 100
		int count = 0;
		Magic.println(count);  // 0
		count++;
		Magic.println(count);  // 1
		count++;
		Magic.println(count);  // 2
		
		// use a loop to speed this up
		Magic.println("start");
		int counter = 0;
		while (counter <= 100) {
			Magic.println(counter);
			counter++;
		}
		Magic.println("done!");
		Magic.println(counter);
		
		// Do while: guarantees that the stuff in the curly brackets happens at least once
		
		Magic.println("start do while");
		int y = 0;
		do {
			Magic.println(y);
			y++;
		} while (y <= 100);
		Magic.println("end do while");
		Magic.println(y);
		
		
		
		
		
		
		
	}

}
