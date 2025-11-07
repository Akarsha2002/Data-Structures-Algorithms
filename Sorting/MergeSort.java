package DSA_Using_Java.Sorting;
// Merge Sort

public class MergeSort {
	
	public void sort(int[] array, int[] temp, int low, int high) {
		if(low < high) { // base case
			int mid = low + (high - low)/2; // prevent overflow condition (low - high)/2
			sort(array, temp, low, mid); // left sub array
			sort(array, temp, mid + 1, high); // right sub array
			merge(array,temp, low, mid, high); // merging two arrays
		}
	}
	
	private void merge(int[] array, int[] temp, int low, int mid, int high) {
		for(int i = low; i <= high; i++) {
			temp[i] = array[i];
		}
		
		int i = low; // traverse left sorted sub array
		int j = mid+1; // traverse right sorted sub array
		int k = low; // will merge both arrays into original array
		
		// Merging sub arrays
		while(i <= mid && j <= high) {
			if(temp[i] <= temp[j]) {
				array[k] = temp[i];
				i++;
			}
			else {
				array[k] = temp[j];
				j++;
			}
			
			k++;
		}
		
		// if sub array exhausted
		while(i <= mid) {
    		array[k] = temp[i];
			k++;
			i++;
		}
	}
	
	public void printArray(int[] array) {
		for(int numbers : array) {
			System.out.print(numbers+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * Merge Sort is a divide and conquer algorithm.
		 * 
		 * Divide and Conquer recursively breaks down a problem
		 * into two or more sub-problems of the same or related 
		 * type, until these becomes simple enough to be solved 
		 * directly. The solution to the sub-problems are then 
		 * combined to give a solution to the original problem.
		 * 
		 * Divide - In this step the algorithm takes middle point 
		 * of array and divides the array into 2 halves. The algorithm 
		 * is carried out recursively for half arrays, until there are 
		 * no more half arrays to divide.
		 * 
		 * Conquer - In this step starting from the bottom, we sort and 
		 * merge the divide arrays and get the sorted array.
		 * 
		 * input: array = {2, 10, 5, 3, 6, 4, 11}
		 * output: temp[] = {2, 3, 4, 5, 6, 10, 11}
		 * 
		 */
		
		MergeSort ms = new MergeSort();
		int[] array = {2, 10, 5, 3, 6, 4, 11};
		ms.printArray(array);
		
		ms.sort(array, new int[array.length], 0, array.length - 1);
		ms.printArray(array);
	}
}
