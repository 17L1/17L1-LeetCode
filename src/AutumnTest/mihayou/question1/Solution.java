package AutumnTest.mihayou.question1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/**
 * @author: 17L1
 * @date: 2021年08月15日 8:10 下午
 * @method：复原IP地址
 */
public class Solution {
    public ArrayList<String> restoreIpAddresses (String ipStr) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        if (ipStr.length() < 4 || ipStr.length() > 12) {
            return res;
        }
        Deque<String> path = new ArrayDeque<>(4);
        dfs(ipStr, ipStr.length(), 0, 4, path, res);
        return res;
    }

    private void dfs(String ipStr, int len, int begin, int residue, Deque<String> path, ArrayList<String> res) {
        if (begin == len) {
            if (residue == 0) {
                res.add(String.join(".", path));
            }
        }
        for (int i = begin; i < begin + 3; i++) {
            if (i >= len) {
                break;
            }
            if (residue * 3 < len - 1) {
                continue;
            }
            if (judgeIpSegment(ipStr, begin, i)) {
                String currentIpSegment = ipStr.substring(begin, i + 1);
                path.addLast(currentIpSegment);
                dfs(ipStr, len, i + 1, residue-1, path, res);
                path.removeLast();
            }
        }
    }

    private boolean judgeIpSegment(String ipStr, int left, int right) {
        int len = right - left + 1;
        if (len > 1 && ipStr.charAt(left) == '0') {
            return false;
        }
        int res = 0;
        while (left <= right) {
            res = res * 10 + ipStr.charAt(left) - '0';
            left++;
        }
        return res >= 0 && res <= 255;
    }
}
