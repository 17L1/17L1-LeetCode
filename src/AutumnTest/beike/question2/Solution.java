package AutumnTest.beike.question2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: 17L1
 * @date: 2021年08月13日 8:11 下午
 * @method：
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param s string字符串
     * @param k int整型
     * @return string字符串
     */
    public String NS_String (String s, int k) {
        // write code here
        int len = s.length();
        StringBuilder subStr = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (s.indexOf(s.charAt(i)) == i){
                subStr.append(s.charAt(i));
            }
        }
        String str = subStr.toString();
        char[] help = str.toCharArray();
        Arrays.sort(help);
        for (int i = 0; i < k; i++) {
            s = s.replaceAll(String.valueOf(help[i]), "");
        }
        return s;


    }
}
