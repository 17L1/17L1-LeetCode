package com.guang.LeetCode206反转链表;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode[] res = reverse(head);
        return res[0];

    }
    private ListNode[] reverse(ListNode head){
        if (head.next == null){
            return new ListNode[] {head,head};
        }
        ListNode[] res = reverse(head.next);
        res[1].next = head;
        head.next = null;

        return new ListNode[]{res[0],head};
    }

}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
