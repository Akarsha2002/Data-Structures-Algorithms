package DSA_Using_Java.Heap;
// Bottom-up reheapify (swim) in Max Heap
//How to insert Maximum Element in a Max Heap

public class HeapExample03 {
	
	private Integer[] heap;
	private int n;
	
	public HeapExample03(int capacity) {
		heap = new Integer[capacity+1];
		n = 0;
	}
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void insert(int x) {
		// Checking if heap is full
		if(n == heap.length - 1) {
			resize(2*heap.length); // double size of array
		}
		n++; // increase the number of elements in heap
		heap[n] = x; // place the new element at the end of array
		swim(n); // Restore the heap order by "swimming" the new element up if needed
	}
	
	private void swim(int k) {
		while(k > 1 && heap[k/2] < heap[k]) {
			// Swap logic child and parent
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; // to continue shifting up till new value insert is at correct position
		}
	}
	
	public void printMaxHeap() {
		if(isEmpty()) {
			return;
		}
		else {
			for(int i = 1; i <= n; i++) {
				System.out.print(heap[i]+" ");
			}
		}
	}
	
	public void resize(int capacity){
		Integer[] temp = new Integer[capacity]; // Creating temporary array to store heap
		for(int i = 0; i < heap.length; i++) { 
			temp[i] = heap[i]; // Storing heap elements to temporary array
		}
		heap = temp; // heap is resized to temporary array 
	}
	
	public static void main(String[] args) {
		/* 
		 * After inserting an element into heap. It may not satisfy Max Heap
		 * property. Thus, we perform bottom-up reheapify technique, in which
		 * we adjust the locations of elements to satisfy heap property.
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
		 * Input - 4, 5, 2, 6, 1, 3
		 * Output - heap[capacity+1] = {6, 5, 3, 4, 1, 2}
		 * 
		 */
		
		// Creating Binary Heap
		HeapExample03 mpq = new HeapExample03(3);
		mpq.insert(4);
		mpq.insert(5);
		mpq.insert(2);
		mpq.insert(6);
		mpq.insert(1);
		mpq.insert(3);
		System.out.println(mpq.size());
		mpq.printMaxHeap();
	}
}
