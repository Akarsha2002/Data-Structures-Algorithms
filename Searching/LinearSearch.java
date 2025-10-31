package DSA_Using_Java.Searching;
// Linear Search

public class LinearSearch {
	
	public int linearSearch(int arr[], int n, int x) {
		for(int i = 0; i < n; i++) { // array traversal
			if(arr[i] == x) { // comparing search key to array elements
				return i; // returns the index
			}
		}
		
		return -1; // return -1 -> search key not found
	}
	public static void main(String[] args) {
		// Doing Linear Search
		/*
		 * Input: arr[] = {5, 1, 9, 2, 10, 15, 20}
		 * search(arr, 7, 10) -> search(array, no. of elements, search key)
		 * return -1
		 * 
		 */
		LinearSearch ls = new LinearSearch();
		int array[] = {5, 1, 9, 2, 10, 15, 20};
		System.out.println("Element at the index: "+ls.linearSearch(array, 7, 10));
		System.out.println("Element at the index: "+ls.linearSearch(array, 7, 6));
		
		
		
	}
}
