package com.guang.leetcode138复制带随机指针的链表;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public Node copyRandomList(Node head) {
        if (head == null){
            return null;
        }
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while (cur != null){
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        while(cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
class Node{
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next, Node random) {
        this.val = val;
        this.next = next;
        this.random = random;
    }
}
