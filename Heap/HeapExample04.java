package DSA_Using_Java.Heap;
// Top-down reheapify (sink) in Max heap
// How to delete Maximum Element in a Max Heap

public class HeapExample04 {
	
	private Integer[] heap;
	private int n;
	
	HeapExample04(int capacity){
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
		if(n == heap.length - 1) {
			resize(heap.length*2);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	
	public void swim(int k) {
		while(k > 1 && heap[k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2;
		}
	}
	
	public void resize(int capacity) {
		Integer[] temp = new Integer[capacity];
		for(int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	
	public void printMaxHeap() {
		if(isEmpty()) {
			return;
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(heap[i]+" ");
		}
	}
	
	public int deleteMax() {
		// The maximum value is always at the root (index 1 for heap array)
		int max = heap[1]; 
		
		// Swap the root (max element) with the last element
		swap(1, n);
		
		// Decrease heap size (last element is no longer part of the heap)
		n--;
		
		// Restore heap order by sinking the swapped element down
		sink(1);
		heap[n+1] = null; // Avoid "loitering" --> garbage collection
		
		// If heap is too empty (1/4 full), shrink array to save space
		if(n > 0 && (n == (heap.length - 1)/4)) {
			resize(heap.length/2);
		}
		
		return max; // return maximum value that was removed
	}
	
	public void swap(int a, int b) {
		int temp = heap[a];
		heap[b] = heap[a];
		heap[a] = temp;
	}
	
	public void sink(int k) {
		while(2*k <= n) { // while k has at least one child
			int j = 2*k; // left child
			if(j < n && heap[j] < heap[j+1]) { // choose larger child
				j++;
			}
			if(heap[k] >= heap[j]) { // heap order restored
				break;
			}
			swap(k, j); 
			k = j; // keep sinking down
		}
	}
	
	public static void main(String[] args) {
		/* 
		 * After deleting an element from heap. It may not satisfy heap properties.
		 * Thus, we perform top-down reheapify technique, in which we adjust the 
		 * locations of elements to satisfy heap property.
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
		HeapExample04 mpq = new HeapExample04(3);
		mpq.insert(4);
		mpq.insert(5);
		mpq.insert(2);
		mpq.insert(6);
		mpq.insert(1);
		mpq.insert(3);
//		mpq.printMaxHeap();
		
		mpq.deleteMax();
		// mpq.printMaxHeap();
		
		mpq.deleteMax();
//		mpq.printMaxHeap();
		
		System.out.println(mpq.deleteMax());
		mpq.printMaxHeap();
		
	}
}
