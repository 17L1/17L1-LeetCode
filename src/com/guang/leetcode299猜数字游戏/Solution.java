/*
 * @Description: 
 * @Author: lilongguang
 * @Date: 2022-03-16 09:34:20
 * @LastEditors: lilongguang
 * @LastEditTime: 2022-03-16 10:01:15
 */
package com.guang.leetcode299猜数字游戏;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String getHint(String secret, String guess) {
        int numBulls = 0;
        int numCows = 0;
        int len = secret.length();
        int[] cntA = new int[10];
        int[] cntB = new int[10];
        for (int i = 0; i < len; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                numBulls++;
            }else{
                cntA[secret.charAt(i) - '0']++;
                cntB[guess.charAt(i) - '0']++;
            }
            
        }
        for (int i = 0; i < 10; i++) {
            numCows += Math.min(cntA[i], cntB[i]);
        }
        return numBulls + "A" + numCows + "B";
    }
}
