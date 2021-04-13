package com.guang.LeetCode147对链表进行插入排序;

public class Solution {
    public ListNode insertionSortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //pre负责指向新元素，last负责指向新元素的前一个元素
        //判断是否需要执行插入操作
        ListNode pre = head.next;
        ListNode last = head;
        ListNode temp = dummy;
        while (pre!=null){
            if (last.val <= pre.val){
                pre = pre.next;
                last = last.next;
                continue;
            }
            temp = dummy;
            while (temp.next.val <= pre.val){
                temp = temp.next;
            }
            last.next = pre.next;
            pre.next = temp.next;
            temp.next = pre;
            pre = last.next;
        }
        return dummy.next;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }


}
