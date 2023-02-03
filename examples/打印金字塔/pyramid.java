/*
        *   
       ***  
      ***** 
     *******
    *********
   ***********
  *************
 ***************
*****************
 */

package 打印金字塔;

import java.util.Scanner;

public class pyramid {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("请输入一个1~9之间的整数：\n");

        int n = sc.nextInt();

        sc.close();

        while (n < 1 || n > 9) {

            System.out.print("您输入的数字不在1~9之间，或者不是整数，请重新输入。");

            n = sc.nextInt();

        }

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j> 0; j--) {

                System.out.print(" ");
                
            }

            for (int j = (i + i - 1); j > 0; j--) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

}
