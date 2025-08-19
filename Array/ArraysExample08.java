package DSA_Using_Java.Array;
// Find second maximum value in an array


public class ArraysExample08 {
public static void secondMaximum(int[] arr) {
	// initializing max and secondMax will be Integer.MIN_VALUE = -2447483648
	int max = Integer.MIN_VALUE;
	int secondMax = Integer.MIN_VALUE;
	
	for(int i = 0; i < arr.length; i++) {
		if(arr[i] > max) { // if array element > assigned maximum
			secondMax = max; // assigned secondMax value reassign with max value
			max = arr[i]; // assigned max value reassigned with array element
		}
		/*
		 * else if array element > secondMax AND 
		 * array element not equal to max value
		 * secondMax assigned with that array element
		 */
		
		else if(arr[i] > secondMax && arr[i] != max) {
			secondMax = arr[i];
		}
		
	}
	
	System.out.println(secondMax);
	
}
	public static void main(String[] args) {
		/*
		 * Given an array of integers, return 2nd maximum value.
		 * The 2nd maximum value exists.
		 * input: arr = {12, 34, 2, 34, 33, 1}
		 * output: 33
		 * Integer.MIN_VALUE = -2447483648
		 * 
		 */
		
		int[] arr = {13, 34, 2, 34, 33, 1};
		
		secondMaximum(arr);
		
	}
}
