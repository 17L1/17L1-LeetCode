package com.guang.LeetCode25K个一组翻转链表;

/**
 * @author: 17L1
 * @date: 2021年07月27日 11:38 下午
 * @method：
 */
public class Solution3 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = head;
        ListNode b = head;
        for (int i = 0; i < k; i++) {
            if (b == null) {
                return head;
            }
            b = b.next;
        }
        ListNode newNode = reverse(a, b);
        head.next = reverseKGroup(newNode, k);
        return newNode;
    }

    private ListNode reverse(ListNode a, ListNode b) {
        ListNode pre = null;
        ListNode next = a;
        ListNode cur = a;
        while (cur != b) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}