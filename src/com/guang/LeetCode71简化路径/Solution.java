package com.guang.LeetCode71简化路径;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        String[] dirs = path.split("/");
        if (dirs.length == 0){
            return "/";
        }
        Stack<String> stack = new Stack<>();
        for (String s : dirs){
            if ("".equals(s) ||".".equals(s)){
                continue;
            }
            if ("..".equals(s)){
                if (!stack.isEmpty()){
                    stack.pop();
                }
                continue;
            }
            stack.push(s);
        }
        StringBuilder str = new StringBuilder();
        if (stack.isEmpty()){
            str.insert(0,"/");
        }
        while (!stack.isEmpty()){
            str.insert(0,stack.pop());
            str.insert(0,"/");
        }
        return str.toString();
    }
}
