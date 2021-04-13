package com.guang.LeetCode99RecoverBinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution1 {
    public void recoverTree(TreeNode root){
        if (root == null){
            return;
        }
        List<TreeNode> list = new ArrayList<>();
        dfs(root,list);
        TreeNode x = null;
        TreeNode y = null;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).val > list.get(i+1).val){
                y = list.get(i+1);
                if (x == null){
                    x = list.get(i);
                }
            }

        }
        if (x != null && y != null){
            int tmp = x.val;
            x.val = y.val;
            y.val = tmp;
        }
    }

    private void dfs(TreeNode root, List<TreeNode> list) {
        if (root == null){
            return;
        }
        dfs(root.left,list);
        list.add(root);
        dfs(root.right,list);


    }
}
