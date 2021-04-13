package com.guang.leetcode107BinaryTreeLevelOrderTraversal2;

import java.util.*;

public class Solution2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
//        Stack<List<Integer>> stack = new Stack<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int curSize = queue.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
            }
//            stack.add(list);
            res.add(0,list);
        }
//        while (!stack.isEmpty()){
//            res.add(new ArrayList<>(stack.pop()));
//        }
        return res;
    }
}
