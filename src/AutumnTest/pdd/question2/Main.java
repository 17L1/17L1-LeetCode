package AutumnTest.pdd.question2;

import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月22日 7:20 下午
 * @method：
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = {1,-1,-2,3};
        for (int i = 0; i < n; i++) {
            int P = sc.nextInt();
            int Q = sc.nextInt();
            int amount = P - Q ;
            if (amount == 0) {
                System.out.println(0);
                continue;
            }
            if (amount < 0){
                int[] dp = new int[amount+1];
                for (int j = 1; j < dp.length ; j++) {
                    dp[i] = amount + 1;
                }
                for (int j = 1; j < dp.length; j++) {
                    for (int coin : coins) {
                        if (coin != 3) {
                            if (i + coin < 0) {
                                dp[i] = Math.min(dp[i], 1 + dp[i+coin]);
                            }
                        }
                    }
                }
            }

        }
    }
}
