package AutumnTest.qunaer.question;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        int res = 0;
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(getAns(array));
    }
    public static long getAns(int[] ans) {
        Arrays.sort(ans);
        int i;
        long count = 0;
        long tempCount = 0;
        for (i = ans.length - 1; i >= 0; i--) {
            tempCount += ans[i];
            if (tempCount <= 0) {
                break;
            }
            else {
                count += tempCount;
            }
        }
        return count;
    }
}
