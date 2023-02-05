/*
 * 将一个正整数分解质因数
 * 例如：输入90，打印出90=2*3*3*5
 * 
 */

package 质因数;

import java.util.Scanner;

public class Factorization {

    public static void main(String[] args) {

        System.out.print("输入要被质因数的正整数：");

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        method1(num);
        method2(num);

    }

    // 方法一
    private static void method1(int num) {

        StringBuilder output = new StringBuilder(num + "=");

        wc: while (true) {

            for (int i = 2; i <= Math.sqrt(num); i++) {

                if (num % i == 0) {

                    output.append(i).append("*");

                    num = num / i;

                    continue wc; // 如果执行了if语句，表明质因数分解了一次，则改变num后继续下次外层循环

                }
            }
            output.append(num); // for循环结束表明没有可以分解的，则加上最后剩下的数字后break
            
            break;
        }
        System.out.println(output.toString());
    }

    // 方法二
    // 从2开始循环，在for循环下有个while循环会一直将n除以i,
    // 以2为例，会除以2到不能整除为止，再除以3
    private static void method2(int n) {

        System.out.print(n + "=");

        for (int i = 2; i < n + 1; i++) {

            while (n % i == 0 && n != i) {

                n /= i;

                System.out.print(i + "*");

            }

            if (n == i) {

                System.out.println(i);

                break;

            }
        }
    }
}
