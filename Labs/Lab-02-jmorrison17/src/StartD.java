// Josyah Morrison
// Lab-02
// BuildingBlocks.java

public class StartD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Question 1
		// makes the while loop for distinguishing positives and negatives and handling total calculating
		Magic.println("Please enter a positive number ");
		int y = Magic.nextInt();
		int total = 0; 
		while (y > 0 ) {
		 Magic.println("That's a positive number.");
		 total += y;
		 y = Magic.nextInt();
		 	if(y < 0) {
		 		Magic.println("That's a negative number, good job");
		 		Magic.println(total);
		 	}
		 
		}
		// Question 2
		// do loop that does the same thing as the while
		do {
	     Magic.println("That's a positive number.");
		 total += y;
		 y = Magic.nextInt();
		 
		}
			 while (y >= 0);
		     Magic.println("That was a negative number, the total of positives is  " + total);
		    
		   // Question 3
		     // This question works and fixes all of the temperature data
		     
		   int total2 = 0;
		   for(int temp = 0; temp< 5; temp++) { 
			   Magic.println("Enter 5 doubles for this weeks temperature");
			   int t = Magic.nextInt(); 
			   total2 += t;
		   }
		   
		   int avg5 = total2/5;
		   
		   if(avg5 < 0) {
			   Magic.println("Brrrrrrrrrrr!!!");
			  } else if(avg5 >= 0 || avg5 <= 32) {
			   Magic.println("It is freezing!");
			  } else if(avg5 > 32 || avg5 <= 50) {
				   Magic.println("I wish it were summer!");
			  } else if(avg5 > 50 || avg5 <= 65) {
				   Magic.println("It is getting warmer!");
			  } else if(avg5 > 65 || avg5 <= 80) {
				   Magic.println("It's really nice out!");
			  } else if(avg5 > 80 ) {
				  Magic.println("It's hot!");
			  }
		   // Question 4
		   // deciding if a number is even or odd numbers
		   
		   Magic.println("Input an integer");
		   int newInt = Magic.nextInt();
		   if(newInt % 2 == 0) {
			   Magic.println("even");
		   } else {
			   Magic.println("odd");
		   }
		   
		}
	}

