package DSA_Using_Java.Trie;
// How to represent and Implement Trie

public class TrieExample01 {
	private TrieNode root;
	
	public TrieExample01() {
		root = new TrieNode(); // root is empty
	}
	
	private class TrieNode {
		private TrieNode[] children;
		private boolean isWord;
		
		public TrieNode() {
			this.children = new TrieNode[26]; // Starting from a -> z
			this.isWord = false;
		}
	}
	
//	public void insert(String word) {
//		
//	}
	
//	public boolean search(String word) {
//		return false;
//	}
	
	public static void main(String[] args) {
		/*
		 * Representation of a TrieNode in Trie
		 * A TrieNode class in Trie consist of two data members.
		 * 1. TrieNode[] children - An array which refers to other TrieNodes
		 *      in Trie, also called as child nodes of a TrieNode. The size of 
		 *      array is usually taken as 26 (if we are storing English words)
		 * 
		 * 2. boolean isWord - A boolean value to indicate the end of word. 
		 *      This value is set as true when a word is inserted completely.
		 *      
		 *                    TrieNode
		 *               TrieNode[] children
		 *               boolean isWord
		 * 
		 * Implementation of the Trie class
		 * 1. A Trie will be implemented using TrieNode class.
		 * 2. A root TrieNode is at top with empty value having
		 *    26 links (one per alphabet).
		 * 3. The links are either null or points to another TrieNode.
		 * 
		 * public int getIndex(char letter) {
		 *    return letter - 'a';
		 * }
		 * 
		 */

	}
}
