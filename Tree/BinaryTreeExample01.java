package DSA_Using_Java.Tree;
// How to represent a Binary Tree

public class BinaryTreeExample01 {
	private TreeNode root;

	public class TreeNode { // Generic Structure
		private int data;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int data) {
			this.data = data;
		}
	}
	
	public void createBinaryTree() {
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		
		root = first; // root --> first
		first.left = second;
		first.right = third; // second <-- first --> third
		
		second.left = fourth; 
		second.right = fifth; // fourth <-- second --> fifth

	}

	public static void main(String[] args) {
		/*
		 *                    root --> first(1)
		 *                               |
		 *                   ---------------------------
		 *                  |                           |
		 *                second(2)                   third(3)
		 *                  |                           |
		 *            ----------------             ------------ 
		 *           |                |           |            |
		 *         fourth(4)         fifth(5)    null         null
		 *           |                |
		 *     ------------      ------------
		 *    |            |    |            |
		 *   null         null null         null
		 * 
		 * 
		 */
		
		// Create Tree

	}
}
