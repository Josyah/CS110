
public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean COC = 3 >= 3;
		Magic.println(COC);
		// Using == for comparison and = for assignment
		Magic.println(1==1);
		boolean e = 1 == 2;
		Magic.println(e);
		// != is not equals
		boolean f = 1 != 1;
		Magic.println(f);
		
		// if, else, and else if to determine segment of code to execute}
		//if has to be first, else if is middle and else in the end
		Magic.println("Enter an integer below");
		int newThing = Magic.nextInt();
		if(newThing<555) { 
			Magic.println("Good job, that's less than 555");
		}
		else {
			Magic.println("How the hell did you enter something greater than 555?!");
		}
		Magic.println("Enter an integer below");
		int userInt = Magic.nextInt();
		if(userInt>5) { 
			Magic.println("Good job, that's greater than 5");
		}
		else if(userInt<5) {
			Magic.println("That's less than 5, genius");
		}
		else if(userInt == 5) {
			Magic.println("Motherfucka that IS 5");
		}
		//For more complicated booleans use and(&&), or (||), and not (!)
		Magic.println("Enter another integer");
		int userInt2 = Magic.nextInt();
		if ( (userInt2<10) && (userInt2>0) ) {
			Magic.println("Nice");
		}
		Magic.println("Another integer, for testing or's");
		int userInpoo = Magic.nextInt();
		if ((userInpoo<10) || (userInpoo > 40)) {
			// OR
			Magic.println("Negative number or greater than 100");
		}
		Magic.println("This isn't in the if statement");
		Magic.println("Final question, more integers for NOT");
		int userInput2 = Magic.nextInt();
		if (!(userInput2<10)) {
			// NOT
			Magic.println("That's not too good");
		}
		
		
		//Comparing Strings
		// We use equalsIgnoreCase() to determine if Strings are equal
		Magic.println("Please enter two strings, one at a time");
		String strA = Magic.nextLine();
		String strB = Magic.nextLine();
		if(strA.equalsIgnoreCase(strB)) {
			Magic.println("Match! (ignoring case)");
		} else {
			Magic.println("No match...");
		}
		// Magic.fileExists(fileName)
		// Checks to see if a file exists
		int x = 0;
		while (x <= 100) {
			Magic.println(x);
			x++;
		}
		Magic.println("Done!");
		
		Magic.println("Please enter an integer, y2");
		int y2 = Magic.nextInt();
		while(y2 > 0) {
			Magic.println("y2 is greater than 0");
			Magic.println("Please enter another integer, y2");
			y2 = Magic.nextInt();
		}
		Magic.println("the Last number entered was ");
		Magic.println(y2);
		}
	}
