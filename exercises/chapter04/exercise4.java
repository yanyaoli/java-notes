/**
 * 无重复组合
 * 使用 for 循环
 * 在控制台输出由 4、5、6、7 能组成多少个互不相同且无重复数字的三位数？都是多少？
 */

package chapter04;

public class Exercise4 {
    public static void main(String[] args) {
        
        // 计数器
        int count = 0;

        // 利用for循环逐一跳出百、十、个位的数字，最后将其组合成三位数
        for (int i = 4; i <= 7; i++) {
            for (int j = 4; j <= 7; j++) {
                for (int k = 4; k <= 7; k++) {
                    if (i != j && i != k && j != k) {  // 筛选出不重复的
                        System.out.print(i * 100 + j * 10 + k + ", ");  // 组合成三位数输出
                        count++;
                    }
                }
            }
        }
        System.out.println("\n能组成 " + count + " 个互不相同且无重复数字的三位数");
    }
}
