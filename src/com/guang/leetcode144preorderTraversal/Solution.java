package com.guang.leetcode144preorderTraversal;

import java.util.ArrayList;
import java.util.List;

/**
 * author :17L1
 * time :2021.04.04
 */
public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        bfs(root,res);
        return res;
    }

    private void bfs(TreeNode root, List<Integer> res) {
        if (root == null){
            return;
        }
        res.add(root.val);
        bfs(root.left,res);
        bfs(root.right,res);
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
}
