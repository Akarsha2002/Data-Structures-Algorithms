package DSA_Using_Java.Matrix;
// Interview question: Search in a row and column wise sorted matrix

public class MatrixExample01 {
	
	public void search(int[][] matrix, int n, int x) {
		
		// Start from the top-right corner of the matrix
		int i = 0; // row index
		int j = n - 1; // column index
		
		// Keep searching while we are inside the matrix boundaries
		while(i < n && j >= 0) {
			// If the current element matches x, print its location and exit
			if(matrix[i][j] == x) {
				System.out.println(x+" is found at row "+i+" column "+j);
				return;
			}
			// If current element is larger than x, move left (decrease column index)
			else if(matrix[i][j] > x) {
				j--;
			}
			// If current element is smaller than x, move down (increase row index)
			else {
				i++;
			}
		}
		// If we exit the loop, it means x is not present in the matrix
		System.out.println(x+" is not found.");
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a row and column wise (n×n) sorted matrix.
		 * Write a program to search a key in a given matrix.
		 * 
		 *      0    1    2    3  
		 *  0 | 10 | 20 | 30 | 40 | 
		 *  1 | 15 | 25 | 35 | 45 | 
		 *  2 | 27 | 29 | 37 | 48 | 
		 *  3 | 32 | 33 | 39 | 51 |
		 *      
		 *       matrix[][]
		 * 
		 */
		
		// Creating Matrix
		MatrixExample01 sm = new MatrixExample01();
		
		int[][] matrix = {
				          {10, 20, 30, 40},
				          {15, 25, 35, 45},
				          {27, 29, 37, 48},
				          {32, 33, 39, 51}
				         };
		
		sm.search(matrix, 4, 32);
		sm.search(matrix, 4, 100);
	}
}
