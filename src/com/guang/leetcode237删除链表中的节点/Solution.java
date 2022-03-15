package com.guang.leetcode237删除链表中的节点;

public class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur = node;
        ListNode ne = node.next;
        while (true) {
            cur.val = ne.val;
            if (ne.next == null){
                cur.next = null;
                return;
            }
            cur = ne;
            ne = ne.next;
        }
    }
}
class ListNode {
    int val;
    ListNode next;
    public ListNode(int val) {
        this.val = val;
    }
}
