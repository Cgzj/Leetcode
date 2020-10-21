package com.leetcode_1;

public class Sqrtx {
	public static int mySqrt(int x) {
		if(x==1)
			return 1;
		int left=0;
		int right=x;
		int mid=x/2;
		while(left<right-1) {
			if((long)mid*mid>x) {
				right=mid;
			}else if((long)mid*mid<x) {
				left=mid;
				
			}else
				return (int)mid;
			mid=(left+right)/2;
		}
		
		return (long)(left+1)*(left+1)<x?(left+1):left;
	}
	public static int mySqrt1ms(int x) {
        if(x<=1)
            return x;
        int low=1,high=x;
        while(low<=high){
            int mid=low+(high-low)/2;
            int sqrt=x/mid;
            if(sqrt==mid)
                return mid;
            else if(mid>sqrt)
                high=mid-1;
            else
                low=mid+1;
        }    
        return high;
    }
	public static void main(String[] args) {
		int n=	8	;
		System.out.println(mySqrt(2147395600));
	}

}
