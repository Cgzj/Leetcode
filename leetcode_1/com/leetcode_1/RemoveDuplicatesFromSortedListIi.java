package com.leetcode_1;

public class RemoveDuplicatesFromSortedListIi {
//	https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/
//	82.删除排序链表中的重复元素II；
	public static ListNode deleteDuplicates(ListNode head) {
//		LeeCode非官方的第二种解法；
		if(head==null ||head==null)
			return head;
		ListNode dummy= new ListNode(-1);
		dummy.next=head;
		ListNode a=dummy;
		ListNode b=dummy.next;
		while(b!=null && b.next!=null) {
			if(a.next.val!=b.next.val) {
				a=a.next;
				b=b.next;
			}else {
				while(b.next!=null && b!=null && b.val==b.next.val) {
					b=b.next;
				}
				a.next=b.next;
				b=b.next;
			}
		}
		return dummy.next;
		
    }
	public static void main(String[] args) {
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(2);
		l1.next.next=new ListNode(2);
		l1.next.next.next=new ListNode(3);
		l1.next.next.next.next=new ListNode(3);
		ListNode l2=deleteDuplicates(l1);
		ListNode.printList(l2);
		
	}

}
