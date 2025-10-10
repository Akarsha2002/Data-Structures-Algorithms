package DSA_Using_Java.Tree;
// How to insert a value in a Binary Search Tree (Recursive Approach)

public class BinaryTreeExample11 {
	
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
		/*
		 * Case 1: If the current root is null,
		 * this is the correct spot to insert the new value
		 */
		if(root == null) {
			root = new TreeNode(value); // create a new node
			return root; // return the new node to link it with its parent
		}
		/*
		 * Case 2: If the value to insert is smaller than current node's data,
		 * move to the left subtree
		 */
		else if(value < root.data) {
			root.left = insert(root.left, value); // recursively insert the left child
		}
		/*
		 * Case 3: If the value is greater or equal to current node's data,
		 * move to the right subtree
		 */
		else {
			root.right = insert(root.right, value); // recursively insert in right child
		}
	
		return root; // return the unchanged root pointer after insertion
	}
	
	public void insert(int value) {
		/*
		 * Calls the recursive insert method starting from root
		 * Updateds root in case the tree was initially empty
		 */
		root = insert(root, value);
	}
	
	public void inOrder(TreeNode root) { // Recursive Logic
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}
	
	public void inOrder() {
		inOrder(root); // Called Recursive Function with argument called 'root'
	}
	
	public static void main(String[] args) {
		/* 
		 * input: 5, 3, 7, 1
		 *                  
		 * output: 1 3 5 7
		 *         
		 *                                    5
		 *                                    |
		 *                       --------------------------
		 *                      |                          |
		 *                      3                          7
		 *                      |                          |
		 *                -------------              -------------     
		 *               |             |            |             |
		 *               1            null         null          null
		 *               |                          
		 *           --------     
		 *          |        |  
		 *         null     null
		 *
		 * 
		 */
		
		// Creating Binary Search Tree
		BinaryTreeExample11 bst = new BinaryTreeExample11();
		bst.insert(5);
		bst.insert(3);
		bst.insert(7);
		bst.insert(1);
		bst.inOrder();
		
	}
}
