package com.leetcode_1;

//	https://leetcode-cn.com/problems/add-two-numbers/
//	2.两数相加
public class AddTwoNumbers {
	
	public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	   if(l1==null && l2==null)
		   return null;
	   ListNode summy=new ListNode(0);
	   ListNode head=summy;
	   int array=0;
	   while(l1!=null || l2!=null || array!=0 ) {
		   int val1=  l1==null?0:l1.val;
		   int val2=  l2==null?0:l2.val;
		   int sum=val1+val2+array;
		   head.next= new ListNode(sum%10);
		   head=head.next;
		   array=sum/10;
		   if(l1!=null) l1=l1.next;
		   if(l2!=null) l2=l2.next;
	   }
	   return summy.next;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(9);
		l1.next=new ListNode(9);
		l1.next.next=new ListNode(9);
		ListNode l2=new ListNode(9);
//		l2.next=new ListNode(6);
//		l2.next.next=new ListNode(4);
		ListNode.printList(addTwoNumbers(l1, l2));
	}
}
