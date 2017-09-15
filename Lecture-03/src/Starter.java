
public class Starter {

	public static void count(int x) {
		// method that counts from x down to 0, recursively
		Magic.println("The count is " + x + "."); 
		if (x == 0) {
			// if x is zero then we stop counting and return nothing to end the method
			return;
		}  else {
			count(x - 1); // otherwise, reduce the count by 1 and begin again
			// test the count method
			count(5);
		}
	}
	// write a method to calculate the n'th indexed fibonacci number
	public static int fib(int n); {
		// input: an index n
		// output: the n'th fibonacci number
		
		// for recursive functions, we need a base case(s) and recursive step
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			// recursive step
			// to get the nth number, add the (n-1) and (n - 2) numbers together
			return fib(n - 1) + fib(n - 2); 
		}
	}
	
}

