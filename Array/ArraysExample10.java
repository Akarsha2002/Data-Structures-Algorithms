package DSA_Using_Java.Array;

// How to resize an array in Java
public class ArraysExample10 {
	public void printArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
/*
 * Because of returning void to array it collects garbage
 * So return with int[] to avoid garbage collection.
 */
	public int[] resizeArray(int[] arr, int capacity) { 
		int[] temp = new int[capacity];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		return temp;
	}

	public static void main(String[] args) {
		// resize(arr, arr.length*2)

		ArraysExample10 a = new ArraysExample10();
//		a.printArray(new int[] {5, 1, 2, 9, 10});

		int[] original = new int[] { 5, 1, 2, 9, 10 };
		System.out.println("The size of original array before resize: " + original.length);
		
		original = a.resizeArray(original, original.length * 2);
		System.out.println("The size of original array after resize: " + original.length);

		
		

	}

}
