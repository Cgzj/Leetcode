package com.leetcode_1;

public class BetterRemoveDuplicatesFromSortedArray_26 {
	public static int removeDuplicates(int[] nums) {
		int i=0;
		for(int j=1;j<nums.length;j++) {
			if(nums[i]==nums[j]) {
				
			}else {
				i++;
				nums[i]=nums[j];
			}
		}
		for(int j=0;j<nums.length;j++)
			System.out.print(nums[j]+"  ");
		System.out.println();
		
		return i+1;
	}
	public static int removeDuplicates2(int[] nums) {
		 if( nums.length  == 0){
	            return 0;
	        }

	        int i= 0;
	        for(int j = 1 ; j< nums.length ; j ++){
	            if(nums[i] != nums[j]){
	                i ++;
	                nums[i] = nums[j];
	            }
	        }
	        for(int j=0;j<nums.length;j++)
				System.out.print(nums[j]+"  ");
			System.out.println();
	        return i+1;

	}

	public static void main(String[] args) {
		//		1,1,2
		//		1,2,3,4,5
		//		0,0,1,1,1,2,2,3,3,4
		//		1,2,3
		int[] nums= {1,2,3};
		System.out.print(removeDuplicates(nums));
	}

}
