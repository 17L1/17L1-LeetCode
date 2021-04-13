package com.guang.LeetCode199BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution2 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null){
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
//            LinkedList<Integer> list = new LinkedList<>();
            int curSize = queue.size();
            for (int i = 0; i < curSize; i++) {
                TreeNode cur = queue.poll();
//                list.add(cur.val);
                if (cur.left != null){
                    queue.offer(cur.left);
                }
                if (cur.right != null){
                    queue.offer(cur.right);
                }
                if (i == curSize - 1){
                    res.add(cur.val);
                }
            }
        }
        return res;

    }
}
