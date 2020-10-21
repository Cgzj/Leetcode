package com.leetcode_1;

public class ImplementStrstr_KMP {
/*
 * 28. 实现 strStr()
 * https://leetcode-cn.com/problems/implement-strstr/
 */
	 public static int strStr(String haystack, String needle) {
		 int loc=0;
		 int needleLoc=0;
		 int lenHay=haystack.length();
		 int lenNe=needle.length();
		 if(lenNe==0)
			 return 0;
		 else if(lenHay<lenNe) {
			 return -1;
		 }
		 int i=0;
		 for(;i<lenHay;i++) {
			  if(haystack.charAt(i)==needle.charAt(needleLoc)) {
				 needleLoc++;
				
			 }
			  if(needleLoc==lenNe) {
				  loc=i-needleLoc+1;
				  break;
			  }
			  if(i==lenHay-1) {
					 loc=-1;
					 break;
			  }
			  if(needleLoc>0 && needleLoc<lenNe && i<lenHay-1 &&
					  haystack.charAt(i+1)!=needle.charAt(needleLoc)  ){
				  i=i-needleLoc+1;
					needleLoc=0; 
				 }
			 
		 }
		 return loc;
	    }
	 //下面的方法无法处理str=null的情况
	 public static int strStrBetter2(String haystack,String needle) {
		        int l1 = haystack.length();
		        int l2 = needle.length();
		        for(int start  = 0 ; start < l1 - l2 +1 ; start++){
		            if(haystack.substring(start , start + l2).equals(needle))
		            return start;
		        }
		        return -1;
	 }
	 public static int KMP(String haystack,String needle) {
		 int lenH=haystack.length();
		 int lenN=needle.length();
		 if(haystack==null)
			 return -1;
		 else if(needle==null||lenN==0)
			 return 0;
		 else if(lenH<lenN)
			 return -1;
		 for(int i=0;i<=lenH-lenN;i++) {
			 int j=0;
			 for(;j<lenN && haystack.charAt(i+j)==needle.charAt(j);j++);
			 if(j==lenN)
				 return i;
			 else {
				 j=lenN-1;
				 while(j>=0 && i+lenN<lenH && needle.charAt(j)!=haystack.charAt(i+lenN)) {
					 j--;
				 }
				 if(j<0) 
					 i=i+lenN-1;
				 
				 else
					 i=i+lenN-j-1;
			 }
		 }
		 return -1;
	 }
	public static void main(String[] args) {
		
//		  测试数据：
//		  		输入: haystack = "hello", needle = "ll"   r
//		 		输出：2
//		 		输入: haystack = "aaaaa", needle = "bba"	r
//		 		输出: -1
//		 			"mississippi"	"issipi"	-1		r
//		 			"aaa"		"aaa"			0		r
//		 		"mississippi"	"issi"		1		r
//		 		"mississippi"	"issip"				r
		String haystack = "",
				needle = "";
		System.out.println("（测试方法）方法返回值是："+KMP(haystack,needle));
		System.out.println("正确答案是："+haystack.indexOf(needle));

	}

}
