package AutumnTest.xiaohongshu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月21日 10:11 上午
 * @method：魔法师过河
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sumBlack = 0;
        int sumWhite = 0;
        int sumGap = 0;
        int sum = 0;
        int res = 0;
        int[][] stone = new int[n][3];
        int[] stoneBlack = new int[n];
        int[] stoneWhite = new int[n];
        for (int i = 0; i < n; i++) {
            stone[i][0] = scanner.nextInt();
            if (stone[i][0] == 0) {
                stone[i][1] = scanner.nextInt();
                stoneWhite[i] = stone[i][1];
                stone[i][2] = scanner.nextInt();
                stoneBlack[i] = stone[i][2];
                sumGap++;
            }else if (stone[i][0] == 1) {
                sumWhite++;
            }else {
                sumBlack++;
            }
        }

        if (Math.abs(sumBlack - sumWhite) > sumGap) {
            System.out.println(-1);
            return;
        }else if (Math.abs(sumBlack - sumWhite) == sumGap) {
            System.out.println(0);
        }
        int num = Math.abs(sumBlack - sumWhite);
        System.out.println(num);
        Arrays.sort(stoneBlack);
        Arrays.sort(stoneWhite);

        if (sumBlack > sumWhite) {
            for (int i = 0; i < n; i++) {
                if (sum == num) {
                    System.out.println(res);
                    break;
                }
                if (stoneWhite[i] != 0) {
                    sum++;
                    res += stoneWhite[i];
                    System.out.println(stoneWhite[i]);

                }
            }
        }else {
            for (int i = 0; i < n; i++) {
                if (sum == num) {
                    System.out.println(res);
                    break;
                }
                if (stoneBlack[i] != 0) {
                    sum++;
                    res += stoneBlack[i];
                    System.out.println(stoneBlack[i]);
                }
            }
        }
    }
}
