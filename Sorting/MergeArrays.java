package DSA_Using_Java.Sorting;
// Merge Two Sorted Arrays

public class MergeArrays {
	
	public int[] mergedArray(int[] arr1, int[] arr2, int n, int m) {
		int[] result = new int[n+m];
		int i = 0, j = 0, k = 0; // traversal of arr1, arr2, result array
		
		while(i < n && j < m) { // boundary conditions
			if(arr1[i] < arr2[j]) { // sorting comparison
				result[k] = arr1[i]; // store arr1 element to result
				i++;
			}
			else {
				result[k] = arr2[j]; // store arr2 element to result
				j++;
			}
			
			k++;
		}
		
		// Either arr1 got exhausted or arr2 get exhausted
		
		while(i < n) { // arr2 got exhausted
			result[k] = arr1[i]; // storing arr1 element into result
			i++;
			k++;
		}
		
		while(j < m) { // arr1 got exhausted
			result[k] = arr2[j]; // storing arr2 element into result
			j++;
			k++;
		}
		
		return result;
	}
	
	public void printArray(int[] result) {
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		/*
		 * arr1[] = {2, 3, 5, 10}
		 * arr2[] = {4, 6, 11, 15};
		 * result[] = {2, 3, 4, 5, 6, 10, 11, 15}
		 * 
		 */
		
		MergeArrays msa = new MergeArrays();
		
		int[] arr1 = {2, 3, 5, 10};
		int[] arr2 = {4, 6, 11, 15};
		
		msa.printArray(arr1);
		msa.printArray(arr2);
		
		int[] result = msa.mergedArray(arr1, arr2, 4, 4);
		msa.printArray(result);
	}

}
