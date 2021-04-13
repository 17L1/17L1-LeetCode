package com.guang.LeetCode103BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution2 {
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
                if (i % 2 == 0){
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