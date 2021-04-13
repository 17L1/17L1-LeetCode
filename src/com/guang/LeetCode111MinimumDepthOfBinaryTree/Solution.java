package com.guang.LeetCode111MinimumDepthOfBinaryTree;

public class Solution {
    public int minDepth(TreeNode root){
        if (root == null){
            return 0;
        }
        if (root.left == null){
            return minDepth(root.right) + 1;
        }
        if (root.right == null){
            return minDepth(root.left) + 1;
        }
        return Math.min(minDepth(root.left),minDepth(root.right)) + 1;

    }

}
class TreeNode{
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
