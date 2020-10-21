package com.leetcode_1;

public class Palindrome_number {
//9.»ØÎÄÊı   https://leetcode-cn.com/problems/palindrome-number/
	public static boolean isPalindrome(int x) {
		boolean ans=false;
		if(x<0)
			ans=false;
		else {
			if(reverse(x)==x)
			ans=true;
		}
		return ans;
	}
	public static int reverse (int x) {
		 int y=0;
	        while(x!=0){
	        	if(y*10/10!=y ){
   			y=0;
   			break;
   	  	}
	        		y*=10;
	        		y=(y+x%10);	        		     
	        		x=x/10;	   
	        	}	 
	return y;
	 }
	public static void main(String[] args) {
		int x=10;
		System.out.println(isPalindrome(x));

	}

}
