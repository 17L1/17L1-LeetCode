package com.guang.leetcode100SameTree;

public class Solution {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode() {
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null &&q == null){
            return true;
        }else if (p != null && q!= null){
            if (p.val != q.val){
                return false;
            }
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }
}
