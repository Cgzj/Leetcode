package com.leetcode_1;

public class RemoveDuplicatesFromSortedList {
	
	public static ListNode deleteDuplicates(ListNode head) {
		ListNode q=head;
		while(q!=null && q.next!=null ) {
			if(q.val==q.next.val)
				q.next=q.next.next;
			else
				q=q.next;
		}
		return head;
	}
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(2);
		l1.next.next.next=new ListNode(3);
		l1.next.next.next.next=new ListNode(3);
		l1.next.next.next.next.next=new ListNode(3);
		ListNode l2=deleteDuplicates(l1);
		ListNode.printList(l2);
	}

}
