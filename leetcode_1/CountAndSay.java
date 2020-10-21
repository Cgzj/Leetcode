package com.leetcode_1;

//33.�������
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
		        // �ݹ���ֹ����
		        if (n == 1) {
		            return "1";
		        }
		        StringBuffer res = new StringBuffer();
		        // �õ���һ����ַ���
		        String str = countAndSay(n - 1);
		        int length = str.length();
		        // ��ʼָ��Ϊ0
		        int start = 0;
		        // ע�������ʼ����Ҫ�����泤��ͳһ
		        for (int i = 1; i < length + 1; i++) {
		            // �ַ������һλֱ��ƴ��
		            if (i == length) {
		                res.append(i - start).append(str.charAt(start));
		            // ֱ��startλ���ַ�����iλ���ַ�����ͬ��ƴ�Ӳ�����startλ
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
