/*
 * 判断奇偶数
 * 编写Java程序，实现判断变量x是奇数还是偶数
 */

package chapter04;

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        
        System.out.print("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        
        if (scanner.hasNextInt()) {
            // 判断输入的是否是整数
            int num = scanner.nextInt();
            // 接收整数
            if(num == 0 || num % 2 == 0){
                System.out.println(num + " 是偶数");
            }else{
                System.out.println(num + " 是奇数");
            }
        } else {
            // 非整数报错
            String num = scanner.nextLine();
            System.out.println( num + " 不是整数");
        }
    }
}