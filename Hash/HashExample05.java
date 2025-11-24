package DSA_Using_Java.Hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Contains Duplicate

public class HashExample05 {
	
	public boolean containsDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i])) {
				return true;
			}
			else {
				set.add(nums[i]);
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		/*
		 * Q. Given an integer array nums, return true if any values
		 * appears at least twice in the array, and return false if 
		 * every element is distinct.
		 * 
		 *  Input: nums = [1, 2, 3, 1]
		 *  Output: true
		 *  
		 *  Input: nums = [1, 2, 3, 4]
		 *  Output: false
		 *  
		 *  Which is solved by the HashSet Data Structure
		 *  Time Complexity: O(n)
		 */
		
		HashExample05 hash = new HashExample05();
		int[] nums = new int[] {1, 3, 5, 4, 6};
		boolean result = hash.containsDuplicates(nums);
		System.out.println(Arrays.toString(nums)+" Contains Duplicates: "+result);

	}

}
