package DSA_Using_Java.Sorting;
// Squares of the Sorted Array

public class SquareOfArray {
	
	public int[] sortedSquare(int[] array) {
		int n = array.length;
		int[] result = new int[n]; // Final array to store sorted squares
		
		// Two pointers
		int i = 0, j = n-1;
		
		// Fill the result array from the end (largest square first)
		for(int k = n-1; k >= 0; k--) {
			
			/*
			 * Compare absolute values because negative number
			 * might give larger square than positive numbers
			 * 
			 */
			if(Math.abs(array[i]) > Math.abs(array[j])) {
				
				// If left value is bigger, square it and put it at position k
				result[k] = array[i] * array[i];
				i++; // Move left pointer forward
			}
			else {
				
				// If right value is bigger (or equal), square it and put at position k
				result[k] = array[j] * array[j];
				j--; // Move right pointer backward
			}
		}
		
		return result; // Return the sorted square array
	}
	
	public void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an integer array sorted in ascending order, 
		 * return an array of the squares of each number sorted 
		 * in ascending order.
		 * 
		 * Example - 
		 *    Input: array[] = {-4, -1, 0, 3, 10}
		 *    Output: array[] = {0, 1, 9, 16, 100}
		 *    
		 * Explanation: After squaring, the array becomes 
		 * [16, 1, 0, 9, 100] After sorting, it becomes [0, 1, 9, 16, 100]
		 * 
		 */
		
		SquareOfArray sa = new SquareOfArray();
		int[] array = {-4, -1, 0, 3, 10};
		sa.printArray(array);
		
		int[] result = sa.sortedSquare(array);
		sa.printArray(result);
	}
}
