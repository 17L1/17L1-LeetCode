package AutumnTest.baidu;

/**
 * @author: 17L1
 * @date: 2021年08月11日 7:51 下午
 * @method：
 */
public class Main2 {
    public static int[][] snakeArray(int n) {
        //n >= 2
        int[][] res = new int[n][n];
        int x = 0, y = n - 1;
        res[x][y] = 1;
        int total = 1;
        while (total < n * n) {
            while (x + 1 < n && res[x+1][y] == 0) {
                res[++x][y] = ++total;
            }
            while (y - 1 >= 0 && res[x][y-1] == 0) {
                res[x][--y] = ++total;
            }
            while (x - 1 >= 0 && res[x-1][y] == 0) {
                res[--x][y] = ++total;
            }
            while (y + 1 < n && res[x][y+1] == 0) {
                res[x][++y] = ++total;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] ans = snakeArray(8);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
