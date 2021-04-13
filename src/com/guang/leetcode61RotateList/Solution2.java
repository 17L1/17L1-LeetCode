package com.guang.leetcode61RotateList;

public class Solution2 {
    public ListNode rotateRight(ListNode head, int k){
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        cur = head;
        for (int i = 0; i < k % size; i++) {
            cur = cur.next;
        }
        ListNode point = cur.next;
        cur.next = null;
        cur = point;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = head;
        return point;
    }
}
