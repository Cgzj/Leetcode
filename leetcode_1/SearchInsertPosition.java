package com.leetcode_1;

public class SearchInsertPosition {
//35. 搜索插入位置
//https://leetcode-cn.com/problems/search-insert-position/
	
	 public static int searchInsert(int[] nums, int target) {
		 int index=0;
		 int length=nums.length;
		 for(int i=0;i<length;i++) {
			 if(i==0 && target<nums[i])
				 return index;
			 else if(i==length-1 && target>nums[i])
				 return length;
			 if(target==nums[i]) {
				 index=i;
				 return index;
			 }else if(i<length-1 && target>nums[i] && target<nums[i+1]){
				 index=i+1;
				 return index;
			 }
		 }
		 return index;
	    }
	public static void main(String[] args) {
		//测试数据：	返回值：
		//[1,3,5,6], 5	2
		//[1,3,5,6], 2	1  
		//[1,3,5,6], 7  4
		//[1,3,5,6], 0  0
		int[] nums= {1,3,5,6 };
		int target=2;
		System.out.println(searchInsert(nums, target));
		String s="";
		s.indexOf("");
	}
	

}
