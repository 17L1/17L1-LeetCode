package com.guang.leetcode138复制带随机指针的链表;

public class Solution2 {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        Node cur = head;
        while (cur != null){
            Node newNode = new Node(cur.val);
            newNode.next = cur.next;
            cur.next = newNode;
            cur = cur.next;
        }
        cur = head;
        while (cur != null){
            if (cur.random!=null) {
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        Node dummy = new Node(0);
        Node p = head;
        cur = dummy;
        while (p != head){
            cur.next = p.next;
            cur = cur.next;
            p.next = cur.next;
            p = p.next;
        }
        return dummy.next;

    }
}
