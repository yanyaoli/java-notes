/**
 * 输出汇款单
 * 向张三卡号为1234567890987654321的银行卡里汇款10000元，
 * 控制台输出如下所示的汇款单：
 *
 * 中国工商银行
 *
 * ------------------
 * 日期：  2021-03-10
 * 户名：  张三
 * 账号：  1234567890987654321
 * 币种：  RMB
 * 存款金额：  10000.0
 * 存款序号：  010
 * 柜员号：  12345
 * ------------------
 */

package exercises.basic;

public class exercise2 {
    public static void main(String[] args) {

        String date = "2021-03-10";
        String name = "张三";
        String account = "1234567890987654321";
        String currency = "RMB";
        double deposit = 10000.0;
        String depositNum = "010";
        String tellerNum = "12345";

        System.out.println("中国工商银行\n");
        System.out.println("------------------");
        System.out.println("日期：  " + date);
        System.out.println("户名：  " + name);
        System.out.println("账号：  " + account);
        System.out.println("币种：  " + currency);
        System.out.println("存款金额：  " + deposit);
        System.out.println("存款序号：  " + depositNum);
        System.out.println("柜员号：  " + tellerNum);
        System.out.println("------------------");

    }
}
