package DSA_Using_Java.Hash;
// How to remove a key from HashTable (Separate Chaining)

public class HashExample04 {
	
	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;
	
	public HashExample04() {
		this(10);
	}
	
	public HashExample04(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}
	
	public class HashNode {
		private Integer key;
		private String value;
		private HashNode next;
		
		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void put(Integer key, String value) {
		if(key == null || value == null) {
			throw new IllegalArgumentException("Key or Value is null!!!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		buckets[bucketIndex] = node;
	}
	
	private int getBucketIndex(Integer key) {
		return key % numOfBuckets;
	}
	
	public String get(Integer key) {
		if(key == null) {
			throw new IllegalArgumentException("Key is null!!!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public String remove(Integer key) {
		// If the key is null, we cannot remove anything — throw an exception
		if(key == null) {
			throw new IllegalArgumentException("Key is null!!!");
		}
		
		int bucketIndex = getBucketIndex(key); // Each key maps to a bucket index based on hash (here simplified with modulo)
		HashNode head = buckets[bucketIndex]; // Get the head node (first node) of the linked list in that bucket
		HashNode previous = null; // Keep track of the previous node to help in unlinking
		
		// Keep moving through the list until the key is found or list ends
		while(head != null) {
			if(head.key.equals(key)) {
				break; // If the current node’s key matches, stop searching
			}
			
			// Move forward in the list
			previous = head;
			head = head.next;
		}
		
		// If head becomes null, key not found → return null
		if(head == null) {
			return null;
		}
		size--; // decrease the size of the hash table since one node is being removed
		if(previous != null) {
			// If node to be deleted is not the first node,
	        // link the previous node to the next node (skip the current node)
			previous.next = head.next;
		}
		else {
			// If node to be deleted is the first node (head of the bucket),
	        // then simply update the head to point to the next node
			buckets[bucketIndex] = head.next;
		}
		return head.value; // Return the value of the removed key (optional, but useful)
	}
	
	public static void main(String[] args) {
		// Creating HashTable
		HashExample04 table = new HashExample04(10);
		table.put(105, "Tom");
		table.put(21, "Harry");
		table.put(31, "Dinesh");
		System.out.println(table.size());
		System.out.println(table.remove(21));
		System.out.println(table.remove(31));
		System.out.println(table.size());
		
	}
}
