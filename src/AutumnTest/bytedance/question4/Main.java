package AutumnTest.bytedance.question4;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int[] array = new int[len];
            for (int j = 0; j < len; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(getLength(array));
        }
    }

    private static int getLength(int[] array) {
        int sum = 0;
        int ans = 0;
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for (int j : array) {
            if (sum + j >= 0) {
                ans++;
                sum += j;
                if (j < 0) que.add(j);
            } else {
                if (!que.isEmpty() && j > que.peek()) {
                    sum -= que.remove();
                    sum += j;
                    que.add(j);
                }
            }
        }
        return ans;
    }
}
