package com.guang.LeetCode108ConvertSortedArrayToBinarySearchTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums){
        int len = nums.length;
        if (len < 1){
            return null;
        }
        TreeNode root = null;
        List<TreeNode> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            if (i <= len/2){
                list.add(new TreeNode(nums[i]));
                if (i > 0){
                    list.get(i).left = list.get(i-1);
                }
                if (i == len/2){
                    root = list.get(i);
                }
            }else {
                list.add(new TreeNode(nums[i]));
                if (i == len - 1){
                    root.right = list.get(i);
                    list.get(i).left = list.get(i-1);
                }else {
                    if (i > len/ + 1){
                        list.get(i).left = list.get(i-1);
                    }
                }
            }
        }
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

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode() {
    }
}
