package com.guang.leetcode109ConvertSortedListToBinaryTree;

import java.util.List;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null){
            return null;
        }
        if (head.next == null){
            return new TreeNode(head.val);
        }
        ListNode p = head, q = head, pre = null;
        while (q!=null && q.next != null){
            pre = p;
            p = p.next;
            q = q.next.next;
        }
        pre.next = null;
        TreeNode root = new TreeNode(p.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(p.next);
        return root;
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode(int val) {
        this.val = val;
    }
}
