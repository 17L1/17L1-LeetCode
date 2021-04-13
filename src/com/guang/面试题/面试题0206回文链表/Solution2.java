package com.guang.面试题.面试题0206回文链表;


public class Solution2 {
    public boolean isPalindrome(ListNode head){
        if (head == null || head.next == null){
            return true;
        }
        ListNode firstHalfEnd = endOfFistHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        while (p2!=null){
            if (p1.val != p2.val){
                firstHalfEnd.next = reverseList(secondHalfStart);
                return false;
            }
            p1= p1.next;
            p2 = p2.next;
        }
        firstHalfEnd.next = reverseList(secondHalfStart);
        return true;
    }

    private ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null){
            ListNode nextTemp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nextTemp;
        }
        return pre;
    }

    private ListNode endOfFistHalf(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
