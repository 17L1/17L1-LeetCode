package com.guang.LeetCode98ValidateBinarySearchTree;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        long lowwer= Long.MIN_VALUE;
        long upper = Long.MAX_VALUE;
        return bfs(root, lowwer,upper );
    }

    private boolean bfs(TreeNode root, long lowwer, long upper) {
        if (root == null){
            return true;
        }
        if (root.val <= lowwer){
            return false;
        }
        if (root.val >= upper){
            return false;
        }
        if (!bfs(root.left,lowwer, root.val)){
            return false;
        }
        if (!bfs(root.right, root.val, lowwer)){
            return false;
        }
        return true;
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
}
