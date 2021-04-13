package com.guang.LeetCode328奇偶链表;

public class Solution{
    public ListNode oddEventList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode evenHead = head.next;
        ListNode odd = head;
        ListNode even = head.next;
        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
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
