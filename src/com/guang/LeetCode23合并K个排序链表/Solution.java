package com.guang.LeetCode23合并K个排序链表;
import java.util.*;
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if (len == 0){
            return null;
        }
        return mergeKLists(lists,0,len-1);
    }

    private ListNode mergeKLists(ListNode[] lists, int left, int right) {
        if (left == right){
            return lists[left];
        }
        int mid = left + (right - left) / 2;
        ListNode list1 = mergeKLists(lists,left,mid );
        ListNode list2 = mergeKLists(lists,mid+1,right);
        return mergeTwoSortLinkedList(list1,list2);
    }

    private ListNode mergeTwoSortLinkedList(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        if (list1.val < list2.val){
            list1.next = mergeTwoSortLinkedList(list1.next,list2);
            return list1;
        }
        list2.next = mergeTwoSortLinkedList(list2.next,list1);
        return list2;
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
