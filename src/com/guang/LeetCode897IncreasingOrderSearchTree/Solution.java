package com.guang.LeetCode897IncreasingOrderSearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode increasingBST(TreeNode root){
        if (root == null){
            return root;
        }
        List<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        root = list.get(0);
        root.left = null;
        TreeNode tmp = root;
        for (int i = 1; i < list.size(); i++) {
            tmp.right = list.get(i);
            tmp.left = null;
            tmp = tmp.right;
        }
        tmp.left= null;
        return root;
    }

    private void dfs(TreeNode root, List<TreeNode> list) {
        if (root == null){
            return;
        }
        dfs(root.left,list);
        list.add(root);
        dfs(root.right,list);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

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