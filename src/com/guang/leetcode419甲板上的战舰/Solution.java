/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-19 09:49:57
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-19 15:05:34
 */
package com.guang.leetcode419甲板上的战舰;

public class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0 && board[i-1][j] == 'X') {
                    continue;
                }
                if (j > 0 && board[i][j-1] == 'X') {
                    continue;
                }
                if (board[i][j] == 'X') {
                    ans++;
                }
            }
        }
        return ans;
    }
}
