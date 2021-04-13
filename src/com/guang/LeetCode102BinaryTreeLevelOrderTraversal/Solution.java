package com.guang.LeetCode102BinaryTreeLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public class TreeNode{
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
    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int level = 0;
        queue.add(root);
        while (!queue.isEmpty()){
//            List<Integer> list = new ArrayList<>();
//            list.add(queue.poll().val);
            res.add(new ArrayList<>());
            int level_length = queue.size();
            for (int i = 0; i < level_length; i++) {
                TreeNode tree = queue.remove();
                res.get(level).add(tree.val);
                if (tree.left != null){
                    queue.add(tree.left);
                }
                if (tree.right != null){
                    queue.add(tree.right);
                }
            }
            level++;
        }
        return res;
    }
}
