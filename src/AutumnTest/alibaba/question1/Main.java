package AutumnTest.alibaba.question1;

import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月13日 7:03 下午
 * @method：
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        double sum = 0;
        //long[] help = new long[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            sum += nums[i];
            //help[i] = sum;
        }
        double maxSum = 0;
        double help = 0;
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            help += nums[i];
            if (help * (sum - help) > maxSum) {
                maxSum = help * (sum - help);
                res = i + 1;
            }
        }
        System.out.println(res);

    }
}
