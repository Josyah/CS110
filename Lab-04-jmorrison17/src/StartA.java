// xosyah Morrison
// Lab-04
// StartA.xava

public class StartA {
	public static void main(String[] args) {
		int[][] matrix = new int[][]{
			{1,2,3},
			{4,6,5}
			};
		bubbleSort(flatten(matrix));
		// creates a matrix for flattening the 2d array to a 1 dimensional one
	}
	public static int[] flatten(int[][] arrayOfInts) {

        int counter = 1;
        for(int i = 0; i < 2; i++) {
            for(int x = 0; x < 3; x++) {
                arrayOfInts[i][x] = counter++;
            }
        }

        int newArray[] = new int[arrayOfInts.length*arrayOfInts[0].length];
        for(int i = 0; i < arrayOfInts.length; i++) {
        	// this array contributes to the previous one, using the length and the 0th length to work
        	// through mathematic details
            int[] row = arrayOfInts[i];
            for(int x = 0; x < row.length; x++) {
                int number = arrayOfInts[i][x];
                newArray[i*row.length+x] = number;
                // the row is set equal to the arrayOfInts[userInput]
            }
        } // this for loop prints the newArray[i(nput)]
        for(int i = 0; i < newArray.length; i++) {
            Magic.println(newArray[i] + " ");
        }
        
        return newArray;
	}
	public static int[] bubbleSort(int[] arrayOfInts) {
		// final array works through bubbleSorting method
        int n = arrayOfInts.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int x=1; x < (n-i); x++){  // mathematics below pulls various inputdetails from the array and works through it
                          if(arrayOfInts[x-1] > arrayOfInts[x]){  
                                 //swap elements  
                                 temp = arrayOfInts[x-1];  
                                 arrayOfInts[x-1] = arrayOfInts[x];  
                                 arrayOfInts[x] = temp;  
                         }  
                          
                 }  

	}
         return arrayOfInts;
}}