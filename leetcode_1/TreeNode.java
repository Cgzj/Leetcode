package com.leetcode_1;

public class TreeNode {
	
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(){};
	TreeNode(int val){	this.val=val;}
	TreeNode(int val,TreeNode left,TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	private static String TreeValToString(TreeNode root) {
		String str="";
		TreeNode p=root;
		if(p!=null)
			str+=p.val+" "+TreeValToString(root.left)+" "+TreeValToString(root.right);
		return str;
	}
	public static void printTree(TreeNode root) {
		System.out.println(TreeValToString(root));
	}
}
