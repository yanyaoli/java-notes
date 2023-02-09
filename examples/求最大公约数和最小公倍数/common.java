/*
    题目：输入两个正整数 m 和 n ，求其最大公约数和最小公倍数。
*/

package 求最大公约数和最小公倍数;

import java.util.Scanner;

public class common {

    public static void main(String[] args) {
        System.out.print("请输入第一个整数: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("请输入第二个整数: ");
        int n = sc.nextInt();
        sc.close();

        int maxCommonDivisor = maxCommonDivisor(m, n);   // 定义最大公约数
        int minCommonMultiple = minCommonMultiple(m, n);    // 定义最小公倍数
        System.out.println("正整数 " + m + " 和 " + n + " 的\n最大公约数为: " + maxCommonDivisor + "\n最小公倍数为: " + minCommonMultiple);

    }

    // 利用辗转相除法
    private static int maxCommonDivisor(int m, int n) {
        int temp = 1;   // 暂存数
        if (n > m) {    // 使得 m 永远大于 n
            temp = m;
            m = n;
            n = temp;
        }
        while (temp != 0) {    // 求余结果不等于零，就一直循环
            temp = m % n;   // 求余
            m = n;  // 大的数已经没用了，小数给 m
            n = temp;   // 余数给 n
        }
        return m;
    }

    // 利用到最大公约数
    private static int minCommonMultiple(int m, int n) {
        int divisor = maxCommonDivisor(m, n);
        return divisor * (m / divisor) * (n / divisor);
    }
}

