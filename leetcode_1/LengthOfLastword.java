package com.leetcode_1;

public class LengthOfLastword {
	public static int lengthOfLastWord(String s) {
		int lens=0;
        boolean ok=true;
    for(int i=s.length()-1;i>=0;i--){
       if((s.charAt(i)>='a'&&s.charAt(i)<='z')||(s.charAt(i)>='A'&& s.charAt(i)<='Z')) {
    	   lens++;
       }else if(s.charAt(i)!=' ') {
    	   lens=0;
    	   ok=false;
       }else if(s.charAt(i)==' ') {
    	 if(ok==true && lens>0) {
    		 break;
    	 }else if(ok==false)
    		 lens=0;
    		 if( i-1>=0&&((s.charAt(i-1)>='a'&&s.charAt(i-1)<='z')||(s.charAt(i-1)>='A'&& s.charAt(i-1)<='Z')))
    			 ok=true;
       }
    }
    return lens;
	}
	public static void main(String[] args) {
		String words=" ";
		System.out.println(lengthOfLastWord(words));
	}

}
