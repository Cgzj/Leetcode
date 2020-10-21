package com.leetcode_1;
//https://leetcode-cn.com/problems/symmetric-tree/
//101.¶Ô³Æ¶þ²æÊ÷

public class SymmetricTree {
	 public static boolean isSymmetric(TreeNode root) {
	        if(root==null)
	        	return true;
	        else if(root.left==null && root.right==null)
	        	return true;
	        else if(root.left==null || root.right==null)
	        	return false;
	        else  {
	        	if(root.left.val!=root.right.val)
	        		return false;
	        	else
	        		return isSymmetric(root.left, root.right);
	        	}
	        }
	 public static boolean isSymmetric(TreeNode leaves1,TreeNode leaves2){
		  if(leaves1==null && leaves2==null)
			  return true;
		  else if(leaves1==null ||leaves2==null)
			  return false;
		  else {
			  if(leaves1.val!=leaves2.val)
				  return false;
			  else {
				  return isSymmetric(leaves1.left, leaves2.right) && isSymmetric(leaves1.right, leaves2.left);
			  }
		  }
	 }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(1);
		root.left= new TreeNode(2);
		root.right=new TreeNode(2);
		root.left.left=new TreeNode(3);
		root.left.right=new TreeNode(4);
		root.right.left=new TreeNode(4);
		root.right.right=new TreeNode(3);
		TreeNode root1=new TreeNode(1);
		root1.left=new TreeNode(2);
		root1.right=new TreeNode(3);
		System.out.println(isSymmetric(root1));
	}

}
