package com.guang.leetcode107BinaryTreeLevelOrderTraversal2;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        //List<List<Integer>> res2 = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < queue.size(); i++) {
                TreeNode node = queue.remove();
                list.add(node.val);
                if (node.left!=null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(list);

        }
//        for (int i = res.size() - 1; i >=0 ; i++) {
//            List<Integer> list = new ArrayList<>();
//            list = Collections.copy(res.get(i));
//        }
        Collections.reverse(res);
        return res;

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
}
