package DSA_Using_Java.Tree;
// Recursive Pre-Order Traversal of Binary Tree

public class BinaryTreeExample02 {
	
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
    	
    	root = first; // root --> first
    	first.left = second;
    	first.right = third; // second <-- first --> third
    	
    	// fourth <-- second --> null
    	second.left = fourth;
    }
    
    public void preOrder(TreeNode root) {
    	if(root == null) { // base case
    		return;
    	}
    	else {
    		System.out.print(root.data+" "); // root changes the preOrder() called
    		preOrder(root.left);
    		preOrder(root.right);    		
    	}
    }
	public static void main(String[] args) {
		/*
		 * 
		 * Pre-order Binary Tree Traversal
		 * 1. Visit the root node
		 * 2. Traverse the left subtree in Pre-order fashion.
		 * 3. Traverse the right subtree in Pre-order fashion.
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
		 * output: 9, 2, 4, 3
		 * 
		 */
		
		// Creating Tree
		BinaryTreeExample02 bt = new BinaryTreeExample02();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
		
	}
}
