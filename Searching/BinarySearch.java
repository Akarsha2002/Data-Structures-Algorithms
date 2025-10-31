package DSA_Using_Java.Searching;
// Binary Search -> Divide and Conquer Algorithm

public class BinarySearch {
	public int searchBinary(int[] array, int key) {
		int low = 0;
		int high = array.length - 1;
		
		while(low <= high) { // complete traversal of array
			int mid = (low + high)/2; // find middle value
			if(key == array[mid]) {
				return mid; // if search found return mid index
			}
			else if(key < array[mid]) { 
				high = mid - 1; // if search less than middle value of array then decrement mid value assign to high 
			}
			else {
				low = mid + 1; // else increment mid value assign to low
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		/*
		 * Array[] = {1, 10, 20, 47, 59, 65, 75, 88, 99}
		 * search(65) -> return mid else return -1 if not found
		 * 
		 */
		// Doing Binary Search
		BinarySearch bs = new BinarySearch();
		int[] array = {1, 10, 20, 47, 59, 65, 75, 88, 99};
		
		System.out.println("Element at the position: "+bs.searchBinary(array, 65));
		System.out.println("Element at the position: "+bs.searchBinary(array, 100));
	}
}
