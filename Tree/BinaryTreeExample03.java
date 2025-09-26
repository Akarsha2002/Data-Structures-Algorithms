package DSA_Using_Java.Tree;
// Iterative Pre-Order Traversal of Binary Tree

import java.util.Stack;

public class BinaryTreeExample03 {
	
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
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		TreeNode sixth = new TreeNode(6);
		TreeNode seventh = new TreeNode(7);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		third.left = sixth;
		third.right = seventh;	
	}

	public void preOrder() {
		if(root == null) {
			return;
		}
		else {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			stack.push(root); // identify root
			
			while(!stack.empty()) { // checking stack isEmpty()
				TreeNode temp = stack.pop();
				System.out.print(temp.data+" "); // printing popped stack data
				
				if(temp.right != null) { // checking right for tree node
					stack.push(temp.right); // pushing right visited node
				}
				if(temp.left != null) { // checking left for tree node
					stack.push(temp.left); // pushing left visited node 
				}
			}
		}
	}
	public static void main(String[] args) {
		
		/* 
		 * 
		 *                                    9
		 *                                    |
		 *                       --------------------------
		 *                      |                          |
		 *                      2                          3
		 *                      |                          |
		 *                -------------              -------------     
		 *               |             |            |             |
		 *               4             5            6             7
		 *               |             |            |             |
		 *           --------      --------      --------      --------
		 *          |        |    |        |    |        |    |        |
		 *         null     null null     null null     null null     null
		 *       
		 * output: 1, 2, 4, 5, 3, 6, 7
		 * 
		 */
		
		// Creating Tree
		BinaryTreeExample03 bt = new BinaryTreeExample03();
		bt.createBinaryTree();
		bt.preOrder();
	}

}
