package com.guang.剑指offer32_3从上到下打印二叉树3;

import java.util.*;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        int i = 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int curSize = queue.size();
            for (int j = 0; j < curSize; j++) {
                TreeNode cur = queue.poll();
                if (i % 2 == 1){
                    list.add(0,cur.val);
                }else {
                    list.add(cur.val);
                }
                if (cur.left!=null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }

            }
            i++;
            res.add(list);
        }
        return res;

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