/*
 * 计算月收入
 * 小李每月的工资是4500元，每月的奖金是1000元，每月要缴纳的五险﹣金合计是500元，
 * 计算小李每月的最终收入是多少？
 */

package chapter03;

public class exercise4 {
    public static void main(String[] args) {

        int salary = 4500;
        int bonus = 1000;
        int cost = 500;
        int income = salary + bonus - cost;

        System.out.println("小李每月的工资是：  " + salary + "元");
        System.out.println("小李每月的奖金是：  " + bonus + "元");
        System.out.println("小李每月要缴纳的五险一金合计是：  " + cost + "元");

        System.out.println("小李每月的最终收入是：  " + income + "元") ;
    }
}
