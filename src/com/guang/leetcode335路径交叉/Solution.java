/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-16 14:47:52
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-16 15:27:56
 */
package com.guang.leetcode335路径交叉;

public class Solution {
    public boolean isSelfCrossing(int[] distance) {
        // int len = distance.length;
        // if (len < 4) {
        //     return false;
        // }
        // int index = 1;
        // int up = 0, down = 0, left = 0, right = 0;
        // int x = 0, y = 0;
        // while (index < len) {
        //     if (index % 4 == 1) {
        //         y += distance[index - 1];
        //     }
        //     if (index % 4 == 2) {
        //         x -= distance[index - 1];
        //     }
        //     if (index % 4 == 3) {
        //         y -= distance[index - 1];
        //     }
        //     if (index % 4 == 0) {
        //         x += distance[index - 1];
        //     }
        //     if ((x >= right && y >= down && y <= up) || (x <= left && y >= down && y <= up) || (y <= down && x >= left && x <= right) || (y >= up && x >= left && x <= right)) {
        //         return true;
        //     }
        //     if (x >= right) {
        //         right = x;
        //     }
        //     if (x <= left) {
        //         left = x;
        //     }
        //     if (y >= up) {
        //         up = y;
        //     }
        //     if (y <= down) {
        //         down = y;
        //     }
        //     index++;
        // }
        
        
        // return false;

        int len = distance.length;
        if (len < 4) {
            return false;
        }
        for (int i = 3; i < len; i++) {
            if (distance[i] >= distance[i-2] && distance[i-1] <= distance[i-3]) {
                return true;
            }
            if (i >= 4 && distance[i-1] == distance[i-3] && distance[i] + distance[i-4] >= distance[i-2]) {
                return true;
            }
            if (i >= 5 && distance[i] + distance[i-4] >= distance[i-2] && distance[i-1] <= distance[i-3] && distance[i - 2] > distance[i-4] && distance[i-1] + distance[i-5] >= distance[i-3]) {
                return true;
            }
        }
        return false;
    }
}
