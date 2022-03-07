package com.guang.LeetCode71简化路径;

import java.util.LinkedList;

/**
 * @author: 17L1
 * @date: 2022年03月07日 10:20 上午
 * @method：
 */
public class Solution2 {
    public String simplifyPath(String path) {
        int len = path.length();
        if (len < 1) {
            return "/";
        }
        String[] strs = path.split("/");
        LinkedList<String> stack = new LinkedList<>();
        for(String s : strs) {
            if ("".equals(s) || ".".equals(s)) {
                continue;
            }
            if ("..".equals(s)){
                if (stack.isEmpty()) {
                    continue;
                }
                stack.removeLast();
            }
            stack.addLast(s);
        }
        StringBuilder res = new StringBuilder("");
        while (!stack.isEmpty()) {
            res.insert(0,stack.removeLast());
            res.insert(0,"/");
        }
        if (res.toString().equals("")) {
            return "/";
        }
        return res.toString();
    }
}