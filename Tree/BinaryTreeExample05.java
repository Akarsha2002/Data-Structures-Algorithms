package DSA_Using_Java.Tree;

import java.util.Stack;

// Iterative In-Order Traversal of a Binary Tree

public class BinaryTreeExample05 {
	
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
		
		root = first;
		
		first.left = second;
		first.right = third;
		
		second.left = fourth;
		second.right = fifth;
		
		third.left = sixth;
	}
	
	public void inOrder() {
		if(root == null) {
			return;
		}
		else {
			Stack<TreeNode> stack = new Stack<TreeNode>();
			TreeNode temp = root; // traversal initially from root
			while(!stack.empty() || temp != null) { // check stack empty OR temp not null
				if(temp != null) { // temp not null
					stack.push(temp); // pushing visited TreeNodes from stack
					temp = temp.left; // traverse to left
				}
				else {
					temp = stack.pop(); // pop the temp from top of the stack
					System.out.print(temp.data+" "); // print popped temp data
					temp = temp.right; // traverse to right
				}
			}
			
		}
	}
	
	public static void main(String[] args) {
		/* 
		 * 
		 *                                    1
		 *                                    |
		 *                       --------------------------
		 *                      |                          |
		 *                      2                          3
		 *                      |                          |
		 *                -------------              -------------     
		 *               |             |            |             |
		 *               4             5            6            null
		 *               |             |            |             
		 *           --------      --------      -------- 
		 *          |        |    |        |    |        |
		 *         null     null null     null null     null
		 *       
		 * output: 4, 2, 5, 1, 6, 3
		 * 
		 */
		
		// Create Tree
		BinaryTreeExample05 bt = new BinaryTreeExample05();
		bt.createBinaryTree();
		bt.inOrder();

	}
}
