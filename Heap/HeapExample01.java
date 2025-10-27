package DSA_Using_Java.Heap;
// How to represent a Binary Heap

public class HeapExample01 {
	
	public static void main(String[] args) {
		/* 
		 * Binary Heap usually are implemented using arrays.
		 * The first entry of array is taken as empty.
		 * 
		 *                                    9
		 *                                    |
		 *                       --------------------------
		 *                      |                          |
		 *                      3                          6
		 *                      |                          |
		 *                -------------              -------------     
		 *               |             |            |             |
		 *               2             1            5             4
		 *               |             |            |             |              
		 *           --------      --------      --------      --------     
		 *          |        |    |        |    |        |    |        |            
		 *         null     null null     null null     null null     null
		 *
		 * heap[n+1] --> [Occupied null, 9, 3, 6, 2, 1, 5, 4]
		 *                     0         1  2  3  4  5  6  7
		 * 
		 * 1 - Parent - 2, 3 - Child
		 * 2 - Parent - 4, 5 - Child
		 * 3 - Parent - 6, 7 - Child
		 * 
		 * generally - kth parent - 2k, 2k+1 - child
		 * Parent of kth index - Math.floor(k/2)
		 * 
		 */
		
		// Creating Binary Heap

	}

}
