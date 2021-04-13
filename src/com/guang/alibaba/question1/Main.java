package com.guang.alibaba.question1;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[i] = sc.nextInt();
            }
            System.out.println(resCar(a));
        }
    }
    private static int resCar(int[] a){
        int res = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int left = 0;
            int right = 0;
            int ans = 0;
            while (right < len){
                if (a[right] == 1){
                    right++;
                    if (i >= left && i<= right){
                        ans = Math.max(ans,right - left);
                    }else {
                        ans = Math.max(ans,right-left + 1);
                    }
                    continue;
                }
                right++;
                left = right;

            }
            res = Math.max(res,ans);

        }
        return res;
    }
}
