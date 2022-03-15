package AutumnTest.beike.question1;

/**
 * @author: 17L1
 * @date: 2021年08月13日 8:04 下午
 * @method：农场主牛牛
 */
public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     *
     * @param n int整型
     * @param m long长整型
     * @return long长整型一维数组
     */
    public long[] FarmerNN (int n, long m) {
        // write code here
        long[] res = new long[n];
        if (m <= n) {
            for (int i = 0; i < m ; i++) {
                res[i] = 1;
            }
            return res;
        }
        for (int i = 0; i < n; i++) {
            res[i] = 1;
        }
        long a = (m - n) / (n - 1);
        long c = (m - n) % (n - 1);
        long b = a % 2;
        if (a > 0) {
            for (int i = 0; i < n - 1; i++) {
                res[i] += a;
            }
            res[0] += a / 2;
            res[n-1] += a / 2;
        }
        if (b == 1) {
            res[0] += 1;
            for (int i = 0; i < c + 1; i++) {
                res[i] += 1;
            }
        }else {
            for (int i = n-2; i > n-2-c ; i--) {
                res[i] += 1;
            }
        }
        return res;
    }
}
