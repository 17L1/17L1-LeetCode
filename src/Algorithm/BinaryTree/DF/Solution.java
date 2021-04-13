package Algorithm.BinaryTree.DF;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * author:17L1
 *
 */
public class Solution {
    private static class Node{
        public int val;
        public Node left;
        public Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void dfs1(Node treeNode){
        if (treeNode == null){
            return;
        }
        List<Node> list = new ArrayList<>();
        list.add(treeNode);
        dfs1(treeNode.left);
        dfs1(treeNode.right);
    }
    public static void dfs2(Node treeNode){
        if (treeNode == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(treeNode);
        while (!stack.isEmpty()){
            Node root = stack.pop();
            if (root.right != null){
                stack.push(root.right);
            }
            if (root.left != null){
                stack.push(root.left);
            }
        }
    }
}
