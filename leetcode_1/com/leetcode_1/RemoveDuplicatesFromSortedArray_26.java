package com.leetcode_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray_26 {
//	26. 删除排序数组中的重复项		
//	https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
	public static int removeDuplicates(int[] nums) {
		int len=nums.length;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				nums[i]=(int) (Math.pow(2, 32)-1);
				len--;
			}
		}
		Arrays.sort(nums);
		for(int i:nums) {
			System.out.print(i+" ");
		}
		System.out.println();
		return len;
	}
	public static void main(String[] args) {
		//		1,1,2
		//		1,2,3,4,5
		//		0,0,1,1,1,2,2,3,3,4
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(nums));
	}
}
