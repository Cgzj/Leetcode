package com.leetcode_1;

//https://leetcode-cn.com/problems/minimum-depth-of-binary-tree/
//111.二叉树的自小深度

public class MinimumDepthOfBinaryTree {

	 public static int minDepth(TreeNode root) {
		    if (root == null) return 0;
	        else if (root.left == null) return minDepth(root.right) + 1;
	        else if (root.right == null) return minDepth(root.left) + 1;
	        else return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(3);
		root.left=new TreeNode(9);
		root.right=new TreeNode(20);
		root.right.left=new TreeNode(15);
		root.right.right=new TreeNode(7);
		System.out.println(minDepth(root));
	}

}
