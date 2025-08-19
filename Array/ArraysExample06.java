package DSA_Using_Java.Array;
//Given an array or string, the task is to reverse the array or string.


public class ArraysExample06 {
	public static void reverseArray(int[] numbers, int start, int end) {
		while(start < end) { // loop runs start to end
			// swapping of two numbers
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++; // incrementing start - traverse array from left --> right
			end--; // decrementing end - traverse array from right --> left
		}
	}
	
	public static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		/*
		 * Given array of integers - {2, 11, 5, 10, 7, 8} 
		 * Solution - reversed array - {8, 7, 10, 5, 11, 2}
		 * reverseArray(int[] array, int start, int end) --> start = 0, end = array.length - 1
		 */
		
		int[] numbers = {2, 11, 5, 10, 7, 8};
		printArray(numbers);
		
		reverseArray(numbers, 0, numbers.length - 1);
		printArray(numbers);
		
	}
}
