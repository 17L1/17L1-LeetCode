package com.guang.leetcode129求根节点到叶节点数字之和;

public class Solution {
    int res;
    public int sumNumbers(TreeNode root){
        if (root == null){
            return 0;
        }

        dfs(root,root.val);
        return res;
    }

    private void dfs(TreeNode root,int num) {
        if (root.left == null && root.right == null){
            res += num;
        }
        if (root.left != null){
            dfs(root.left,num * 10 + root.left.val);
        }
        if (root.right != null){
            dfs(root.right,num * 10 + root.right.val);
        }
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
