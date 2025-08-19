package DSA_Using_Java.Array;
// Find Minimum of Value of an array


public class ArraysExample07 {
	public int findMinimum(int[] arr) {
		// edge case
		if (arr == null || arr.length == 0) { // if array doesn't have anything or array of size = 0
			throw new IllegalArgumentException("Invalid Input..."); // Invalid Input
		} else {
			int min = arr[0]; // initially the minimum value will be 0th index value 
			for (int i = 1; i < arr.length; i++) { // Array traversal
				if (arr[i] < min) { // if array element less than assigned minimum
					min = arr[i]; // new minimum value assigned
				}
			}
			return min;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 5, 9, 3, 15, 1, 2 };
		
		ArraysExample07 a = new ArraysExample07();
		
		// edge cases
		// System.out.println(a.findMinimum(null)); // Invalid Input...
		// System.out.println(a.findMinimum(new int[0])); // Invalid Input...
		
		// test cases
		System.out.println(a.findMinimum(arr));

	}

}
