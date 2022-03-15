package AutumnTest.meituan.question2;

import java.util.Scanner;

/**
 * @author: 17L1
 * @date: 2021年08月15日 10:27 上午
 * @method：
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder stringBuilder  = new StringBuilder(str);
        int res = 0;
        for (int i = 0; i < str.length() - 1 && !isTrue(stringBuilder.toString()); i++) {
            stringBuilder.insert(str.length(), str.charAt(i));
            res++;
        }
        System.out.println(res);
    }

    private static boolean isTrue(String s) {
        boolean flag = true;
        for (int i = 0; i <= s.length() / 2 ; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
