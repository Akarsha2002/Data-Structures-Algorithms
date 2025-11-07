package DSA_Using_Java.Sorting;
// Sort an array of 0s, 1s, and 2s (Dutch National Flag Problem)

public class DNFAlogorithm {
	
	public void threeNumbersSort(int[] array) {
		int i = 0; // i = current index being checked
		int j = 0; // j = boundary for next position of 0
		int k = array.length - 1; // boundary for next position of 2
		
		// Continue until i crosses k
		while(i <= k) {
			
			// Case 1: Current element is 0 -> Place 0 at the front (index j)
			if(array[i] == 0) {
				swap(array, i, j);
				i++; // Move forward
				j++; // Expand the 0 boundary
			}
			
			// Case 2: Current element is 1 -> Leave it in the middle
			else if(array[i] == 1) {
				i++; // Just move forward
			}
			
			// Case 3: Current element is 2 -> Place 2 at the end (index k)
			else if(array[i] == 2) {
				swap(array, i, k);
				k--; // Shrink the 2 boundary
				/*
				 * Notice: i not incremented here
				 * because the swapped element at index i
				 * might be 0, 1, or 2 -> needs re-check
				 */
			}
		}
	}
	
	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an array containing only 0's, 1's and
		 *    2's. Sort the array in linear time (O(n)) and
		 *    constant space (O(1))
		 *    
		 *    if i encounters 0 swaps with j
		 *    else if i encounters 1 does nothing
		 *    else if i encounters 2 swaps with k
		 *    
		 *    input = array[] = {0, 0, 1, 2, 0, 1, 2}:
		 *    output = sorted[] = {0, 0, 0, 1, 1, 2, 2};
		 * 
		 */
		
		DNFAlogorithm dnfa = new DNFAlogorithm();
		int[] array = {0, 0, 1, 2, 0, 1, 2};
		dnfa.printArray(array);
		
		dnfa.threeNumbersSort(array);
		dnfa.printArray(array);

	}
}
