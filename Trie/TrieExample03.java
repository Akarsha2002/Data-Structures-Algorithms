package DSA_Using_Java.Trie;

public class TrieExample03 {
	private TrieNode root;
	
	public TrieExample03() {
		root = new TrieNode();
	}
	
	private class TrieNode {
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isWord = false;
		}
	}
	
	public void insert(String word) {
		if(word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid word");
		}
		
		word = word.toLowerCase();
		TrieNode current = root;
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			
			if(current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			}
			else {
				current = current.children[index];
			}
		}
		
		current.isWord = true;
	}
	
	public boolean search(String word) {
		
		// Check for invalid input
		if(word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid word");
		}
		
		word = word.toLowerCase(); // Convert the word to lowercase (Trie is case-insensitive)
		TrieNode current = root; // Start from the root node of the Trie

		// Traverse each character in the word
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i); // Extract current character
			int index = c - 'a'; // Convert character to index (0 → 'a', 1 → 'b', ..., 25 → 'z')
			
			// if the path doesn't exist, word not found
			if(current.children[index] == null) {
				return false;
			}
			else {
				current = current.children[index];
			}
		}
		
		return current.isWord; // return true only if it is a complete word
	}
	
	public static void main(String[] args) {
		TrieExample03 trie = new TrieExample03();
		trie.insert("cat");
		trie.insert("cab");
		trie.insert("son");
		trie.insert("so");
		System.out.println("Values Inserted Successfully!!!");
		
		System.out.println("Search 'cat': "+trie.search("cat")); // true
		System.out.println("Search 'car': "+trie.search("car")); // false
		System.out.println("Search 'son': "+trie.search("son")); // true
		System.out.println("Search 'so': "+trie.search("so")); // true
		
	}
}
