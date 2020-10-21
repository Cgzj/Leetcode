package com.leetcode_1;

//https://leetcode-cn.com/problems/plus-one/submissions/
//66.¼ÓÒ»
public class plusOne {
	public static int[] plusOne(int[] digits) {
		digits[digits.length-1]++;
		boolean ok=false;
      for(int i=digits.length-1;i>0;i--) {
    	  if(digits[i]>=9) {
    		  digits[i-1]+=digits[i]/10;
    		  digits[i]%=10;
    	  }
      }
      if(digits[0]>=10) {
    	  int [] dig=new int[digits.length+1];
    	  dig[0]=digits[0]/10;
    	  digits[0]%=10;
    	  for(int i=1;i<=digits.length;i++) {
    		  dig[i]=digits[i-1];
    	  }
    	  return dig;
      }
      return digits;
    }
	 public static int[] plusOne0(int[] digits) {
         for(int i = digits.length - 1; i >= 0; i --) {
             if(digits[i] == 9) {
                 digits[i] = 0;
             }else {
                 digits[i] ++;
                 return digits;
             }
         }
         digits = new int[digits.length+1];
         digits[0] = 1;
         return digits;
 }
	public static int[] plusOneString(int[] digits) {
		String str="";
		for(int i=0;i<digits.length;i++) {
			str+=digits[i]+"";
		}
		int num=Integer.parseInt(str);
		num++;
		String s=num+ "";
		int [] n=new int[s.length()];
		for(int i=0;i<s.length();i++) {
			n[i]=s.charAt(i)-'0';
		}
		return n;
	}
	public static void main(String[] args) {
		int[] array=new int[]{1,2,3};
		array=plusOne0(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}
