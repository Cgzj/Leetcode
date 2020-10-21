package com.leetcode_1;

public class RemoveElement_27 {
//		27.移除元素	https://leetcode-cn.com/problems/remove-element/
	
	public static int removeElement(int[] nums, int val) {
		int length=nums.length;
		int numOfVal=0;
		int exchange=0;
		for(int i=length-1;i>=0;i--) {
			if(nums[i]==val) {
				if(i!=length-1) {
					exchange=nums[i];
					nums[i]=nums[length-1-numOfVal];
					nums[length-1-numOfVal]=exchange;
				}
				numOfVal++;	
			}
		}
		return length-numOfVal;
    }
	public static int BetterremoveElement(int[] nums, int val) {
		
		        int index = 0;
		        for (int i = 0; i < nums.length; i++) {
		            if (nums[i] != val) {
		                nums[index++] = nums[i];
		            }
		        }
		        return index;
	}

	public static void main(String[] args) {
	/*
	 * 测试数组：
	 *		3,2,2,3			，val:	3	ans：2
	 *		0,1,2,2,3,0,4,2	，val:	2	ans:5
	 *数组显示：
	 *	for(int i=0;i<nums.length;i++){
	 *		Systerm.out.print(nums[i]+"	");
	 *	}
	 */
		int[] nums=new int[] {3,2,2,3};
		BetterremoveElement(nums,3);
		for(int i=0;i<nums.length;i++){
					System.out.print(nums[i]+"	");
				}
	}

}
