package com.guang.leetcode226ReverseBinaryTree;

public class Solution {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public int getVal() {
            return val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

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
    public TreeNode invertTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null){
            return root;
        }
        TreeNode temp = null;
        if (root.left != null && root.right != null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }else if (root.left != null){
            root.right = root.left;
            root.left = null;
        }else if (root.right != null){
            root.left = root.right;
            root.right = null;
        }
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
