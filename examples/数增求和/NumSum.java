/*
 * 【题目】
 *  a + aa + aaa + ··· + aaaaaaaaa = ? （a为1~9之中的任意一个数字）
 */

package 数增求和;

import java.util.Scanner;

public class NumSum {
    
    public static void main(String[] args) {

        int a;

        int amount;

        int sum = 0;

        Scanner sc  = new Scanner(System.in);
        
        System.out.println("请输入 a 的值（1~9）：");

        a = sc.nextInt();

        System.out.println("请输入最多相加项的数量:");

        amount = sc.nextInt();

        sc.close();

        // 用于保存前一项的值 
        int a1 = a;

        for (int i = 1; i <= amount; i++) {

            sum += a;

            // 计算新的 a 值（后一项）
            // 每次 a 的后一项都等于前一项*10，再加上 a 值
            a = 10 * a + a1;

        }
        
        System.out.println("和为：" + sum);

    }

}
