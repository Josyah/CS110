// Josyah Morrison
// Lab-03
// StartD.java

public class StartD {
	public static void main(String[] args) { // pushes all of the methods to work and run
//		promptUserGetInt("what is your favorite integer?");
//		promptUserGetString("What is your favorite String?");
//		daysInMonth(7);
		f2cint(32);
//		feetInchesToMeters(5,6.5);
//		countUp(0);
;	}
//	// method for the int with question 1, string is there and int is returned
//	public static int promptUserGetInt(String prompt) { 
//		Magic.println(prompt);
//		int integer = Magic.nextInt();
//		return integer;
//	} // string is returned but the method is for prompting the userGetString
//	public static String promptUserGetString(String prompt) { 
//		Magic.println(prompt);
//		String userInput = Magic.nextLine();
//		return userInput;
//	} // this one will be for days in a month, allowing the user to figure out how many days are in each month
//	public static int daysInMonth(int month) { 
//		//declaring all the main variables to use through the file
//	    int Jan = 31;
//	    int Feb = 28;
//	    int Mar = 31;
//	    int Apr = 30;
//	    int May = 31;
//	    int Jun = 30;
//	    int Jul = 31;
//	    int Aug = 31;
//	    int Sep = 30;
//	    int Oct = 31;
//	    int Nov = 30;
//	    int Dec = 31;
//	    
//	      if(month == 1){
//	        Magic.println(Jan);// assigns a number value for the month
//	      }
//	      else if(month == 2){
//	    	  Magic.println(Feb);// assigns a number value for the month
//	      }
//	      else if(month == 3){
//	    	  Magic.println(Mar); // assigns a number value for the month
//	      }
//	      else if(month == 4){
//	    	  Magic.println(Apr); // assigns a number value for the month
//	      }
//	      else if(month == 5){
//	    	  Magic.println(May); // assigns a number value for the month
//	      }
//	      else if(month == 6){
//	    	  Magic.println(Jun); // assigns a number value for the month
//	      }
//	      else if(month == 7){
//	    	  Magic.println(Jul); // assigns a number value for the month
//	      }
//	      else if(month == 8){
//	    	  Magic.println(Aug); // assigns a number value for the month
//	      }
//	      else if(month == 9){
//	    	  Magic.println(Sep); // assigns a number value for the month
//	      }
//	      else if(month == 10){
//	    	  Magic.println(Oct); // assigns a number value for the month
//	      }
//	      else if(month == 11){
//	    	  Magic.println(Nov); // assigns a number value for the month
//	      }
//	      else if(month == 12){
//	    	  Magic.println(Dec); // assigns a number value for the month
//	      }
//	    return month;
//	
//	}
	public static double f2cint(double degreeF) {
		double degreeC =((((int)degreeF *1000)- 32.0)*((double)5/9))/1000; // degree stuff resolving itself, changing F to C
		Magic.println(degreeC);
		return degreeC;
	}
//	public static int feetInchesToMeters(int feet, double inches) { // adds feet and inches up from user input and turns it into meters
//		
//		double meters = (feet * .3048) + (inches * .0254);
//		Magic.println("Converted from feet to inches, you got a total of " + meters + " meters");
//		return feet; 
//	}
//	public static void countUp(int x) { // adds +1 to x while it's over 0
//		Magic.println("The count is " + x);
//		countUp(x+1) ;
//	}
		
}