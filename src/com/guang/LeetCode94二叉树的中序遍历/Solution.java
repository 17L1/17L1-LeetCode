package com.guang.LeetCode94二叉树的中序遍历;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
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
        res.add(root.val);
        dfs(root.right,res);
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
