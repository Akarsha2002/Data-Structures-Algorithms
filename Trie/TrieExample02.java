package DSA_Using_Java.Trie;

public class TrieExample02 {
	private TrieNode root;
	
	public TrieExample02() {
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
		
		// Step 1: Check for invalid input
		if(word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		word = word.toLowerCase(); // Step 2: Convert the word to lowercase (Trie is case-insensitive)
		TrieNode current = root; // Step 3: Start from the root node of the Trie
		
		// Step 4: Traverse each character in the word
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i); // Extract current character
			int index = c - 'a'; // Convert character to index (0 → 'a', 1 → 'b', ..., 25 → 'z')
			
			// Step 5: If no TrieNode exists for this character, create a new node
			if(current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node; // Move to this newly created node
			}
			
			// Step 6: If TrieNode already exists, just move to it
			else {
				current = current.children[index];
			}
		}
		
		// Step 7: After processing all characters,
		// mark the current node as the end of a valid word
		current.isWord = true;
	}
	
	public static void main(String[] args) {
		TrieExample02 trie = new TrieExample02();
		trie.insert("cat");
		trie.insert("cab");
		trie.insert("son");
		trie.insert("so");
		System.out.println("Values inserted successfully!!!");
		
	}
}
