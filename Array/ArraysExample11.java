package DSA_Using_Java.Array;
// Find the Missing Number in an array
// returns int
public class ArraysExample11 {
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public int missingNumber(int[] arr) {
		int n = arr.length + 1; // total number of elements + missing one element
		int sum = (n * (n + 1)) / 2; // sum of first n natural numbers
		for (int num : arr) { // ForEach loop or Enhanced for loop for satisfies O(n) constraints
			sum = sum - num; // reducing sum till get missing number
		}
		return sum; // return missing number
	}

	public void arrayDemo() {
		int[] arr = { 1, 3, 6, 8, 2, 4, 7 };
		printArray(arr);
		
		System.out.println("The missing value from an array: "+missingNumber(arr));
	}

	public static void main(String[] args) {
		/*
		 * Given an array of n-1 distinct numbers in the range of 1 to n. Find the
		 * missing numbers in it. input: arr[] = {2, 4, 1, 8, 6, 3, 7} output: 5
		 * Explanation: The missing number from range 1 to 8 is 5 constraint: Time
		 * complexity: O(n) Mathematical approach: Sum of first n natural numbers S(n) =
		 * 1 + 2 + 3 + 4 + ... + n = (n*(n+1))/2
		 */

		ArraysExample11 a = new ArraysExample11();
		a.arrayDemo();
	}

}
