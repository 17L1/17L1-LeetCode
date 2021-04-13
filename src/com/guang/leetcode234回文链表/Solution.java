package com.guang.leetcode234回文链表;

public class Solution {
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null){
            return true;
        }
        ListNode halfFirst = findHalf(head).next;
        halfFirst = reverList(halfFirst);
        ListNode p1 = head;
        ListNode p2 = halfFirst;
        while (p2!=null){
            if (p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    private ListNode reverList(ListNode halfFirst) {
        ListNode pre = null;
        ListNode cur = halfFirst;
        while (cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }

    private ListNode findHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}
