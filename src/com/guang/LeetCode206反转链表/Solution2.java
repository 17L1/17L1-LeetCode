package com.guang.LeetCode206反转链表;

public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
