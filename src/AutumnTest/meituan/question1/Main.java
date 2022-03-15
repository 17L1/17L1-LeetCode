package AutumnTest.meituan.question1;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月15日 10:08 上午
 * @method：
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            Arrays.sort(array);
//            System.out.println(array[0]);
            boolean isYes = true;
            for (int j = 0; j < n; j++) {
                if (array[j] != j+1){
                    isYes = false;
                }
            }
            if (isYes) {
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}
