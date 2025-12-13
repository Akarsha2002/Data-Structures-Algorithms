package DSA_Using_Java.LeetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	
	public static int[] productOfArrayExceptSelf(int[] array) {
		int temp = 1;
		int[] result = new int[array.length];
		
		/*
		 * 1st Pass - Left Product Pass
		 * In this loop, result[i] will store
		 * product of all elements *to the left* of index i
		 * 
		 */
		for(int i = 0; i < array.length; i++) {
			result[i] = temp; // temp currently holds product of all elements before i
			temp = temp * array[i]; // update temp by multipling array[i] for next iteration
		}
		
		temp = 1; // Reset temp for right-side product
		
		/*
		 * 2nd Pass - Right Product Pass
		 * The loop multiplies the right-side element's product
		 * into result[i]
		 * 
		 */
		for(int i = array.length - 1; i >= 0; i--) {
			/*
			 * Multiply the left product already stored in result[i]
			 * By the product of all elements to the right
			 *  
			 */
			result[i] = result[i] * temp;
			temp = temp * array[i]; // update temp for next index on the left
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an array of integers array[], return an array result[] such
		 *  that result[i] is equal to the product of all the elements of array
		 *  except array[i]. The product fit in 32-bit integer. The algorithm 
		 *  should run in O(n) time and without using division operator.
		 *  
		 *  Example - 
		 *     Input: array = {1, 2, 3, 4}
		 *     Output: result = {24, 12, 8, 6}
		 *     
		 *     
		 *     Input: array = {-1, 1, 0, -3, 3}
		 *     Output: result = {0, 0, 9, 0, 0}
		 *  
		 */
		
		System.out.println(Arrays.toString(productOfArrayExceptSelf(new int[] {1, 2, 3, 4})));
		
		int[] result = productOfArrayExceptSelf(new int[] {-1, 1, 0, -3, 3});
		System.out.println(Arrays.toString(result));

	}
}			