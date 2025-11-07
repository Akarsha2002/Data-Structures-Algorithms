package DSA_Using_Java.Sorting;
// Selection Sort

public class SelectionSort {
	
	public void selectionSort(int[] array) {
		int n = array.length;
		
		// Outer loop: one by one, move the boundary of the unsorted part
		for(int i = 0; i < n - 1; i++) {
			int min = i;
			
			// Inner loop: find the index of the minimum element in the unsorted part
			for(int j = i + 1; j < n; j++) {
				if(array[j] < array[min]) {
					min = j; // Update index of new minimum
				}
			}
			
			// Swapping minimum element with 1st element of unsorted part
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
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
		 * 1. In selection sort we divide the given array
		 * into 2 parts sorted & unsorted part.
		 * 2. The algorithm sorts an array by repeatedly
		 * finding the minimum in an unsorted array 
		 * and making it part of the sorted array.
		 * 3. From unsorted part, we pick minimum element
		 * and swap it with leftmost element of unsorted part. 
		 * After swap, that element now becomes part of sorted array.
		 * 4. repeated till unsorted array is not empty.
		 * 
		 * Input: {3, 1, 5, 2, 6, 4}
		 * Output: {1, 2, 3, 4, 5, 6}
		 * 
		 */
		
		SelectionSort ss = new SelectionSort();
		int[] array = {3, 1, 5, 2, 6, 4};
		ss.printArray(array);
		
		ss.selectionSort(array);
		ss.printArray(array);
	}
}
