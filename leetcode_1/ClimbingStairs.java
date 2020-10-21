package com.leetcode_1;

public class ClimbingStairs {
	public static int climbingStairs(int n) {
		int a=0;
		if(n==1) {
			return a+=1;
		}else if(n==2)
			return a+=2;
		else {
			if(n>2)
				return a+=climbingStairs(n-1)+climbingStairs(n-2);
			else if(n>1)
				return a+=climbingStairs(n-1);
			else
				return 0;
		}
		
	}
	public static int climbStairs(int n) {
		int p=0,q=0,r=1;
		for(int i=0;i<n;i++) {
			p=q;
			q=r;
			r=p+q;
		}
		return r;
	}
	public static void main(String[] args) {
		System.out.println(climbStairs(45));

	}

}
