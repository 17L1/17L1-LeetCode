package AutumnTest.meituan.question4;

import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月15日 10:52 上午
 * @method：
 */
public class Main {
    static class Node {
        int end;
        int val;

        Node(int e, int v) {
            end = e;
            val = v;
        }
    }
    public static void Dijkstra(int[][][] matrix, int[] dp, int end, int loc) {
        dp[end] = 0;
        int n = matrix.length;
        int i;
        boolean[] isvisited = new boolean[n];
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((node1, node2) -> node1.val - node2.val);
        for (i = 0; i < n; i++) {
            if (matrix[end][i][loc] != 0) {
                priorityQueue.offer(new Node(i,matrix[end][i][loc]));
            }
        }
        isvisited[end] = true;
        while (!priorityQueue.isEmpty()) {
            Node node = priorityQueue.poll();
            if (dp[node.end] > node.val) {
                dp[node.end] = node.val;
            }
            if (!isvisited[node.end]) {
                for (i = 0; i < n; i++) {
                    if (matrix[node.end][i][loc] != 0) {
                        priorityQueue.offer(new Node(i, dp[i] + matrix[node.end][i][loc]));
                    }
                }
                isvisited[node.end] = true;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][][] matrix = new int[n][n][2];
        int m = sc.nextInt();;
        int start = sc.nextInt();
        int end = sc.nextInt();
        int i;
        for (i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int car = sc.nextInt();
            int walk = sc.nextInt();
            matrix[x- 1][y-1][0] = car;
            matrix[x- 1][y-1][1] = walk;
            matrix[y- 1][x-1][0] = car;
            matrix[y- 1][x-1][1] = walk;
        }
        int[] dpCar = new int[n];
        Arrays.fill(dpCar, 0x3f3f3f3f);
        Dijkstra(matrix, dpCar, end - 1, 0);
        int[] doWalk = new int[n];
        Arrays.fill(doWalk, 0x3f3f3f3f);
        Dijkstra(matrix, doWalk, start - 1, 1);
        int min = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            int wait = sc.nextInt();
            if (min > Math.max(wait, doWalk[i] + dpCar[i])){
                min = Math.max(wait, doWalk[i] + dpCar[i]);
            }
        }
        System.out.println(min);


    }
}
