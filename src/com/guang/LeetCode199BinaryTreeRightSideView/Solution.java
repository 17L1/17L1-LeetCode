package com.guang.LeetCode199BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer> list = new LinkedList<>();
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode currentNode = queue.poll();
                list.add(currentNode.val);
                if (currentNode.left!=null){
                    queue.add(currentNode.left);
                }
                if (currentNode.right!=null){
                    queue.add(currentNode.right);
                }
            }
            res.add(list.getLast());

        }
        return res;
    }
 }
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
