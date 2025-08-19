package DSA_Using_Java.Array;

public class ArraysExample01 {
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public void arrayDemo() {
		int[] myArray = new int[5]; // default value index: 0 1 2 3 4
//	printArray(myArray); 0 0 0 0

		myArray[0] = 5;
		myArray[1] = 1;
		myArray[2] = 8;
		myArray[3] = 2;
		myArray[4] = 10;
		printArray(myArray); // 5 1 8 2 10

//	After Updating 3rd value to 9
		myArray[2] = 9;
		printArray(myArray); // 5 1 9 2 10

		System.out.println("Size of an array: " + myArray.length); // 5
		System.out.println("Last element of an array: " + myArray[myArray.length - 1]); // 10
		
		// Printing initialized Array
		int[] arr = {5, 1, 8, 2, 10};
		printArray(arr);

	}

	public static void main(String[] args) {
		/*
		 * dataType[] arrayName = new dataType[size] 
		 * must used syntax alternative way dataType myArray[] = new dataType[size] 
		 * initialize the array = dataType[] arrayName = {elements};
		 */

		ArraysExample01 a = new ArraysExample01();
		a.arrayDemo();

	}
}
