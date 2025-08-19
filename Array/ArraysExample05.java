package DSA_Using_Java.Array;

// Given an array or string, the task is to reverse the array or string.


public class ArraysExample05 {

	public static void main(String[] args) {
		/*
		 * Given array of integers - {2, 11, 5, 10, 7, 8} 
		 * Solution - reversed array - {8, 7, 10, 5, 11, 2}
		 * 
		 */

		int[] arr = { 2, 11, 5, 10, 7, 8 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
