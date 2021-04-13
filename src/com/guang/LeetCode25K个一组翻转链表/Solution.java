package com.guang.LeetCode25K个一组翻转链表;

import java.util.List;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k){
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode tail =dummy;
        while (true){
            int count = 0;
            while (tail != null && count != k){
                count++;
                tail = tail.next;
            }
            if (tail == null){
                break;
            }
            ListNode head1 = pre.next;
            while (pre.next != tail){
                ListNode cur = pre.next;
                pre.next = cur.next;
                cur.next = tail.next;
                tail.next = cur;
            }
            tail = head1;
            pre = head1;
        }
        return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
