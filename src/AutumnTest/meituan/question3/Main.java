package AutumnTest.meituan.question3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月15日 10:49 上午
 * @method：
 */
import java.util.*;

public class Main {
    // 二分查找，找比他小的最大值
    public static int binarySearch(List<Node> list, int target) {
        int left = 0, right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).val < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
    static class Node {
        int val;
        int loc;
        Node(int val ,int loc) {
            this.val = val;
            this.loc = loc;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        LinkedList<Node> lListEven = new LinkedList<>();
        LinkedList<Node> rListEven = new LinkedList<>();
        LinkedList<Node> lListOdd = new LinkedList<>();
        LinkedList<Node> rListOdd = new LinkedList<>();
        // 分奇偶进行存储
        int i;
        for (i = 0; i < n; i++) {
            int num = scanner.nextInt();
            String direction = scanner.next();
            if (direction.equals("L") && num % 2 == 0) {
                lListEven.add(new Node(num, i));
            } else if (direction.equals("R") && num % 2 == 0) {
                rListEven.add(new Node(num, i));
            } else if (direction.equals("L")) {
                lListOdd.add(new Node(num, i));
            } else {
                rListOdd.add(new Node(num, i));
            }
        }
        lListEven.sort((o1, o2)->o1.val - o2.val);
        rListEven.sort((o1, o2)->o1.val - o2.val);
        lListOdd.sort((o1, o2)->o1.val - o2.val);
        rListOdd.sort((o1, o2)->o1.val - o2.val);

        for (Node tempNode: lListEven) {
            int tempLoc = binarySearch(rListEven, tempNode.val);
            if (tempLoc >= 0)  {
                Node rTempNode = rListEven.get(tempLoc);
                ans[tempNode.loc] = (tempNode.val - rTempNode.val) / 2;
                ans[rTempNode.loc] = (tempNode.val - rTempNode.val) / 2;
                rListEven.remove(tempLoc);
            }
        }
        for (Node tempNode: lListOdd) {
            int tempLoc = binarySearch(rListOdd, tempNode.val);
            if (tempLoc >= 0) {
                Node rTempNode = rListOdd.get(tempLoc);
                ans[tempNode.loc] = (tempNode.val - rTempNode.val) / 2;
                ans[rTempNode.loc] = (tempNode.val - rTempNode.val) / 2;
                rListEven.remove(tempLoc);
            }
        }
        for (i = 0; i < n; i++) {
            System.out.println(ans[i]);
        }
    }
}
