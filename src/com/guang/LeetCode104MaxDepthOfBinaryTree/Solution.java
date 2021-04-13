package com.guang.LeetCode104MaxDepthOfBinaryTree;

public class Solution {
    public int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {

        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
    }
}
