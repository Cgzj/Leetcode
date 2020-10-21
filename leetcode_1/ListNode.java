package com.leetcode_1;

public class ListNode {
	int val;
	ListNode next;
	ListNode(){}
	ListNode(int val){this.val=val;}
	ListNode(int val,ListNode next){
		this.val=val;
		this.next=next;
	}
	public static  void printList(ListNode l) {
		ListNode list=l;
		int i=0;
		if(list!=null)
			do {
				System.out.println("第"+i+"个数是："+list.val+"  ");
				list=list.next;
				i++;
			}while(list!=null);
	}
}
