package DSA_Using_Java.Hash;
// How to put a key-value pair pair in a HashTable (Separate Chaining)

public class HashExample02 {
	
	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;
	
	public HashExample02() {
		this(10);
	}
	
	public HashExample02(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}
	
	private class HashNode {
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
		// Step 1: Validate the input key and value
		if(key == null || value == null) {
			throw new IllegalArgumentException("Key or Value is null!!");
		}
		
		int bucketIndex = getBucketIndex(key); // Step 2: Compute the index of the bucket where this key-value pair will go
		HashNode head = buckets[bucketIndex]; // Step 3: Get the head node of the linked list present at that bucket
		
		// Step 4: Traverse the linked list to check if key already exists
		while(head != null) {
			
			// If key already exists, update the value
			if(head.key.equals(key)) {
				head.value = value;
				return; // Stop here (no need to insert a new node)
			}
			head = head.next; // Move to the next node
		}
		
		// Step 5: Key not found → we are inserting a new (key, value) pair
		size++; // Increment total number of key-value pairs in map
		
		// Step 6: Insert the new node at the beginning of the linked list (for O(1) insertion)
		head = buckets[bucketIndex]; // Current head (might be null)
		HashNode node = new HashNode(key, value); // (key, value) -> null
		node.next = head; // Link new node’s next to current head
		buckets[bucketIndex] = node; // Make new node the new head of this bucket
	}
	
	private int getBucketIndex(Integer key) {
		return key % numOfBuckets; // buckets.length Modular Hash Function
	}
	
	public static void main(String[] args) {
		// Create a HashTable
		HashExample02 table = new HashExample02(10);
		table.put(105, "Tom");
		table.put(21, "Sana");
		table.put(21, "Harry");
		table.put(31, "Dinesh");
		System.out.println(table.size());
		

	}

}
