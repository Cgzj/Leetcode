package com.leetcode_1;

public class ReverseInteger {
	//https://leetcode-cn.com/problems/reverse-integer/submissions/
	//正确答案：
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
		int x=-2147;	
	    System.out.println(reverse(x));
	}
//	错误实例：
	//曾出错数据：
/*	int x=-2147483412;//-2143847412;R
	int x=1563847412; //ans=0;R
	int x=-2147483648;//ans=0;R
	int x=1534236469;//ans=0;R
	int x=1563847412;//ans=0;R
	*/
//	 public static int reversef(int x) {
//		 int y=0;
//	        while(x!=0){
//	        	if(x<10 &&x>-10)
//	        		y=(y+x%10);
//	        	else {
//	        		if(y*10/10!=y||symbol(x)*symbol(y)<0)
//		        		return 0;
//	        		y=(y+x%10)*10;
//	        		}
//	        	x/=10;
//	        	}	        
//	  return y;
//	  }
//	 public static int symbol(int x) {
//		 if(x!=0) 
//		 return x/(Math.abs(x));
//		 return 0;
//	
//	 }
		
}
