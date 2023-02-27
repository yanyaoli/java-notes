/*
 * 判断生肖
 * 使用 switch 多分支语句判断某一年对应的中国生肖。
 * 鼠、牛、虎、兔、龙、蛇、马、羊、猴、鸡、狗、猪
 */

package chapter04;

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份[整数]：");
        
        int year = scanner.nextInt();
        int result = year % 12;
        System.out.print(year + "年为");
        switch(result){
            //公元年号除以12余数是4的年份为鼠年，后面的年份以此类推
            case 0: 
                System.out.println("猴年");
                break;
            case 1: 
                System.out.println("鸡年");
                break;
            case 2: 
                System.out.println("狗年");
                break;
            case 3: 
                System.out.println("猪年");
                break;
            case 4: 
                System.out.println("鼠年");
                break;
            case 5: 
                System.out.println("牛年");
                break;
            case 6: 
                System.out.println("虎年");
                break;
            case 7: 
                System.out.println("兔年");
                break;
            case 8: 
                System.out.println("龙年");
                break;
            case 9: 
                System.out.println("蛇年");
                break;
            case 10: 
                System.out.println("马年");
                break;
            case 11: 
                System.out.println("羊年");
                break;
            default:
                System.out.println("输入的年份有误，请重新输入！");
        }
        scanner.close();
    }
}
