package com.leetcode_1;

public class LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs1) {
		String[] strs=new String[]{"abca","abc"};
		if(strs.length==0 )
			return "";
		else if(strs[0].equals(""))
			return "";
		String ans="";
        int length=strs.length;
        int minL=strs[0].length();
        for(int i=1;i<length;i++) {
        	if(minL>strs[0].length())
        		minL=strs[0].length();
        }
        for(int i=0;i<minL;i++) {
        	ans=strs[0].substring(0, i+1);
        	for(int j=0;j<length;j++) {
        		if(!strs[j].startsWith(ans)) {
        			if(i==0 )
        				return "";
        			else
        				return ans.substring(0,i);
        			
        		}
        	}
        }
		return ans;

    }
	public static void main(String[] args) {
//				{"dog","racecar","car"}
//			 {"flower","flow","flight"};
//			 {"c","c"};
//			 {"abca","abc"};
		String[] text=new String[] {"abca","abc"};
//		System.out.println(text.length==0);
		System.out.println(longestCommonPrefix(text));
	}

}
