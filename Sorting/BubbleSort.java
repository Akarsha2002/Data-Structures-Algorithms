package DSA_Using_Java.Sorting;
// Bubble Sort

public class BubbleSort {
	
	public void bubbleSort(int[] array) {
		boolean isSwapped; // flag check if any swaps during pass
		int n = array.length; // number elements in an array
		
		/*
		 * Outer loop: runs (n - 1) times at most
		 * After each pass, the next largest element is placed in its correct position
		 */
		for(int i = 0; i < n - 1; i++) {
			isSwapped = false; // At the start of each pass, assume no swaps
			/*
			 * Inner loop: Comparing adjacent elements
			 * Each pass pushes the largest remaining element to the left
			 */
			for(int j = 0; j < n - 1 - i; j++) {
				
				// If the left element is larger than the right, swap them
				if(array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j + 1] = temp;
					isSwapped = true; // swap happened, so set flag true
				}
			}
			/*
			 * Optimized way: if no swaps happened in this pass
			 * the array is already sorted -> break early
			 */
			if(isSwapped == false) break;
		}
	}
	public void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		/*
		 * 1. It is also called as Sinking Sort.
		 * 2. While applying this sorting algorithm on unsorted array, the largest elements tend to sink at the end of the array.
		 * 3. It repeatedly compares pair of adjacent elements and swaps them if they are in wrong order.
		 * 
		 * number of elements - 1 -> number of iterations
		 * 
		 * input: [3, 1, 5, 2, 6, 4];
		 * 
		 * output: [1, 2, 3, 4, 5, 6]
		 * 
		 */
		
		BubbleSort b = new BubbleSort();
		int[] array = {3, 1, 5, 2, 6, 4};
		b.printArray(array);
		
		b.bubbleSort(array);
		b.printArray(array);
		

	}
}
