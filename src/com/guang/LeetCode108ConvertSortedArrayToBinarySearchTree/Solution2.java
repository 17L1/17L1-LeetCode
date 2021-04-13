package com.guang.LeetCode108ConvertSortedArrayToBinarySearchTree;

public class Solution2 {
    public TreeNode sortedArrayToBST(int[] nums){
        return dfs(nums,0,nums.length-1);
    }
    private TreeNode dfs(int[] nums, int i, int i1) {
        if (i1 < i){
            return null;
        }
        int mid = i + (i1 - i) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums,i,mid - 1);
        root.right = dfs(nums,mid+1, i1);
        return root;
    }
}
