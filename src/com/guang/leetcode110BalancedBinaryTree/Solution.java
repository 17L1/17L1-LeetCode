package com.guang.leetcode110BalancedBinaryTree;

public class Solution {
    public boolean isBalanced(TreeNode root){
        if (root == null){
            return true;
        }
        if (Math.abs(theDepthOfBinaryTree(root.left) - theDepthOfBinaryTree(root.right)) > 1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int theDepthOfBinaryTree(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(theDepthOfBinaryTree(root.left),theDepthOfBinaryTree(root.right)) + 1;
    }
}
class TreeNode{
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
