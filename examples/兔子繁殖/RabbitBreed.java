/*
 * 【题目】
 *  有一对兔子，从出生后第 3 个月起每个月都生 1 对兔子，小兔子长到第 3 个月后每个月又生 1 对兔子，假如兔子都不死，问每个月的兔子对数为多少？
 *  分析: 从第 3 个月开始 兔子的对数 a[n] = a[n-1] + a[n-2], 使用递归。
*/

package 兔子繁殖;

import java.util.Scanner;

public class RabbitBreed {

    public static void main(String[] args) {

        System.out.print("请输入查询的月份： \n");

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();

        int result = fun(month);

        System.out.println("第 " + month + " 个月，兔子的对数为： " + result);

        sc.close();

    }

    private static int fun(int month) {

        if (month == 1 || month == 2) {

            return 1;

        }

        return fun(month - 1) + fun(month - 2);

    }
}

