package DSA_Using_Java.Sorting;
// Introduction to Quick Sort

public class QuickSort {
	
	// Recursive Method
	public void sortQuick(int[] array, int low, int high) {
		if(low < high) {
			// Partition: put pivot in correct place and return pivot index
			int p = partition(array, low, high);
			sortQuick(array, low, p-1); // Recursively sorted the left sub-array
			sortQuick(array, p+1, high); // Recursively sorted the right sub-array
		}
	}
	
	private int partition(int[] array, int low, int high) {
		int pivot = array[high]; // Choose last element as pivot
		int i = low; // traverse array
		int j = low; // keeps track of smaller elements section
		
		while(i <= high) { // Traverse from low -> high
			if(array[i] <= pivot) {
				
				// Swapping the logic
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				j++;
			}
			i++;
		}
		
		return j-1; // Return pivot index (now at correct position)
	}
	
	public void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * Quick Sort is a divide and Conquer algorithm.
		 * 
		 * 1. Pivot Section - We pick an element and mark it as pivot.
		 *    The pivot element can be first element, last element or 
		 *    any random element.
		 *    
		 * 2. Partitioning - We reorder the array such that all elements
		 *    greater than pivot comes after the pivot and all elements 
		 *    smaller than pivot comes before the pivot. The elements 
		 *    equal to pivot can go either side of the pivot. After 
		 *    this partitioning the pivot is at its correct sorted position.
		 *    
		 * 3. Recursion - Recursively apply the above steps on the sub-array 
		 *    formed to the left side of pivot and on the sub-array formed on 
		 *    the right side of the pivot.
		 * 
		 * a[low...high] so that a a[low...j-1] <= a[j] <= a[j+1...high]
		 * 1. low to j-1 --> Small & Equal to pivot
		 * 2. j to i-1 --> greater elements to pivot
		 * 3. i to high --> Yet to be traversed
		 * 
		 * input: array[] = {9, -3, 5, 2, 6, 8, -6, 1, 3};
		 * output: array[] = {-6, -3, 1, 2, 3, 5, 6, 8, 9};
		 * 
		 */
		
		QuickSort qs = new QuickSort();
		int[] array = {9, -3, 5, 2, 6, 8, -6, 1, 3};
		qs.printArray(array);

		qs.sortQuick(array, 0, array.length-1);
		qs.printArray(array);
		
	}
}