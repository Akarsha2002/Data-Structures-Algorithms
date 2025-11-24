package DSA_Using_Java.Hash;
// How to implement a HashTable (Separate Chaining)

public class HashExample01 {
	
	private HashNode[] buckets;
	private int numOfBuckets; // capacity
	private int size; // number of key value pairs in hash table or number of hash nodes
	
	public HashExample01() {
		this(10); // default capacity 
	}
	
	public HashExample01(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}
	
	private class HashNode {
		private Integer key; // Can be generic type
		private String value; // Can be generic type
		private HashNode next; // Reference to next HashNode
		
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
		
	}
	
	public String get(Integer key) {
		return null;
	}
	
	public String remove(Integer key) {
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
