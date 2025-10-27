package DSA_Using_Java.Heap;
// How to implement Max Heap

public class HeapExample02 {
	
	private Integer[] heap;
	private int n; // size of max heap
	
	public HeapExample02(int capacity) {
		heap = new Integer[capacity + 1]; // index 0 is kept as empty
		n = 0;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	
	public static void main(String[] args) {
		/* 
		 * The Maximum value is at the top which is root of complete
		 * binary tree. For its array representation its at index 1 i.e. heap[1] 
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
		 */
		
		// Creating Binary Heap
		HeapExample02 mpq = new HeapExample02(3);
		System.out.println(mpq.size()); // 0
		System.out.println(mpq.isEmpty()); // true
		
    }
}
