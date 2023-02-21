/*
 * 计算1~20的阶乘的倒数之和
 * 编写 Java 程序
 * 使用 while 循环语句计算 1+1/2!+1/3!+…+1/20！之和。
 */

package chapter04;

public class exercise3 {
    public static void main(String[] args) {
        /**
         * @param i 阶数
         * @param sum 求和
         * @param fact 阶乘结果
         */

        int i = 1;
        double sum = 0, fact = 1;

        while (i <= 20) {
            fact *= i;  // 整数的阶乘
            sum += 1 / fact;  // 转换成倒数的阶乘，再相加
            i++;
        }
        System.out.println("1+1/2!+1/3!+…+1/20! = " + sum);
    }
}

