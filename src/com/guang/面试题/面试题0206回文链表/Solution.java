package com.guang.面试题.面试题0206回文链表;

import java.util.List;

public class Solution {
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }
        int n = 0;
        ListNode cur = head;
        while (cur != null){
            n++;
            cur = cur.next;
        }
        int[] help = new int[n];
        cur = head;
        for (int i = 0;i < n; i++){
            help[i] = cur.val;
            cur = cur.next;
        }
        for (int i = 0; i < n/2; i++) {
            if (help[i] != help[n-n/2-1]){
                return false;
            }
        }
        return true;
    }
}
class ListNode{
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}