// Josyah Morrison
// Lab-04
// StartC.java
import java.util.Arrays;
public class StartC {
	public static void main(String[] args) {
		// calls the gpa calculator method
		gpaCalculator();
	}
	public static void gpaCalculator() {
		// creates the method and asks how many classes the've taken
		Magic.println("How many classes have you taken?");
		int classesTaken = Magic.nextInt();
		// creates the string for the class grades with the class taken as the distance of the array
		String classGrades[] = new String [classesTaken];
		double gpa[] = new double [classesTaken];
		// creates the double for GPA and makes it = double[classesTaken]
		for(int i = 0; i < classesTaken; i++ ){
			// Prints the letter grade for the class then adds one until the i<classesTaken
			Magic.println("What was your letter grade in class " + (i+1));
			String input = Magic.nextLine();
			input = input.toLowerCase();
			classGrades[i] = input;
			String formattedInput=input.replaceAll("\\+","plus");
			// This switch goes through with the formattedInput and determines the letter grades
			switch (formattedInput) {
			// creates letter grades within the switch
			case "f":
			gpa[i] = 0.0;
			break;
			case "d-":
			gpa[i] = (0.7);
			break;
			case "d":
			gpa[i] = (1.0);
			break;
			case "dplus":
			gpa[i] = (1.3);
			break;
			case "c-":
			gpa[i] = (1.7);
			break;
			case "c":
			gpa[i] = (2.0);
			break;
			case "cplus":
			gpa[i] = (2.3);
			break;
			case "b-":
			gpa[i] = (2.7);
			break;
			case "b":
			gpa[i] = (3.0);
			break;
			case "bplus":
			gpa[i] = (3.3);
			break;
			case "a-":
			gpa[i] = (3.7);
			break;
			case "a":
			gpa[i] = (4.0);
			break;
			case "aplus":
			gpa[i] = (4.0);
			break;
			}
		} // finds the total by adding the total+gpa[x]
		double total = 0.0;
		for(int x=0; x<gpa.length ; x++) {
			total = total+gpa[x];
		} // doubletoint will multiply int by total*100 and then be divided 
		int doubleToInt = (int) (total*100);
		int gpaLength = gpa.length;
		double average = doubleToInt/(gpaLength);
		Magic.println(average/100);

	}

}
