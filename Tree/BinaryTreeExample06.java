package DSA_Using_Java.Tree;
// Recursive Post-Order Traversal of Binary Tree

public class BinaryTreeExample06 {
	
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
		TreeNode first = new TreeNode(9);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
	}
	
	public void postOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		else {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public static void main(String[] args) {
		/*
		 * 
		 * Post-order Binary Tree Traversal
		 * 1. Traverse the left subtree in Post-order fashion.
		 * 2. Traverse the right subtree in Post-order fashion.
		 * 3. Visit the root node.
		 * 
		 *                                  9
		 *                                  |
		 *                        --------------------
		 *                       |                    |
		 *                       2                    3
		 *                       |                    |
		 *                --------------        ------------     
		 *               |              |      |            |
		 *               4             null   null         null
		 *               |
		 *         ------------
		 *        |            |
		 *       null         null
		 *       
		 * output: 4, 2, 3, 9 
		 * 
		 */
		 
		// Creating Tree
		BinaryTreeExample06 bt = new BinaryTreeExample06();
		bt.createBinaryTree();
		bt.postOrder(bt.root);
	}
}
