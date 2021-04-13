package com.guang.leetcode100SameTree;

public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }else if (p != null && q!=null){
            if (p.val != q.val){
                return false;
            }else {
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);

            }
        }else {
            return false;
        }
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
