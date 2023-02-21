/*
 * 计算商和余数
 * 应用除法运算符可以计算两个数的商，应用取余运算符可以计算两个数相除所得的余数。
 * 根据这两个运算符做一个数字转置的练习，将123的各数字顺序前后颠倒后输出。
 */

package chapter03;

public class exercise5 {
    public static void main(String[] args) {
        int num = 123;
        int n1, n2, n3;

        String newNum;
        n3 = num % 10;
        n2 = (num / 10) % 10;
        n1 = (num / 100);
        newNum = n3 + "" + n2 + "" + n1;

        System.out.println(newNum);
    }
}
