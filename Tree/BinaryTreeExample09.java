package DSA_Using_Java.Tree;
// Find maximum value in a Binary Tree (Recursive)

public class BinaryTreeExample09 {
	
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
		TreeNode first = new TreeNode(4);
		TreeNode second = new TreeNode(3);
		TreeNode third = new TreeNode(7);
		TreeNode fourth = new TreeNode(5);
		TreeNode fifth = new TreeNode(8);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
	}
	
	public int findMax() {
		return findMax(root);
	}
	
	public int findMax(TreeNode root) {
		
		// base case
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		else {
			// Pre-Order Recursive Binary Tree Traversal Logic
			int result = root.data;
			int left = findMax(root.left);
			int right = findMax(root.right);
			
			// result compared with each node
			if(left > result) {
				result = left;
			}
			
			if(right > result){
				result = right;
			}
			
			return result;
		}
	}
	public static void main(String[] args) {
		/* 
		 * 
		 *                                    4
		 *                                    |
		 *                       --------------------------
		 *                      |                          |
		 *                      3                          7
		 *                      |                          |
		 *                -------------              -------------     
		 *               |             |            |             |
		 *               5             8           null          null
		 *               |             |                          
		 *           --------      --------              
		 *          |        |    |        |                
		 *         null     null null     null
		 *       
		 * output: 8
		 * 
		 */
		
		// Creating Tree
		BinaryTreeExample09 bt = new BinaryTreeExample09();
		bt.createBinaryTree();
		int result = bt.findMax();
		System.out.println("Maximum Value of this Binary Tree: "+result);
	}

}
