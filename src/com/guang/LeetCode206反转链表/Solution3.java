package com.guang.LeetCode206反转链表;

/**
 * @author: 17L1
 * @date: 2021年07月26日 11:33 下午
 * @method：
 */
public class Solution3 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode res = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return res;

    }
}
