package com.guang.LeetCode24两两交换链表中的节点;

import java.util.List;

public class Solution {
    public ListNode swapPairs(ListNode head){
        if (head == null && head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }


}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
