package DSA_Using_Java.Tree;
// Validate Binary Tree

public class BinaryTreeExample13 {

	private TreeNode root;
	
	private class TreeNode {
		private int data;
		private TreeNode left;
		private TreeNode right;
		
		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(6);
		TreeNode second = new TreeNode(4);
		TreeNode third = new TreeNode(8);
		TreeNode fourth = new TreeNode(2);
		TreeNode fifth= new TreeNode(8);
		TreeNode sixth = new TreeNode(7);
		TreeNode seventh = new TreeNode(9);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		third.left = sixth;
		third.right = seventh;
	}
	
	public boolean isValid(TreeNode root, long min, long max) {
		
		// if current node is null, it means we've reached leaf -> valid so far
		if(root == null) {
			return true;
		}
		
		/*
		 * Rule of BST: current node's value must be strictly between min and max
		 * if it violates the rule -> it's not a BST
		 * 
		 */
		if(root.data <= min || root.data >= max) {
			return false;
		}
		
		/*
		 * Recursively check the left subtree
		 * For the left child, the maximum allowed value becomes root data
		 * 
		 */
		boolean left = isValid(root.left, min, root.data);
		
		//Only if the left subtree is valid, we produced to check the right subtree
		if(left) {
			// For the right child, the minimum allowed value becomes root.data
			boolean right = isValid(root.right, root.data, max);
			return right; // Return true only if the right subtree valid
		}
		// If the left subtree is invalid, no need to check further
		return false;
	}
	
	public boolean isValid() {
		return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
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
	
	
	public static void main(String[] args) {
		/*
		 * Given the root of Binary Tree, 
		 * Determine if it is a valid Binary Search Tree (BST)
		 * 
		 * 1. if you go towards left subtree min remains same & max changes to parent value
		 * 2. if you go towards right subtree max remains same & min changes to parent value
		 * 
		 *                          6
		 *                          |
		 *                   ---------------
		 *                  |               |
		 *                  4               8
		 *                  |               |
		 *             -----------     -----------
		 *            |           |   |           |
		 *            2           8   7           9
		 * 
		 *  Output: Given Tree is not Binary Search Tree        
		 *          
		 */
		
		// Creating Binary Search Tree
		BinaryTreeExample13 bst = new BinaryTreeExample13();
//		bst.createBinaryTree();
		
		bst.insert(5);
		bst.insert(2);
		bst.insert(6);
		bst.insert(1);
		bst.insert(3);
		
		bst.inOrder();	
		System.out.println();
		
		if(bst.isValid()) {
			System.out.println("Given Tree is Binary Search Tree");
		}
		else {
			System.out.println("Given Tree is not Binary Search Tree");
		}

	}
}
