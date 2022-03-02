package com.guang.leetcode12整数转罗马数字;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String intToRoman(int num) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10,"X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000,"M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900,"CM");
        StringBuilder res = new StringBuilder("");
        while (num > 0) {
            if (num / 1000 > 0) {
                for (int i = 0; i < num / 1000; i++) {
                    res.append(map.get(1000));
                }
                num %= 1000;
            }
            if (num / 100 > 0) {
                if (num / 100 == 9) {
                    res.append(map.get(900));
                }else if (num / 100 >= 5) {
                    int cur = num / 100 - 5;
                    res.append(map.get(500));
                    for (int i = 0; i < cur; i++) {
                        res.append(map.get(100));
                    }
                }else{
                    if (num / 100 == 4) {
                        res.append(map.get(400));
                    }else {
                        for (int i = 0; i < num / 100; i++) {
                            res.append(map.get(100));
                        }
                    }
                }
                num %= 100;
            }
            if (num / 10 > 0) {
                if (num / 10 == 9) {
                    res.append(map.get(90));
                }else if (num / 10 >= 5) {
                    int cur = num / 10 - 5;
                    res.append(map.get(50));
                    for (int i = 0; i < cur; i++) {
                        res.append(map.get(10));
                    }
                }else{
                    if (num / 10 == 4) {
                        res.append(map.get(40));
                    }else {
                        for (int i = 0; i < num / 10; i++) {
                            res.append(map.get(10));
                        }
                    }
                }
                num %= 10;
            }
            if (num  > 0) {
                if (num  == 9) {
                    res.append(map.get(9));
                }else if (num >= 5) {
                    int cur = num - 5;
                    res.append(map.get(5));
                    for (int i = 0; i < cur; i++) {
                        res.append(map.get(1));
                    }
                }else{
                    if (num == 4) {
                        res.append(map.get(4));
                    }else {
                        for (int i = 0; i < num; i++) {
                            res.append(map.get(1));
                        }
                    }
                }
                num %= 1;
            }
        }
        return res.toString();
    }
}
