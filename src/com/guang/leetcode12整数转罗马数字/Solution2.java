package com.guang.leetcode12整数转罗马数字;

public class Solution2 {
    public String intToRoman(int num) {
        StringBuilder res = new StringBuilder("");
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] luoma = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int index = 0;
        while (index < 13) {
            while (num > numbers[index]) {
                res.append(luoma[index]);
                num -= numbers[index];
            }
            index++;
        }
        return res.toString();
    }
}
