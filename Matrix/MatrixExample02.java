package DSA_Using_Java.Matrix;
// Interview Question: Print a given matrix in Spiral Form

public class MatrixExample02 {
	
	public void printSpiral(int[][] matrix, int r, int c) {
		int i, k = 0, l = 0;
		/*
		 * k = starting row index
		 * l = starting column index
		 * r = ending row index (exclusive)
		 * c = ending column index (exclusive)
		 * 
		 */
		
		// Continue while there are rows and columns left
		while(k < r && l < c) {
			
			// 1. Left to Right Traversal
			for(i = l; i < c; i++) { 
				System.out.print(matrix[k][i]+" ");
			}
			k++; // Move starting row down (since top row is done)
			
			// 2. Top to Bottom Traversal
			for(i = k; i < r; i++) { 
				System.out.print(matrix[i][c-1]+" ");
			}
			c--; // Move ending column left (since rightmost column in done)
			
			// 3. Right to Left Traversal
			if(k < r) { // Check if rows remain
				for(i = c-1; i >= l; i--) {
					System.out.print(matrix[r-1][i]+" ");
				}
				r--; // Move ending row up (since bottom row is done)
			}
			
			// 4. Bottom to Top Traversal
			if(l < c) { // Check if columns remain
				for(i = r-1; i >= k; i--) {
					System.out.print(matrix[i][l]+" ");
				}
				l++; // Move starting column right (since leftmost column is done)
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given a matrix, print it in spiral form (k, l, r, c).
		 * 
		 * Input:     0    1    2    3         spiral form 
		 *        0 | 1  |  2 | 3  | 4  |    ---------------->   
		 *        1 | 5  |  6 | 7  | 8  |  ^ ---------------> |
		 *        2 | 9  | 10 | 11 | 12 |  | <---------------||
		 *        3 | 13 | 14 | 15 | 16 |   <---------------- v
		 *      
		 *                 matrix[][]
		 *       
		 * Output: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10
		 * 
		 */
		
		// Creating Matrix
		MatrixExample02 sm = new MatrixExample02();
		int[][] matrix = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
				{13, 14, 15, 16}
		};
		
		sm.printSpiral(matrix, 4, 4);
		
		
		
	}
}
