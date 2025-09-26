package DSA_Using_Java.Tree;
// Recursive In-Order Traversal of Binary Tree

public class BinaryTreeExample04 {
	
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
	
	public void inOrder(TreeNode root) {
		if(root == null) {
			return;
		}
		else {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public static void main(String[] args) {
		/*
		 * 
		 * In-order Binary Tree Traversal
		 * 1. Traverse the left subtree in In-order fashion.
		 * 2. Visit the root node.
		 * 3. Traverse the right subtree in In-order fashion.
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
		 * output: 4, 2, 9, 3 
		 * 
		 */
		
		// Create Tree
		BinaryTreeExample04 bt = new BinaryTreeExample04();
		bt.createBinaryTree();
		bt.inOrder(bt.root);

	}

}
