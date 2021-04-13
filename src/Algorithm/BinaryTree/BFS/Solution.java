package Algorithm.BinaryTree.BFS;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;

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
    private static void bfs(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node node = queue.poll();
            if (node.left != null){
                queue.add(node.left);

            }
            if (node.right != null){
                queue.add(node.right);
            }

        }
    }
}
