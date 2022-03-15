package AutumnTest.alibaba.question2;

import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月13日 7:36 下午
 * @method：
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        for (int i = l-1; i < r ; i++) {
            int res = 0;
            for (int j = 1; j <= n ; j++) {
                int help = n % j;
                if (n - help - 1 < i) {
                    res++;
                }

            }
            System.out.print(res);
            System.out.print(" ");
        }
    }
}
