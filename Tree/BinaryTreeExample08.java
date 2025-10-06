package DSA_Using_Java.Tree;

import java.util.LinkedList;
import java.util.Queue;

// Level Order Traversal of a Binary Tree

public class BinaryTreeExample08 {
	
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
	
	public void levelOrder() {
		// If tree is empty, nothing to traverse
		if(root == null) {
			return;
		}
		else {
			
			// Queue is used to store nodes level by level
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root); // start with root node
			
			// continue until queue becomes empty
			while(!queue.isEmpty()) {
				
				// visiting current node
				TreeNode temp = queue.poll();
				System.out.print(temp.data+" ");
				
				// Add left child to queue if exists
				if(temp.left != null) {
					queue.offer(temp.left);
				}
				
				// Add right child to queue if exists
				if(temp.right != null) {
					queue.offer(temp.right);
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
		 * output: 1, 2, 3, 4, 5, 6
		 * 
		 */
		
		// Creating Tree
		BinaryTreeExample08 bt = new BinaryTreeExample08();
		bt.createBinaryTree();
		bt.levelOrder();

	}
}
