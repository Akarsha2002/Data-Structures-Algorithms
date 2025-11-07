package DSA_Using_Java.Sorting;
// Insertion Sort

public class InsertionSort {
	
	public void insertionSort(int[] array) {
		int n = array.length; // Get the length
		
		// outer loop: i points to the current element in the "unsorted" part
		for(int i = 1; i < n; i++) { // unsorted part -> start at 1 since 1st element already sorted
			
			// Store the current element (the one we want to insert in the right place)
			int temp = array[i];
			int j = i - 1; // j points to the last index of the "sorted" part
			
			/*
			 * Inner loop: move elements greater than temp one step ahead
			 * (Shift larger element to the right to make room for temp)
			 * 
			 */
			while(j >= 0 && array[j] > temp) {
				array[j + 1] = array[j]; // shifting larger elements to temp by 1 position
				j--; // move left
			}
			
			array[j + 1] = temp; // Place temp in the correct sorted position
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
		 * 1. Insertion sort is a simple sorting algorithm that works the way
		 * we sort playing cards in our hand.
		 * 2. In insertion sort we divided the given array into two parts
		 * sorted part and unsorted part.
		 * 3. From unsorted part, we take 1st element and place at its 
		 * corrected position in sorted array. This is done by shifting all the
		 * elements which are larger then first element by one position.
		 * 4. Its repeated till unsorted array is not empty
		 * 
		 * input: {3, 1, 5, 2, 6, 4} left -> sorted, right -> unsorted
		 * output: {1, 2, 3, 4, 5, 6}
		 * 
		 */
		
		InsertionSort i = new InsertionSort();
		int[] array = {3, 1, 5, 2, 6, 4};
		i.printArray(array);
		
		i.insertionSort(array);
		i.printArray(array);
		

	}
}
