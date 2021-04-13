package com.guang.leetcode226ReverseBinaryTree;

public class Solution2 {
    public class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(TreeNode left, TreeNode right, int val) {
            this.left = left;
            this.right = right;
            this.val = val;
        }

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isSymmetric(TreeNode root){
        return help(root,root);

    }

    private boolean help(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null){
            return true;
        }
        if (root == null || root1 == null){
            return false;
        }
        return help(root.left,root1.right) && help(root.right,root1.left) && root.val == root1.val;

    }
}
