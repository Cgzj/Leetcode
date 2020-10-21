package com.leetcode_1;

//	https://leetcode-cn.com/problems/path-sum/submissions/
//	112.路径总和
public class PathSum {
	 public static boolean hasPathSum(TreeNode root, int sum) {
	        if(root==null)
	        return false;
	        else if(root.left==null && root.right==null)
	            if(root.val==sum)
	            return true;
	            else 
	            return false;
	        
	        else if(root.left==null)
	        return  hasPathSum(root.right,sum-root.val);
	        else if(root.right==null)
	        return hasPathSum(root.left,sum-root.val);
	        else
	            return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
	        
	 }
	    
	public static void main(String[] args) {
//		一次通过
	}

}
