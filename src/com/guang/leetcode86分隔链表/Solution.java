package com.guang.leetcode86分隔链表;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode larger = new ListNode(0);
        ListNode largerHead = larger;
        while (head != null){
            if (head.val < x){
                small.next = head;
                small = small.next;
            }else {
                larger.next = head;
                larger = larger.next;
            }
            head = head.next;
        }
        larger.next = null;
        small.next = largerHead.next;
        return smallHead.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
