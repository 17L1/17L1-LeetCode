package com.guang.LeetCode25K个一组翻转链表;

public class Solution2 {
    public ListNode reverseKGroup(ListNode head, int k){
        if (head == null){
            return null;
        }
        ListNode a, b;
        a = b = head;
        for (int i = 0; i < k; i++) {
            if (b == null){
                break;
            }
            b = b.next;
        }
        ListNode newNode = reverse(a,b);
        head.next = reverseKGroup(b,k);
        return newNode;

    }

    private ListNode reverse(ListNode a, ListNode b) {
        ListNode pre = null;
        ListNode cur = a, nxt = a;
        while (cur != null){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
