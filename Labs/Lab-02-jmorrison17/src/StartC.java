// Josyah Morrison
// Lab-02
// BuildingBlocks.java

public class StartC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Magic.println("How many students are in the class?");
		int numStudents = Magic.nextInt(); 
		Magic.println("Enter your students grades in, one at a time");
		// makes the gradeData array for numStudents
		int gradeData[] = new int[numStudents];
		int total;
		int maximum = 0;
		for(int index = 0; index < numStudents; index++) {
			int y = Magic.nextInt();
			gradeData[index] = y;
			maximum = maximum + y;	
		} // finishes classAvg and registers it
		int classAvg = maximum/numStudents;
		Magic.println(classAvg);
		Magic.simpleIntFileWrite("studentGrades.txt", gradeData);		
		
	}		
}
