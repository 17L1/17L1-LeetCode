package com.guang.leetcode101SymmetricTree;

//Definition for a binary tree node.


import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if (root == null){
            return true;
        }
        return isSameTree(ReverseTreeNode(root.left),root.right);
    }
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p == null && q == null){
            return true;
        }else if (p == null && q != null || p != null && q == null){
            return false;
        }else{
            if (p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right)){
                return true;
            }
            return false;

        }
    }
    public TreeNode ReverseTreeNode(TreeNode root){
        TreeNode temp = null;
        if (root == null || root.left == null && root.right == null){
            return root;
        }else if (root.left != null && root.right != null){
            temp = root.left;
            root.left = root.right;
            root.right = temp;
        }else if (root.left != null){
            root.right = root.left;
            root.left = null;
        }else{
            root.left = root.right;
            root.right = null;
        }
        ReverseTreeNode(root.left);
        ReverseTreeNode(root.right);
        return root;
    }
}
