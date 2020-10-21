package com.leetcode_1;

//https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/
//101.二叉树的最大深度

public class MaximumDepthOfBinaryTree {
	
	
	 public static  int maxDepth(TreeNode root) {
		 int length=0;
		 if(root==null)
			 return 0;
		 else if(root.left==null && root.right==null)
			 return 1;
		 else {
			 length++;
			 return length+=Math.max(maxDepth(root.left),maxDepth(root.right));
		 }
	    }

	 public static  int maxDepthBetter(TreeNode root) {
		 if(root==null)
			 return 0;
		 else
			 return 1+Math.max(maxDepth(root.left),maxDepth(root.right));
	    }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left= new TreeNode(2);
		root.right=new TreeNode(2);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(4);
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(3);
		TreeNode root1=new TreeNode(3);
		root1.left=new TreeNode(9);
		root1.right=new TreeNode(9);
		root1.right.left=new TreeNode(15);
		root1.right.right=new TreeNode(7);
		System.out.println(maxDepthBetter(root1));
	}

}
