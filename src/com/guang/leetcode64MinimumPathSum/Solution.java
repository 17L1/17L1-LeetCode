package com.guang.leetcode64MinimumPathSum;

public class Solution {
    public int minPathSum(int[][] grid) {
        if (grid.length==0 && grid[0].length==0){
            return grid[0][0];
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (i==0 && j==0){
                    continue;
                }
                if (i == 0){
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }else if (j == 0){
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }else {
                    grid[i][j] = Math.min(grid[i-1][j],grid[i][j-1]) + grid[i][j];
                    System.out.println();
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
