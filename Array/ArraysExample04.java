package DSA_Using_Java.Array;
//Removing even integers from an integer array

public class ArraysExample04 {
	public static void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int[] removeEven(int[] arr) {
		int oddCount = 0; // dynamically initializing oddCount counting odd numbers
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++; // incrementing count when element is not even
			}
		}

		int[] result = new int[oddCount]; // result array with size of oddCount
		int index = 0; // dynamically initializing index to traverse the resulted array
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				result[index] = arr[i]; // Assigning odd values to the resulted array
				index++; // incrementing the index of resulted array
			}
		}
		return result;
	}

	public static void main(String[] args) {
		/*
		 * input: arr = {3, 2, 4, 7, 10, 6, 5} output: arr = {3, 7, 5} even number =
		 * number % 2 == 0
		 */

		int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
		printArray(arr);

		int[] result = removeEven(arr);
		printArray(result);

	}
}
