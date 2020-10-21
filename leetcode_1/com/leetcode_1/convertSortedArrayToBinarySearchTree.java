package com.leetcode_1;

//	https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
//	108. ����������ת��Ϊ����������

public class convertSortedArrayToBinarySearchTree {
	 public static TreeNode sortedArrayToBST(int[] nums) {
	       return helper(nums,0,nums.length-1);
	    }
	 public static  TreeNode helper(int [] nums ,int left ,int right ) {
		 if( left> right)
			 return null;
		 else {
			 int mid=(left+right)/2;
			 // ����ѡ���м�λ����ߵ�������Ϊ���ڵ�
			 TreeNode root=new TreeNode(nums[mid]);
			 root.left =helper(nums,left,mid-1);
			 root.right = helper(nums,mid+1,right);
			 return root;
		 }
	 }
	public static void main(String[] args) {
		int [] nums=new int[] {-10,-3,0,5,9};
		TreeNode.printTree(sortedArrayToBST(nums));
	}

}
