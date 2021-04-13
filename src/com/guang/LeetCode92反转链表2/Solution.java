package com.guang.LeetCode92反转链表2;

import java.util.List;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;//哨兵节点
        ListNode first = dummy;//第一段的第一个最后一个节点
        for (int i = 1; i < left; i++) {
            first = first.next;
        }
        ListNode second = first.next;
        ListNode l = second;
        ListNode r = l.next;
        for (int i = left; i < right; i++) {
            ListNode tmp = r.next;
            r.next = l;
            l = r;
            r = tmp;
        }
        second.next = r;
        first.next = l;
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
