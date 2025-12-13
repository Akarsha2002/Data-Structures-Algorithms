package DSA_Using_Java.LeetCode;

// Maximum Sum Subarray of Size K

public class MaximumSumSubarray {
	
	public int maxSumSubarray(int[] array, int k) {
		// Initializing maxSum, windowSum, start
		int maxSum = 0;
		int windowSum = 0;
		int start = 0;
		
		// Taking Sum of each window
		for(int end = 0; end < array.length; end++) {
			windowSum += array[end];
			
			// If its out of bound than window
			if(end >= k - 1) {
				maxSum = Math.max(maxSum, windowSum); // Storing Maximum value
				windowSum -= array[start]; // Subtracting starting element of array
				start++; // shifting start pointer to next array element
			}
		}
		return maxSum; // returning maxSum
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an array of integer array, there is a sliding window of size k
		 * when is moving from the very left of the array to the very right. Find 
		 * the maximum sum of any contiguous subarray of size k.
		 * 
		 *  Example - 
		 *    Input: array {2, 7, 3, 5, 8, 1}, k = 3
		 *    Output: array = 16
		 *    
		 *    Window position                  Sum
		 *    [2 7 3] 5 8 1                     12
		 *    2 [7 3 5] 8 1                     15
		 *    2 7 [3 5 8] 1                     16
		 *    2 7 3 [5 8 1]                     14
		 * 
		 * Algorithm
		 * 1. Take sum of first k elements.
		 * 2. Subtract the element going out of the sliding window.
		 * 3. Add the new element coming in the sliding window.
		 * 
		 */
		
		MaximumSumSubarray mss = new MaximumSumSubarray();
		int result = mss.maxSumSubarray(new int[] {2, 7, 3, 5, 8, 1}, 3);
		System.out.println(result);
		
	}
}
