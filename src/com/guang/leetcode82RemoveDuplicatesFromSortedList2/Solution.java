package com.guang.leetcode82RemoveDuplicatesFromSortedList2;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode cur = pre.next;
        while (cur != null){
            int tmp = 0;
            ListNode difNode = cur;
            while (difNode != null && difNode.val == cur.val){
                tmp++;
                difNode = difNode.next;

            }
            if (tmp > 1){
                pre.next = difNode;
            }else {
                pre = cur;
            }
            cur = difNode;
        }
        return dummyHead.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
