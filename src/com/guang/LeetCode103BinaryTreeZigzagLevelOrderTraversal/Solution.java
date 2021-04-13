package com.guang.LeetCode103BinaryTreeZigzagLevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
直接使用bfs，先用队列按照广度优先逐渐存储树，然后用一个双端队列存储每一层，奇数层使用尾插法，
偶数层使用头插法
 */
public class Solution{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        //定义返回列表
        List<List<Integer>> res = new ArrayList<>();
        //如果根节点为空，则直接返回
        if (root == null){
            return res;
        }
        //使用队列记录BFS
        Queue<TreeNode> bfs = new LinkedList<>();
        //奇数还是偶数的指示
        boolean flag = true;
        //分辨是奇数层还是偶数层
        int isOrderFirst = 0;
        bfs.add(root);
        while (!bfs.isEmpty()){
            int length = bfs.size();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < length; i++) {
                TreeNode node = bfs.remove();
                if (node.left != null){
                    bfs.add(node.left);
                }
                if(node.right != null){
                    bfs.add(node.right);
                }
                if(flag == true){
                    list.add(node.val);
                }else {
                    list.addFirst(node.val);
                }
            }
            res.add(new ArrayList<>(list));
            flag = !flag;
        }
        return res;
    }

}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}
