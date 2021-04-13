package com.guang.LeetCode150逆波兰表达式求值;

import java.util.LinkedList;

public class Solution {
    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        if (len < 1){
            return 0;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        for (String s : tokens){
            if ("+-*/".contains(s)){
                int a = stack.removeLast();
                int b = stack.removeLast();
                stack.addLast(calculator(a,b,s));
            }else {
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.getLast();
    }

    private int calculator(int a, int b, String s) {
        if (s.equals("+")){
            return a+ b;
        }
        if (s.equals("-")){
            return b - a;

        }
        if (s.equals("*")){
            return a * b;
        }
        if (s.equals("/")){
            return b / a;
        }
        return 1;
    }


}
