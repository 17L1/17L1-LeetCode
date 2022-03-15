package AutumnTest.mihayou.question2;

/**
 * @author: 17L1
 * @date: 2021年08月15日 8:21 下午
 * @method：
 */
public class Solution {
    public static int computeN (int maxValue) {
        // write code here
        // write code here
        long count = 0;
        long factor = 1;
        long lowerNum = 0;
        long currNum = 0;
        long higherNum = 0;
        while (maxValue / factor != 0) {
            lowerNum = maxValue - (maxValue / factor) * factor;
            currNum = (maxValue / factor) % 10;
            higherNum = maxValue / (factor * 10);

            switch ((int)currNum) {
                case 0:
                    count += higherNum * factor;
                    break;
                case 1:
                    count += higherNum * factor + lowerNum + 1;
                    break;
                default:
                    count += (higherNum + 1) * factor;
                    break;
            }
            factor *= 10;
        }


        return (int)count;



    }

    public static void main(String[] args) {
        int x = 16;
        System.out.println(computeN(x));

    }
}
