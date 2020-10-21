package com.leetcode_1;

public class balancedBinaryTree {
	public static  boolean isBalanced(TreeNode root) {
	        if(root==null)
	        	return true;
	        else 
	        	return Math.abs(height(root.left)-height(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right);
	        
	    }
	public static int height(TreeNode root ) {
		 if(root==null)
			 return 0;
		 else 
			 return Math.max(height(root.left), height(root.right))+1;
	}
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left=new TreeNode(1);
		root.right=new TreeNode(1);
		System.out.println(isBalanced(root));
	}

}
