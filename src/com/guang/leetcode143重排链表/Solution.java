package com.guang.leetcode143重排链表;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null){
            return;
        }
        List<ListNode> list = new ArrayList<>();
        while (head != null){
            list.add(head);
            head = head.next;
        }
        int left = 0;
        int right = list.size();
        while (left < right){
            list.get(left).next = list.get(right);
            left++;
            if (left == right){
                break;
            }
            list.get(right).next = list.get(left);
            right--;
        }
        list.get(left).next = null;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val) {
        this.val = val;
    }
}
