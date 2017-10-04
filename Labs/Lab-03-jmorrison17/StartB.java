
// Josyah Morrison
// Lab-03
// StartB.java
public class StartB{
  public static void main(String[] args){
	  calculateGrades();
  }
  // converts the grade from a number system to standard lettering
  public static String convertGradeToLetter(Integer grade){
    String letter = "F";
    if (grade>97){
      letter = "A+";
    }
    else if (grade>93){
      letter = "A";
    }
    else if (grade>89){
      letter = "A-";
    }
    else if (grade>86){
      letter = "B+";
    }
    else if (grade>83){
      letter = "B";
    }
    else if (grade>79){
      letter = "B-";
    }
    else if (grade>76){
      letter = "C+";
    }
    else if (grade>73){
      letter = "C";
    }
    else if (grade>69){
      letter = "C-";
    }
    else if (grade>66){
      letter = "D+";
    }
    else if (grade>63){
      letter = "D";
    }
    else if (grade>=60){
      letter = "D-";
    }
    else {
      letter = "F";
    }

    return letter;
  }
  // calculates the grade with equations and array use
  public static int calculateGrade(int[] gradeArray, int[] weightArray){
    int total = 0;
    int grade;
    for(int i=0;i<gradeArray.length;i++){
      grade = (gradeArray[i])*(weightArray[i]);
      total = total+grade;
    }
    total = total/100;
    return total;
  }
  // uses static int getStudentInfo to retrieve student's personal information
  static int[] getStudentInfo(String name){
	int[] gradeArray = new int[3];
    Magic.println(name+"'s exam average:");
    int exam = Magic.nextInt();
    gradeArray[0] = exam;
    Magic.println(name+"'s lab average:");
    int lab = Magic.nextInt();
    gradeArray[1] = lab;
    Magic.println(name+"'s paritcipation grade:");
    int participation = Magic.nextInt();
    gradeArray[2] = participation;
    return gradeArray;
  }
  // does more for calcualting the grades of the student
  static void calculateGrades(){
    Boolean howManyStudents = true;
    Boolean whatWeight = false;
    Boolean addStudents = false;
    int examw = 0;
    int labw = 0;
    int participationw = 0;
    while(howManyStudents){
      Magic.println("How many students are in the class?");
      int res = Magic.nextInt();
      if(res>0){
        howManyStudents = false;
        whatWeight = true;
      } else{
        Magic.println("That is not a valid response");
      }
    }
    while(whatWeight){
    	
      Magic.println("How much is the exam grade weighted?");
      examw = Magic.nextInt();
      Magic.println("How much is the lab grade  weighted?");
      labw = Magic.nextInt();
      Magic.println("How much is the participation grade weighted?");
      participationw = Magic.nextInt();
      if((examw+labw+participationw)==100){
        whatWeight = false;
        addStudents = true;
      } else{
        Magic.println("That does not add up to 100%");
      }
    }
    while(addStudents){
    	
        Magic.println("Student's first name: ");
        String name = Magic.nextLine();
        int[] weightArray=new int [3];
        weightArray[0] = examw;
        weightArray[1] = labw;
        weightArray[2] = participationw;
        int grade = calculateGrade(getStudentInfo(name), weightArray);
        
        Magic.println(name+": "+grade+", "+convertGradeToLetter(grade));
        addStudents=false;
      }
  } // other loop-esc statements work on that same thing, and asking questions/containing this information
}
