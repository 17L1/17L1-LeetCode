package com.guang.leetcode83RemoveDuplicatesFromSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pre = head;
        ListNode cur = head;
        if (cur == null){
            return cur;
        }
        while (cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return pre;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}