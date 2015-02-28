/**
 * Author: Kristine Elaine P. Bautista
 * Program Description: Calculator of Simple Mathematical Functions
**/

public class MyCalculator {
	// add two numbers
	public float add(float a,float b){
		return a+b;
	}
	
	// subtract two numbers
	public float subtract(float a,float b){
		return a-b;
	}
	
	// multiply two numbers
	public float multiply(float a,float b){
		return a*b;
	}
	
	// divide two numbers
	public float divide(float a,float b){
		return a/b;
	}
	
	// x^2 of two numbers
	public float square(int x){
		return x*x;
	}
	
	// x^3 of three numbers
	public float cube(int x){
		return x*x*x;
	}
	
	// n! of an integer
	public static int nfactorial(int n){	
		int factorial = 1;	
		
		if(n<2){	//I added this portion
			return factorial;
		}
		
		for(int i=2;i<=n;i++)	//I edited this line; start with 2 bec 1 and 0 is just equal to 1
			factorial *= i;
		
		return factorial;
	}
	
	  public boolean find(int[] sortedValues, int value) {
	        return search(sortedValues, value, 0, sortedValues.length - 1);
	    }
	 
	    private boolean search(int[] sorted, int value, int leftIndex, int rightIndex) {
	 
	        // 1. index check
	        if (leftIndex > rightIndex) {
	            return false;
	        }
	 
	        // 2. middle index
	        int middle = (rightIndex + leftIndex) / 2;
	 
	        // 3. recursive invoke
	        if (sorted[middle] > value) {
	            return search(sorted, value, leftIndex, middle - 1);
	        } else if (sorted[middle] < value) {
	            return search(sorted, value, middle + 1, rightIndex);
	        } else {
	            return true;
	        }
	    }
	// binary search in an array
	public static int binarySearch(int[] a,int x){
		int n = a.length; // get number of elements in the array
		int lower, upper, middle; // variables for positions in the array
		lower = 0; upper = n-1; // initialize values of lower and upper points
		
		while(lower<=upper){
			middle = (lower+upper)/2;
			if (a[middle] == x){
				return middle;
			}
			if (a[middle] < x){
			   lower = middle + 1;
			}
			else
				upper = middle - 1;
		};
		return -1;	//never found
	}
	
}
