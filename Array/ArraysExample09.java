package DSA_Using_Java.Array;
// Move all Zeroes to end of an Array

public class ArraysExample09 {
public void printArray(int[] arr) {
	int n = arr.length;
	for(int i = 0; i < n; i++) {
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}

public void arrayDemo() {
	int[] arr = {0, 1, 0, 4, 12};
	printArray(arr);
	
	moveZeros(arr, arr.length);
	printArray(arr);
	
}

public void moveZeros(int[] arr, int n) {
	int j = 0; // j focuses on zeroth element
	for(int i = 0; i < n; i++) {
		if(arr[i] != 0 && arr[j] == 0) { // i will focuses on non zero element
			// Swapping Logic
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		if(arr[j] != 0) {
			j++;
		}
	}
	
}
	public static void main(String[] args) {
		/*
		 * Given an arrays of integers, write a function
		 * to move all 0's to end of it while maintaining the relative order
		 * of the non-zero elements
		 * array of integers - {0, 1, 0, 4, 12}
		 * solution: {1, 4, 12, 0, 0}
		 */
		
		ArraysExample09 a = new ArraysExample09();
		a.arrayDemo();
	}
}
