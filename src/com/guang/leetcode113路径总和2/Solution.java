package com.guang.leetcode113路径总和2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        dfs(res,path,targetSum,root);
        return res;
    }

    private void dfs(List<List<Integer>> res, Deque<Integer> path, int targetSum, TreeNode root) {
        if (root == null){
            return;
        }
        if (root.val == targetSum && root.left == null && root.right == null){
            path.addLast(root.val);
            res.add(new ArrayList<>(path));
            path.removeLast();
            return;
        }
        path.addLast(root.val);
        dfs(res,path,targetSum - root.val,root.left);
        dfs(res,path,targetSum - root.val,root.right);
        path.removeLast();

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
