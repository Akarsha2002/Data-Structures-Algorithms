package DSA_Using_Java.LeetCode;

// Remove Element

public class RemoveElement {
	
	public int removeElement(int[] array, int val) {
		int i = 0;
		for(int j = 0; j < array.length; j++) {
			if(array[j] != val) {
				array[i] = array[j];
				i++;
			}
		}
		return i;
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
		 *  The order of the elements may be changed. Then return the number of elements in nums that are not equal to val 
		 *  
		 * Input: nums = [3, 2, 2, 3], val = 3
		 * Output: 2, nums = [2, 2, _, _]
		 * 
		 * Input: nums = [0, 1, 2, 2, 3, 0, 4, 2], val = 2
		 * Output: 5, nums = [0, 1, 4, 0, 3, _, _, _]
		 * 
		 */
		
		RemoveElement re = new RemoveElement();
		
		int result01 = re.removeElement(new int[] {0, 1, 2, 2, 3, 0, 4, 2}, 2);
		System.out.println(result01);
		
		int result02 = re.removeElement(new int[] {3, 2, 2, 3}, 3);
		System.out.println(result02);
		
	}
}