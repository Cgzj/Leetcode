package com.leetcode_1;

public class AddBinary {
public static String addBinaryFalse(String a, String b) {
        boolean carry=false;
        String c="";
        int lenA=a.length();
        int lenB=b.length();
        byte binA=0;
        byte binB=0;
        for(int i=0;i<lenA && i<lenB;i++) {
        	binA=(byte) (a.charAt(lenA-1-i)-'0');
        	binB=(byte) (b.charAt(lenB-1-i)-'0');
        	if(binA+binB==0) {
        		if(carry==false)
        		c="0"+c;
        		else {
        			c="1"+c;
        			carry=false;
        		}
        	}
        	else if(binA+binB==1) {
        		if(carry==false)
        		c="1"+c;
        		else {
        			c="0"+c;
        			carry=true;
        		}
        			
        		
        	}
        	else if(binA+binB==2) {
        		if(carry==false) {
        			c="0"+c;
        			carry=true;
        		}else {
        			c="1"+c;
        			
        		}
        		
        	}
        		
        }
        return c;
    }

public static String addBinaryFalse2(String a,String b) {
	int lenA=a.length();
    int lenB=b.length();
    int array=0;
    String c="";
    for(int i=0;i<lenA && i<lenB;i++) 
    	c=(a.charAt(lenA-1-i)-'0'+b.charAt(lenB-1-i)-'0')+c;
    System.out.println(c);
    String d="";
    for(int i=c.length()-1;i>=0;i--) {
    	if(c.charAt(i)==0) {
    		d=array+d;
    		array=0;
    	}
    	else if(c.charAt(i)==1) {
    		if(array==0)
    		d=1+d;
    		else 
    			d=0+d;
    		array=1;
    	}else if(c.charAt(i)==2) {
    		d=array+d;
    		array=1;
    	}
    	
    }
    return d;
    
}

public static String addBinary(String a,String b) {
	char[] addOne=new char[Math.max(a.length(), b.length())+1];
	for(int i=0;i<addOne.length;i++)
		addOne[i]='0';
	char[] addTwo=new char[b.length()];
	int j=0;
	for(int i=a.length()-1;i>=0;i--) {
		addOne[j]=a.charAt(i);
		j++;
	}
	j=0;
	for(int i=b.length()-1;i>=0;i--) {
		addTwo[j]=b.charAt(i);
		j++;
	}
	int array=0;
	for(int i=0;i<addOne.length;i++) {
		if(i<addTwo.length) {
			array=addOne[i]-'0'+addTwo[i]-'0';
//			System.out.println(array);
			if(array==0)
				addOne[i]='0';
			else if(array==1)
				addOne[i]='1';
			else if(array==2) {
				addOne[i]='0';
				addOne[i+1]++;
			}
			else if(array==3) {
				addOne[i]='1';
				addOne[i+1]++;
			}
		}
		
	}
	for(int i=0;i<addOne.length-1;i++) {
		if(addOne[i]=='2') {
			addOne[i]='0';
			addOne[i+1]++;
		}
		if(addOne[i]=='3') {
			addOne[i]='1';
			addOne[i+1]++;
		}
	}
	a="";
	boolean ok=false;
	for(int i=0;i<addOne.length;i++) {
		if(i<addOne.length-1)
			a=addOne[i]+a;
		else if(addOne[i]=='1')
			a=addOne[i]+a;
	}
	return a;
}

public String addBinaryBetter(String a, String b) {
    return Integer.toBinaryString(
        Integer.parseInt(a, 2) + Integer.parseInt(b, 2)
    );
}

public static String addBinaryBetter2(String a, String b) {
    StringBuffer ans = new StringBuffer();

    int n = Math.max(a.length(), b.length()), carry = 0;
    for (int i = 0; i < n; ++i) {
        carry += i < a.length() ? (a.charAt(a.length() - 1 - i) - '0') : 0;
        carry += i < b.length() ? (b.charAt(b.length() - 1 - i) - '0') : 0;
        ans.append((char) (carry % 2 + '0'));
        carry /= 2;
    }

    if (carry > 0) {
        ans.append('1');
    }
    ans.reverse();

    return ans.toString();
}

public static String addBinaryBetter_TryCopy(String a,String b) {
	StringBuffer ans=new StringBuffer();
	int n=Math.max(a.length(),b.length());
	int crray=0;
	for(int i=0;i<n;i++) {
		crray+=i<a.length()?(a.charAt(a.length()-1-i)-'0'):0;
		crray+=i<b.length()?(b.charAt(a.length()-1-i)-'0'):0;
		ans.append((char)(crray%2+'0'));
		crray/=2;
	}
	if(crray>0) {
		ans.append('1');
	}
	return ans.toString();
}

public static void main(String[] args) {
//		1010	1011	10101
		String a="1010";
		String b="1011";
		
		System.out.println(addBinaryBetter_TryCopy(a, b));
		
	}

}
