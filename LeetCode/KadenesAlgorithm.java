package DSA_Using_Java.LeetCode;

// Maximum Sum Subarray (Kadane's Algorithm)

public class KadenesAlgorithm {
	
	public static int maxSubArraySum(int[] array) {
		// initialization
		int currentMax = array[0];
		int maxSoFar = array[0];
		
		// Array Traversal
		for(int i = 1; i < array.length; i++) {
			currentMax += array[i]; // Elements become part of current subarray
			
			// Condition for element become its own subarray 
			if(currentMax < array[i]) {
				currentMax = array[i]; // Assign new element to currentMax
			}
			
			// new sum of maxSoFar
			if(maxSoFar < currentMax) {
				maxSoFar = currentMax; // Assign currentMax to maxSoFar
			}
		}
		
		return maxSoFar;
	}
	
	public static void main(String[] args) {
		/*
		 * [4, 3, -2, 6, -12, 7, -1, 6]
		 * 
		 * Conditions of Kadene's Algorithm
		 * Q. Should i become part of current subarray?
		 *                    or
		 * Q. Should i start a new subarray?
		 * 
		 * Maximum Subarray
		 * 1. 4+3+(-2)+6 = 11
		 * 2. 7+(-1)+6 = 12
		 * 
		 * currentMax
		 * 4, {4}
		 * 7, {4, 3}
		 * 5, {4, 3, -2}
		 * 11, {4, 3, -2, 6}
		 * -1, {4, 3, -2, 6, -12}
		 * 7, {7}
		 * 6, {7, -1}
		 * 12, {7, -1, 6}
		 * 
		 * maxSoFar / bestSum
		 * 4, {4}
		 * 7, {4, 3}
		 * 7, {4, 3}
		 * 11, {4, 3, -2, 6}
		 * 11, {4, 3, -2, 6}
		 * 11, {4, 3, -2, 6}
		 * 11, {4, 3, -2, 6}
		 * 12, {7, -1, 6}
		 * 
		 * currentMax = Math.max(currentMax + array[i], array[i])
		 *                          Q1                     Q2
		 */
		
//		DPExample03 dpe03 = new DPExample03();
		int result = maxSubArraySum(new int[] {4, 3, -2, 6, -12, 7, -1, 6});
		System.out.println(result);
		
	}
}							