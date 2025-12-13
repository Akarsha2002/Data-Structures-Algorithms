 package DSA_Using_Java.LeetCode;
 
 // Remove Duplicates in Sorted Array
 
public class RemoveDuplicatesSortedArray {
	
	public static int removeDuplicates(int[] array) {
		int i = 1;
		for(int j = 1; j < array.length; j++) {
			if(array[j] != array[j - 1]) {
				array[i] = array[j];
				i++;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an integer array nums sorted in non-decreasing order,
		 *  remove the duplicates in-place such that each unique element 
		 *  appears only once. The relative order of the elements should 
		 *  be kept the same. The return the number of elements in nums.
		 *  
		 *  Input: nums = [1, 1, 2]
		 *  Output: 2, nums = [1, 2, _]
		 *  
		 *  Input: nums = [0, 0, 1, 1, 2, 2, 3, 3, 4, 4]
		 *  Output: 5, nums = [0, 1, 2, 3, 4, _, _, _, _, _]
		 *  
		 */
		
		System.out.println(removeDuplicates(new int[] {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}));
		System.out.println(removeDuplicates(new int[] {1, 1, 2}));
		
	}
}
