package DSA_Using_Java.Searching;
// Interesting: Search Insert Position

public class SearchInsert {
	
	public int searchInsert(int[] array, int target) {
		int low = 0;
		int high = array.length;
		
		while(low <= high) {
			
			// this mid formula used to prevent integer overflow 
			// (the sum becomes bigger than the max value an int can hold)
			int mid = low + (high - low)/2;
			
			if(target == array[mid]) { // if we got target
				return mid; // return the target index 
			}
			else if(target < array[mid]) { // target less the array element
				high = mid - 1; // high shifts to previous of mid index
			}
			else {
				low = mid + 1; // high shifts to next of mid index
			}
		}
		
		return low; // return low index if the target's index not found
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a sorted array of distinct integers and a target value,
		 * return the index if the target is found. if not, return the index
		 * where it would be if it were inserted in order.
		 * The algorithm should run in O(log n) time.
		 * 
		 * Example:
		 * Input: arr = {1, 3, 5, 7}, target = 5, Output: 2
		 * Input: arr = {1, 3, 5, 7}, target = 2, Output: 1
		 * Input: arr = {1, 3, 5, 7}, target = 8, Output: 4
		 * Input: arr = {1, 3, 5, 7}, target = 0, Output: 0
		 * 
		 * Array[] = {1, 10, 20, 47, 59, 65, 75, 88, 99}
		 * target = return mid else return low
		 * 
		 */
		
		SearchInsert si = new SearchInsert();
		int[] array = {1, 10, 20, 47, 59, 65, 75, 88, 99};
		System.out.println("Element must be present in index: "+si.searchInsert(array, 20));
		System.out.println("Element must be present in index: "+si.searchInsert(array, 90));
		System.out.println("Element must be present in index: "+si.searchInsert(array, 0));
		
	}
}
