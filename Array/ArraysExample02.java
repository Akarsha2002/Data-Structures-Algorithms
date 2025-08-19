package DSA_Using_Java.Array;
// Printing an Array
public class ArraysExample02 {
public void printArray(int[] array) {
	int n = array.length;
	for(int i = 0; i < n; i++) {
		System.out.print(array[i]+" ");
	}
	System.out.println();
}
	public static void main(String[] args) {
		ArraysExample02 a = new ArraysExample02();
		a.printArray(new int[] {5, 1, 2, 9, 10});
	}

}
