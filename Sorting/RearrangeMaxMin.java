package DSA_Using_Java.Sorting;
// Rearrange the sorted array in max/min form

public class RearrangeMaxMin {
	
	public void rearrangeMaxMin(int[] array) {
		int maxIdx = array.length-1; // Start pointer at the last index (max element)
		int minIdx = 0; // Start pointer at first index (min element)
		
		/*
		 * Choose a number greater than the maximum element in array
		 * This help us 'encode' two numbers at the same index.
		 * 
		 */
		int max = array[maxIdx]+1;
		
		// Traversal the array and encode new values in the same array
		for(int i = 0; i < array.length; i++) {
			if(i%2 == 0) {
				/*
				 * At even index -> place maximum element
				 * Encode both old and new value
				 * array[i] = old_value + (new_value % max) * max
				 * 
				 */
				array[i] = array[i] + (array[maxIdx] % max) * max;
				maxIdx--; // Move max pointer to left
			}
			else {
				// At old index -> place minimum element
				array[i] = array[i] + (array[minIdx] % max) * max;
				minIdx++; // Move min pointer to right
			}
		}
		
		// Decode the new values by dividing each element by max
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i] / max;
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
		 * Q. Given sorted array of integers, rearrange array in such a way 
		 * that the first element position will be have the largest number, 
		 * the second will the smallest, the third will have the second-largest, 
		 * and so on. Using O(1) extra space.
		 * 
		 * Even index(largest) - array[i] = array[i] + (array[maxIdx] % max) * max;
		 * Odd index (smallest) - array[i] = array[i] + (array[minIdx] % max) * max;
		 * 
		 * max = array[maxIdx] + 1
		 * x can be split as => a and b
		 * x/max = a
		 * x%max = b
		 * 
		 * Example - 
		 *    Input: array[] = {1, 2, 3, 4, 5, 6, 7}
		 *    Output: array[] = {7, 1, 6, 2, 5, 3, 4}
		 *    
		 */
		
		RearrangeMaxMin rmm = new RearrangeMaxMin();
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		rmm.printArray(array);
		
		rmm.rearrangeMaxMin(array);
		rmm.printArray(array);
		
	}
}
