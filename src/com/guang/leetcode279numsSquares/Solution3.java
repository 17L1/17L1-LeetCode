package com.guang.leetcode279numsSquares;

import java.util.LinkedList;
import java.util.Queue;

public class Solution3 {
    public int numSquares(int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        int step = 1;
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int top = queue.poll();
                for (int j = 1; j * j <= top ; j++) {
                    if (j * j == top){
                        step++;
                    }
                    int next = top - j * j;
                    if (!visited[next]){
                        queue.offer(next);
                        visited[next] = true;
                    }
                }
            }
            step++;
        }
        return step;
    }
}
