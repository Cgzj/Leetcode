package com.leetcode_1;

import java.util.Arrays;

public class MergeSortedArray {

//	https://leetcode-cn.com/problems/merge-sorted-array/
//	88.合并两个有序数组
	
	 public static void merge(int[] nums1, int m, int[] nums2, int n) {
	        for(int i=m;i<m+n;i++)
	        	nums1[i]=nums2[i-m];
	       Arrays.sort(nums1);
	      
	    }
	 public static void mergeCopy(int[] nums1, int m, int[] nums2, int n) {
	        int n1 = m-1;
	        int n2 = n-1;
	        int i = m + n - 1;
	        while(n1>=0 && n2>=0){
	            if(nums1[n1]<=nums2[n2]){
	                nums1[i] = nums2[n2];
	                n2--;
	            }else{
	                nums1[i] = nums1[n1];
	                n1--;
	            }
	            i--;
	        }
	        for(int j = 0 ; j < n2 + 1 ; j++){
	            nums1[j] = nums2[j];
	        }
	    }
	 public static void printArray(int nums[]) {
		 for(int i=0;i<nums.length;i++)
			 System.out.print(nums[i]+"  ");
	 }
	public static void main(String[] args) {
		int[] nums1=new int[] {0,0,0};
		int[] nums2=new int[] {2,5,6};
		mergeCopy(nums1, 0, nums2, 3);
		printArray(nums1);
		
	}

}
