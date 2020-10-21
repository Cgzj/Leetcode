package com.leetcode_1;

// https://leetcode-cn.com/problems/same-tree/
//	100.ÏàÍ¬µÄÊ÷
public class SameTree {
	public static  int treeIsNull(TreeNode p,TreeNode q) {
		if((p==null && q!=null)
		    ||(p!=null && q==null))
			return 0;
		else if(p==null && q== null)
			return 1;
		else
			if(p.val!=q.val) return 0;
			else 			 return 2;
	}
	public static boolean isSameTree(TreeNode p,TreeNode q) {
		if(treeIsNull(p,q)==0)
			return false;
		else if(treeIsNull(p,q)==1)
			return true;
		else {
			if(isSameTree(p.left ,q.left ) && isSameTree(p.right,q.right ))
				return true;
			else return false;
		}
	}
	 public boolean isSameTreeBetter(TreeNode p, TreeNode q) {
	        if (p == null && q == null) {
	            return true;
	        } else if (p == null || q == null) {
	            return false;
	        } else if (p.val != q.val) {
	            return false;
	        } else {
	            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
	        }
	    }

	public static void main(String[] args) {
		TreeNode p=new TreeNode(1);
		p.left=new TreeNode(2);
		p.right=new TreeNode(2);
		TreeNode q=new TreeNode(1);
		q.left=new TreeNode(2);
//		q.right=new TreeNode();
		System.out.println(isSameTree(p, q));
		

	}

}
