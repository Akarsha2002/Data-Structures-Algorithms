package DSA_Using_Java.Tree;

import java.util.Stack;

// Iterative Post-Order Traversal of a Binary Tree

public class BinaryTreeExample07 {
	
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
		
		third.right = sixth;
	}
	
	public void postOrder() {
		
		// Stack to simulate iterative postOrder for Binary Tree Traversal
		Stack<TreeNode> stack = new Stack<TreeNode>(); 
		TreeNode current = root; // Traversal starts from root
		
		// Traversal until stack is empty and current node is null
			while(current != null || !stack.empty()) {
				
				// Go to the leftmost node
				if(current != null) {
					stack.push(current); 
					current = current.left; // Move to left child
				}
				else {
					
					// Peek the right child of the node at the top of the stack
					TreeNode temp = stack.peek().right;
					
					// if no right child --> visit the node
					if(temp == null) {
						temp = stack.pop();
						System.out.print(temp.data+" ");
						
						/*
						 * Keep visiting nodes while we are returning
						 * from the right subtree
						 * 
						 */
						while(!stack.empty() && temp == stack.peek().right) {
							temp = stack.pop();
							System.out.print(temp.data+" ");
						}
					}
					else {
						
						// if right child exists --> move to right subtree
						current = temp;
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
		 * output: 4, 5, 2, 6, 3, 1
		 * 
		 */
		
		// Create Tree
		BinaryTreeExample07 bt = new BinaryTreeExample07();
		bt.createBinaryTree();
		bt.postOrder();
	}
}
