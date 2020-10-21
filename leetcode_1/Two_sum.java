package com.leetcode_1;

public class Two_sum {
	//https://leetcode-cn.com/problems/two-sum/
	public static int[] twoSum(int[] nums, int target) {
        int [] ans=new int[] {0,0};
       for(int i=0;i<nums.length-1;i++){          
           for(int j=i+1;j<nums.length;j++){
               if(target==(nums[i]+nums[j]))
               { 
                   ans[0]=i;
                   ans[1]=j;
                    break;
                 } 
             }          
       }
     return ans;
    }

	public static void main(String[] args) {
		int[] nums=new int[] {8,9,5,2};
		int target=10;
		System.out.print(twoSum(nums,target)[0]+" "+twoSum(nums,target)[1]);
	}

}
