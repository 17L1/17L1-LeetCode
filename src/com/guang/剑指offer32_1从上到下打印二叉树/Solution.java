package com.guang.剑指offer32_1从上到下打印二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            list.add(cur.val);
            if (cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
        int[] res = new int[list.size()];
        int i =0;
        for(int num : list){
            res[i++] = num;
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
