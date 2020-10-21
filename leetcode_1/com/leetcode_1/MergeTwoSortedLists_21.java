package com.leetcode_1;

//Definition for singly-linked list.
// class ListNode{
//	int val;
//	ListNode next;
//	ListNode(){}
//	ListNode(int val){this.val=val;}
//	ListNode(int val,ListNode next){
//		this.val=val;
//		this.next=next;
//	}
	
//}

public class MergeTwoSortedLists_21 {
	public static ListNode connect(ListNode l1, ListNode l2) {
		if(l2.next==null)
			return l1;
		else {
			l2.next=connect(l1,l2.next);
			return l2;
		}
	}
	 
	 public static ListNode mergeTwoListsCopy(ListNode l1, ListNode l2) {
	        if (l1 == null) {
	            return l2;
	        } else if (l2 == null) {
	            return l1;
	        } else if (l1.val < l2.val) {
	            l1.next = mergeTwoListsCopy(l1.next, l2);
	            return l1;
	        } else {
	            l2.next = mergeTwoListsCopy(l1, l2.next);
	            return l2;
	        }

	    }
	 public static ListNode mergeTwoListsCopy2(ListNode l1, ListNode l2) {
	        ListNode prehead = new ListNode(-1);

	        ListNode prev = prehead;
	        while (l1 != null && l2 != null) {
	            if (l1.val <= l2.val) {
	                prev.next = l1;
	                l1 = l1.next;
	            } else {
	                prev.next = l2;
	                l2 = l2.next;
	            }
	            prev = prev.next;
	        }

	        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
	        prev.next = l1 == null ? l2 : l1;

	        return prehead.next;
	    }
	 public static ListNode mergeTwoListsCopy3(ListNode l1, ListNode l2) {
	        // 类似归并排序中的合并过程
	        ListNode dummyHead = new ListNode(0);
	        ListNode cur = dummyHead;
	        while (l1 != null && l2 != null) {
	            if (l1.val < l2.val) {
	                cur.next = l1;
	                cur = cur.next;
	                l1 = l1.next;
	            } else {
	                cur.next = l2;
	                cur = cur.next;
	                l2 = l2.next;
	            }
	        }
	        // 任一为空，直接连接另一条链表
	        if (l1 == null) {
	            cur.next = l2;
	        } else {
	            cur.next = l1;
	        }
	        return dummyHead.next;
	    }
	    public static ListNode mergeTwoListsCopy4(ListNode l1, ListNode l2) {
	        ListNode dummy = new ListNode(-1);
	        ListNode p = dummy;
	        while (l1 != null && l2 != null) {
	            if (l1.val < l2.val) {
	                p.next = l1;
	                l1 = l1.next;
	            } else {
	                p.next = l2;
	                l2 = l2.next;
	            }
	            p = p.next;
	        }
	        if (l1 != null) {
	            p.next = l1;
	        }
	        if (l2 != null) {
	            p.next = l2;
	        }
	        return dummy.next;
	    }
	    public static void printList(ListNode l) {
	    	ListNode list=l;
	    	int i=0;
	    	if(list!=null)
	    	do {
	    		System.out.println("第"+i+"个数是："+list.val+"  ");
	    		list=list.next;
	    		i++;
	    	}while(list!=null);
	    }
//	    看了这么多正确方法我也试试，刚接触链表，理解有些困难。
	    public static ListNode mergeTwoLists(ListNode l11, ListNode l21) {
	    	ListNode l6=new ListNode();
			ListNode l0=new ListNode(1);
			ListNode l1=new ListNode(9);
			ListNode l2=new ListNode(10,l1);
			ListNode list=new ListNode(-1);
			ListNode l=list;
			
			while(l1!=null && l2!=null) {
				if(l1.val<l2.val) {
					l.next=l1;
					l=l.next;
					l1=l1.next;
					
				}
				else {
					l.next=l2;
					l=l.next;
					l2=l2.next;
				}
			}
			  if (l1 != null) {
		            l.next = l1;
		        }
		        if (l2 != null) {
		            l.next = l2;
		        }
			 return list.next;
		    }

	public static void main(String[] args) {
		ListNode l6=new ListNode();
		
		ListNode list2=new ListNode(4);
		ListNode list3=new ListNode(3);
		list2.next=new ListNode(18);
		l6=mergeTwoListsCopy4(list3,list2);
		printList(l6);
	}
	

}
