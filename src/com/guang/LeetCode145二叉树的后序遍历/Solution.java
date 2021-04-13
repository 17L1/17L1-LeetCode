package com.guang.LeetCode145二叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        dfs(root,res);
        return res;
    }
    private void dfs(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        dfs(root.left,res);
        dfs(root.right,res);
        res.add(root.val);
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
