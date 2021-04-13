package com.guang.leetcode889根据前序和后序遍历构造二叉树;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private int[] preorder;
    private Map<Integer, Integer> map;
    public TreeNode constructFromPrePost(int[] preorder, int[] inorder) {

        int lenPre = preorder.length;
        int lenIn = inorder.length;
        if (lenPre != lenIn){
            throw new IllegalArgumentException("数据输入错误");
        }
        if (lenPre == 0 && lenIn == 0){
            return null;
        }
        Map<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < lenPre; i++) {
            map.put(preorder[i],i);
        }
        return buildTree(0,lenPre-1,0,lenIn -1);
    }

    private TreeNode buildTree(int preLeft, int preRight, int inleft, int inRight) {
        if (preLeft > preRight || inleft > inRight){
            return null;
        }
        int pivot = preorder[preLeft];
        TreeNode root = new TreeNode(pivot);
        int index = map.get(pivot);
        root.left = buildTree(preLeft + 1, index - inleft + preLeft,inleft,index - 1);
        root.right = buildTree(index - inleft + preLeft + 1,preRight,index+1,inRight);
        return root;
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
