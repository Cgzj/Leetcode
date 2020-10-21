package com.leetcode_1;

public class RomanToInteger {
//13.罗马数字转整数
//	https://leetcode-cn.com/problems/roman-to-integer/
	static int romanSpe(String s) {
		int x=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='I') {
				if(i>=0 && i<s.length()-1) {
					if(s.charAt(i+1)=='V') {
						x+=4;
						s=s.replace("IV", "");
						i--;
					}else if(s.charAt(i+1)=='X') {
						x+=9;	
						s=s.replace("IX", "");
						i--;
					}					
				}
			}else if(s.charAt(i)=='X') {
				if(i>=0 && i<s.length()-1) {
					if(s.charAt(i+1)=='L') {
						x+=40;
						s=s.replace("XL", "");
						i--;
					}else if(s.charAt(i+1)=='C') {
						x+=90;	
						s=s.replace("XC", "");
						i--;
					}
				}
			}else if(s.charAt(i)=='C') {
					if(i>=0 && i<s.length()-1) {
						if(s.charAt(i+1)=='D') {
							x+=400;
							s=s.replace("CD", "");
							i--;
						}else if(s.charAt(i+1)=='M') {
							x+=900;	
							s=s.replace("CM", "");
							i--;
						}
					}
				}
			}
		return x;
	}
	static int romanCom(String s) {
		int x=0;
		s=s.replace("IV", "");
		s=s.replace("IX", "");
		s=s.replace("XL", "");
		s=s.replace("XC", "");
		s=s.replace("CD", "");
		s=s.replace("CM", "");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='I')
				x+=1;
			else if(s.charAt(i)=='V')
				x+=5;
			else if(s.charAt(i)=='X')
				x+=10;
			else if(s.charAt(i)=='L')
				x+=50;
			else if(s.charAt(i)=='C')
				x+=100;
			else if(s.charAt(i)=='D')
				x+=500;
			else if(s.charAt(i)=='M')
				x+=1000;
		}
		return x;
	}
	static int romanTI(String s) {
// 将IV，IX，XL，XC，CD，CM这写特殊的排列，用分别用单个字母替换，之后在遍历
		int x=0;
		//a->4;b->9;c->40;d->90;e->400;f->900;
		s=s.replace("IV", "a");
		s=s.replace("IX", "b");
		s=s.replace("XL", "c");
		s=s.replace("XC", "d");
		s=s.replace("CD", "e");
		s=s.replace("CM", "f");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a')
				x+=4;
			if(s.charAt(i)=='b')
				x+=9;
			if(s.charAt(i)=='c')
				x+=40;
			if(s.charAt(i)=='d')
				x+=90;
			if(s.charAt(i)=='e')
				x+=400;
			if(s.charAt(i)=='f')
				x+=900;
			if(s.charAt(i)=='I')
				x+=1;
			if(s.charAt(i)=='V')
				x+=5;
			if(s.charAt(i)=='X')
				x+=10;
			if(s.charAt(i)=='L')
				x+=50;
			if(s.charAt(i)=='C')
				x+=100;
			if(s.charAt(i)=='D')
				x+=500;
			if(s.charAt(i)=='M')
				x+=1000;
		}
		
		return x;
	}
	public static void main(String[] args) {
		String s=		"MCMXCIV"		;		
		int num=0;	
//		num=romanSpe(s)+romanCom(s);
		num=romanTI(s);
		System.out.println(num);
	
		
		}
}
		
		
		
		
		
		
//		输入: "III"
//		输出: 3		r
//
//		输入: "IV"
//		输出: 4		r
//
//		输入: "IX"
//		输出: 9
//
//		输入: "LVIII"
//		输出: 58		r
//		解释: L = 50, V= 5, III = 3.
//
//		输入: "MCMXCIV"
//		输出: 1994		r
//		解释: M = 1000, CM = 900, XC = 90, IV = 4.

