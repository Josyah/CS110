// Josyah Morrison
// Lab-04
// StartB.java
import java.util.Arrays;
public class StartB{
	public static void main(String[] args) {
		calculateItemAverage(collectGrades("quiz", 2, 4), null);
	} // creates the grade collecting array
	public static int[][] collectGrades(String category, int students, int items) {
		int[][] gradesInt = new int[students][items];
		switch(category){
		// determines the categories, quiz, and sets parameters behind it
			case "quiz":
				int numStudents = 2;
				int numItems = 4;
				int quizNumber = 0;
				for(int i=0;i<students;i++){
					for(int x=0;x<items;x++){
						Magic.println("Please enter student "+i +"'s' grade on quiz "+x);
						gradesInt[i][x] = Magic.nextInt();
					}
				}
				break;
		}
		return gradesInt;
	}

	public static int[] calculateItemAverage(int[][] myArray, String category) {
		int total = 0;
		// calculates item average and stores it in a 2d array
		int average =0;
		int length = myArray[1].length;
		int secondLength = myArray[1].length;
		int averages[] = new int[secondLength];
		// works through the mathematics of the array to average an item 
		for(int i=0;i < length; i++){ //assignment
			for(int x=0; x< myArray[0].length; x++){ //student
				total= total + myArray[x][i];
			}
			average = total/length;
			Magic.println(average);
			averages[i] = average;
		}
		return averages;
	}
}
