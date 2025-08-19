package DSA_Using_Java.Array;
// Removing even integers from an integer array

public class ArraysExample03 {

	public void removeEven(int[] array) {
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * input: arr = {3, 2, 4, 7, 10, 6, 5} output: arr = {3, 7, 5} even number =
		 * number % 2 == 0
		 */

		ArraysExample03 a = new ArraysExample03();
		
		int[] arr = { 3, 2, 4, 7, 10, 6, 5 };
		a.removeEven(arr);
		
	}
}
