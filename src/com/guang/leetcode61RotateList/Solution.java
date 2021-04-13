package com.guang.leetcode61RotateList;

import java.util.List;

public class Solution {
    public ListNode rotateRight(ListNode head, int k){
        if (head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        ListNode cur = head;
        int n = 1;
        while(cur.next != null){
            cur = cur.next;
            n++;
        }
        n++;
        cur.next = head;
        cur = head;
        for (int i = 0;i <= n - (k % n) - 1;i++){
            cur = cur.next;
        }
        ListNode newHead = cur.next;
        cur.next = null;
        return newHead;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode() {
    }
}