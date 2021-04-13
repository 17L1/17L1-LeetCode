package com.guang.LeetCode203移除链表元素;

public class Solution {
    public ListNode removeElements(ListNode head, int val){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev =dummy, cur = head;
        while (cur!= null){
            if (cur.val == val){
                prev.next = cur.next;

            }else {
                prev = cur;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
class ListNode{
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }
}
