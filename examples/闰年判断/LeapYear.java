/*
 * （1） 若某个年份能被 4 整除，但不能被 100 整除，则是闰年
 * （2） 若某个年份能被 400 整除，则也是闰年
 */

 package 闰年判断;

 //  系统包java.util 包含如处理时间的 Date 类，处理动态数组的 Vector 类，以及 Stack 和 HashTable 类
 import java.util.Scanner; 
 
 public class LeapYear {

    public static void main(String[] args) {
        
        System.out.print("请输入要查询的年份[整数]：");
 
        // 获取键盘输入
        Scanner input = new Scanner(System.in);  
 
        int year = input.nextInt();
 
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
 
            System.out.print(year + "是闰年");
 
        } else {
             
            System.out.println(year + "不是闰年");

        }
    }
}