package com.guang.LeetCode92反转链表2;

public class Solution2 {
    public ListNode reverseBetween(ListNode head, int left, int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        for (int i = 1; i < left; i++) {
            first = first.next;
        }
        ListNode second = first.next;
        ListNode l = second;
        ListNode r = second.next;
        for (int i = 0; i < right - left; i++) {
            ListNode tmp = r.next;
            r.next = l;
            l = r;
            r = tmp;
        }
        first.next = l;
        second.next = r;
        return dummy.next;
    }
}
