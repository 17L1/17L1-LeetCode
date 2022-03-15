package AutumnTest.PDD7.question1;

import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年07月25日 6:53 下午
 * @method：
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
//        boolean flag = false;
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    continue;
                }
                if (arr[i][0] <= arr[j][0] && arr[i][1] >= arr[j][1]){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");


    }
}
