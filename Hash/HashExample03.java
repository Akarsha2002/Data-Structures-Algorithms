package DSA_Using_Java.Hash;
// How to get a value by key in a HashTable (Separate Chaining)

public class HashExample03 {

	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;

	public HashExample03() {
		this(10);
	}

	public HashExample03(Integer capacity) {
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
		if (key == null || value == null) {
			throw new IllegalArgumentException("Key or Value is null !!!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while (head != null) {
			if (head.key.equals(key)) {
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
		// Step 1: Validate that the key is not null
		if (key == null) {
			throw new IllegalArgumentException("Key is null !!!");
		}
		
		int bucketIndex = getBucketIndex(key); // Step 2: Find which bucket this key belongs to
		HashNode head = buckets[bucketIndex]; // Step 3: Get the head of the linked list at that bucket index
		
		// Step 4: Traverse the linked list to find the matching key
		while (head != null) {
			// If the key is found, return its corresponding value
			if (head.key.equals(key)) {
				return head.value;
			}
			head = head.next; // Move to the next node in the linked list
		}
		return null; // Step 5: Key not found in the map, return null
	}

	public static void main(String[] args) {
		// Creating HashTable
		HashExample03 table = new HashExample03(10);
		table.put(105, "Tom");
		table.put(21, "Sana");
		table.put(21, "Harry");
		table.put(31, "Dinesh");
		System.out.println(table.size());
		System.out.println(table.get(31));
		System.out.println(table.get(21));
		System.out.println(table.get(90));
	}

}
