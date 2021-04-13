package com.guang.剑指offer46把数字翻译成字符串;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int pre = 1;
        int cur = 1;
        for (int i = 2; i < s.length(); i++) {
            String str = s.substring(i-2,i);
            int c = (str.compareTo("10") >= 0 && str.compareTo("25") <= 0) ? pre + cur : cur;
            pre = cur;
            cur = c;
        }
        return cur;
    }
}
