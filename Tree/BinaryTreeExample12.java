package DSA_Using_Java.Tree;
// How to Search a given key in a Binary Search Tree (Recursive Tree)

public class BinaryTreeExample12 {
	
	private TreeNode root;
	
	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public TreeNode insert(TreeNode root, int value) {
		if(root == null) {
			root = new TreeNode(value);
			return root;
		}
		else if(value < root.data) {
			root.left = insert(root.left, value);
		}
		else {
			root.right = insert(root.right, value);
		}
		
		return root;
	}
	
	public void insert(int value) {
		root = insert(root, value);
	}
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void inOrder() {
		inOrder(root);
	}
	
	public TreeNode search(TreeNode root, int key) {
		/*
		 * Base Case 1: If root is null, the tree is empty OR we've reached a leaf
		 * Base Case 2: If the key matches the root's data -> we found it.
		 */
		if(root == null || root.data == key) {
			return root; // return null if not found, or the node if found
		}
		/*
		 * If key smaller than current node's data
		 * search in the left subtree
		 */
		else if(key < root.data) {
			return search(root.left, key);
		}
		/*
		 * Otherwise, the key is greater -> search in the right subtree
		 */
		else {
			return search(root.right, key);
		}
	}
	
	public TreeNode search(int key) {
		return search(root, key);
	}
	
	public static void main(String[] args) {
		/* 
		 * input: 
		 *                  
		 * output: 
		 *         
		 *                                    6
		 *                                    |
		 *                       ----------------------------
		 *                      |                            |
		 *                      4                            8
		 *                      |                            |
		 *                -------------               ---------------     
		 *               |             |             |               |
		 *               2             5             7               9
		 *               |             |             |               |
		 *           --------      ---------      ---------      --------- 
		 *          |        |    |         |    |         |    |         |
		 *         null     null null      null null      null null      null
		 *
		 * 
		 */
		
		// Create Binary Search Tree
		BinaryTreeExample12 bst = new BinaryTreeExample12();
		bst.insert(6);
		bst.insert(4);
		bst.insert(8);
		bst.insert(2);
		bst.insert(5);
		bst.insert(7);
		bst.insert(9);
		
		bst.inOrder();
		
		if(null != bst.search(5)) {
			System.out.println("Key Found!");
		}
		else {
			System.out.println("Key Not Found!");
		}
	}

}
