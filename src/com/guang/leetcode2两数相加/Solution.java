package com.guang.leetcode2两数相加;

import java.util.List;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int curNum = 0;
        int up = 0;
        while (l1 != null && l2 != null) {
            ListNode tmp = new ListNode(0);
            cur.next = tmp;
            curNum = l1.val + l2.val + up;
            up = curNum / 10;
            tmp.val = curNum % 10;
            cur = tmp;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            ListNode tmp = new ListNode(0);
            cur.next = tmp;
            curNum = l1.val + up;
            up = curNum / 10;
            tmp.val = curNum % 10;
            cur = tmp;
            l1 = l1.next;
        }
        while (l2 != null) {
            ListNode tmp = new ListNode(0);
            cur.next = tmp;
            curNum = l2.val + up;
            up = curNum / 10;
            tmp.val = curNum % 10;
            cur = tmp;
            l2 = l2.next;
        }
        if (up != 0) {
            ListNode tmp = new ListNode(0);
            tmp.val = up;
            cur.next = tmp;
        }
        return dummy.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    public ListNode (int val) {
        this.val = val;
    }
}
