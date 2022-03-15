package AutumnTest.meituan.question5;

/**
 * @author: 17L1
 * @date: 2021年08月15日 11:11 上午
 * @method：
 */
import java.util.*;

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
        // 优先队列
        boolean[] isVisited = new boolean[n];
        PriorityQueue<Node> priorityQueue = new PriorityQueue<>((node1, node2)->node1.val - node2.val);
        for (i = 0; i < n; i++) {
            if (matrix[end][i][loc] != 0) {
                priorityQueue.offer(new Node(i, matrix[end][i][loc]));
            }
        }
        isVisited[end] = true;
        while (!priorityQueue.isEmpty()) {
            Node node = priorityQueue.poll();
            if (dp[node.end] > node.val) {
                dp[node.end] = node.val;
            }
            if (!isVisited[node.end]) {
                for (i = 0; i < n; i++) {
                    if (matrix[node.end][i][loc] != 0) {
                        priorityQueue.offer(new Node(i, dp[node.end] + matrix[node.end][i][loc]));
                    }
                }
                isVisited[node.end] = true;
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][][] matrix = new int[n][n][2];
        int m = scanner.nextInt();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int i;
        for (i = 0; i < m; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int car = scanner.nextInt();
            int walk = scanner.nextInt();
            matrix[x - 1][y - 1][0] = car;
            matrix[x - 1][y - 1][1] = walk;
            matrix[y - 1][x - 1][0] = car;
            matrix[y - 1][x - 1][1] = walk;
        }
        // 最好的选择就是在最开始的时候把全部的车都叫了，比较等待时间
        // 所以目前对于此问题转换为求终点到其余点打车的最短距离加上起点至此处的MIN(步行最短距离,等车时间）
        int[] dpCar = new int[n];
        Arrays.fill(dpCar, 0x3f3f3f3f);
        Dijkstra(matrix, dpCar, end - 1, 0);
        int[] dpWalk = new int[n];
        Arrays.fill(dpWalk, 0x3f3f3f3f);
        Dijkstra(matrix, dpWalk, start - 1, 1);

        int min = Integer.MAX_VALUE;
        for (i = 0; i < n; i++) {
            int wait = scanner.nextInt();
            if (min > Math.max(wait, dpWalk[i]) + dpCar[i]) {
                min = Math.max(wait, dpWalk[i]) + dpCar[i];
            }
        }
        System.out.println(min);
    }
}
