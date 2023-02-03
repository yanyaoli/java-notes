/*
 * 【问题】
 * 求 2/1 + 3/2 + 5/3 + 8/5 + 13/8 ··· 前20项之和 
 */

package 分式求和;

public class fractionalSum {

    public static void main(String[] args) {

        double sum = 0;
        
        double numerator = 2.0, denominator = 1.0;  // 初始分子为 2 ， 分母为 1

        for (int i = 1; i <= 20; i++) {

            sum += numerator / denominator;

            denominator = numerator;  // 后一项的分母 = 前一项的分子

            numerator += denominator; // 后一项的分子 = 前一项的分子加分母

        }

        System.out.println("sum = " + sum);

    }
}