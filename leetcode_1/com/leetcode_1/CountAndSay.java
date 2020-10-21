package com.leetcode_1;

//33.外观数组
//https://leetcode-cn.com/problems/count-and-say/

public class CountAndSay {
	
	 public static String countAndSayBad(int n) {
		 if(n==1)
			 return "1";
		 String count="11";
		 String say="";
		 int nums=1;
		 int len=2;
		 for(int times=2;times<n;times++) {
			 for(int i=0;i<len-1;i++) {
				 if(count.charAt(i)==count.charAt(i+1)) {
					 nums++;
					 if(i==len-2) {
						 say=say+""+nums+""+count.charAt(i);
						 nums=1;
					 }
				 }else {   
					 if(i!=len-2 || i==0) {
						 if((i==0 ) ||(i>0 && count.charAt(i)!=count.charAt(i-1))) {
							 say=say+""+1+""+count.charAt(i);
						 }					 
						 
					 }
					 if(i==len-2)
						 say=say+""+1+""+count.charAt(i+1);
 				 }
			 }
			 count=say;
			 say="";
			 len=count.length();
			 nums=1;
		 }
		 return count;
		 
	    }
	 
	 
	 public static String countAndSay(int n) {
		 String count="1";
		 String say="";
		 int len=1;
		 int nums=0;
		 char cha;
		 for(int times=0;times<n-1;times++) {
			len=count.length();
			 for(int i=0;i<len;) {
				 cha=count.charAt(i);
				 while((nums+i)<len && count.charAt(nums+i)==cha )
					 nums++;
				 if(nums!=0) {
					 say=say+""+nums+""+cha;
					 i=i+nums;
					 nums=0;
				 }else
					 i++;
			 }
			count=say;
			say="";
		 }
		 return count;
	 }
	 
	 public String countAndSayBetterOne(int n) {
	        if(n == 1) return "1";
	        String num = countAndSay(n - 1);
	        StringBuilder s = new StringBuilder();
	        for(int i=0; i<num.length(); i++) {
	            int count = 1;
	            while(i < num.length()-1 && num.charAt(i) == num.charAt(i+1)) {
	                count++;
	                i++;
	            }
	            s.append(count);
	            s.append(num.charAt(i));
	        }
	        return s.toString();
	    }
		    public String countAndSayBetterAnother(int n) {
		        // 递归终止条件
		        if (n == 1) {
		            return "1";
		        }
		        StringBuffer res = new StringBuffer();
		        // 拿到上一层的字符串
		        String str = countAndSay(n - 1);
		        int length = str.length();
		        // 开始指针为0
		        int start = 0;
		        // 注意这从起始条件要和下面长度统一
		        for (int i = 1; i < length + 1; i++) {
		            // 字符串最后一位直接拼接
		            if (i == length) {
		                res.append(i - start).append(str.charAt(start));
		            // 直到start位的字符串和i位的字符串不同，拼接并更新start位
		            } else if (str.charAt(i) != str.charAt(start) ) {
		                res.append(i - start).append(str.charAt(start));
		                start = i;
		            }
		        }
		        return res.toString();
		    }
	public static void main(String[] args) {
		System.out.println(countAndSay(		 27		));
	
	}

}
