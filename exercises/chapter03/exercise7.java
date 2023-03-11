/**
 * 话费充值
 * 向手机中充值 10 元。
 * 通话 0.2 元／分钟，通话时长已有 30 分钟；
 * 流量己使用 10 MB，流量费用为 0.3 元／MB 。
 * 计算话费余额还可以通话的时长。
 */

package chapter03;

public class Exercise7 {
    public static void main(String[] args) {
        
        double recharge = 10;  // 话费充值
        double callCost = 0.2;  // 通话费用
        double callTime = 30;  // 已通话时长
        double dataCost = 0.3;  // 流量费用
        double dataUsage = 10;  // 已消耗流量

        double balance = recharge - callCost * callTime -dataCost * dataUsage;  // 计算话费余额
        double remainingTime = balance / callCost;  // 计算话费余额可通话时长
        System.out.println("话费余额还可以通话：" + remainingTime + " 分钟");
    }
}
