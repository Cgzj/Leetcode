package com.leetcode_1;

public class ValidParentheses_20 {
	
	//20.判断字符串		https://leetcode-cn.com/problems/valid-parentheses/

	public static boolean isValid(String s) {
		boolean bool=true;
		int length=s.length();
		for(int i=0;i<=length && s.length()>0 ;i++) {
				s=s.replace("()", "");
				s=s.replace("[]", "");
				s=s.replace("{}", "");					
			}
			if(!s.equals(""))
				bool=false;
			return bool;
    }
	/*
	 * 调试：
	 */
	  public  static  String isValidToStr(String s) {
		boolean bool=true;
		int length=s.length();
		for(int i=0;i<=length && s.length()>0 ;i++) {
				System.out.print(s.length()+"______");
				s=s.replace("()", "");
				s=s.replace("[]", "");
				s=s.replace("{}", "");		
				System.out.println(s.length());
				System.out.print("第"+i+"循环得到："+s+"\n");
				
			}
			if(!s.equals(""))
				bool=false;
			return s;
    }
	public static void main(String[] args) {
		String[] s1=new String[] {
					"()"
				,	"()[]{}"		
				,	"(]"
				,	"([)]"
				,	"{[]}"	
				,	"(([]){})"
				,	"[{({(){}})}]"
				,	
				"([[][]{({}({}))}])"
		};
// ans= true	true	false	false	true	true	true	true
		for(int i=0;i<s1.length;i++) {
//			System.out.println(isValid(s1[i]));
		}

		System.out.println(isValidToStr(s1[s1.length-1]));		

	}

}
