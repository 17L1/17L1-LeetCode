package com.guang.LeetCode24两两交换链表中的节点;

public class Solution2 {
    public ListNode swapPairs(ListNode head){
        if (head == null && head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tmp = dummy;
        while (tmp.next != null && tmp.next.next !=null ){
            ListNode start = tmp.next;//head
            ListNode end = tmp.next.next;//head.next
            tmp.next = end;
            start.next = end.next;
            end.next = start;
            tmp = start;
        }
        return dummy.next;

    }
}
