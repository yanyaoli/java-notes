/*
 *查找素数（大于1的整数中，只能被1和这个数本身整除的数）
 * 使用 for 循环，判断1~100有多少个素数，并在控制台上输出所有素数。
 */

package chapter04;

public class exercise5 {
    public static void main(String[] args) {
        int count = 0; // 计数器，记录素数的个数
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true; // 假设i是素数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) { // 如果i能被j整除，则说明i不是素数
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) { // 如果i是素数
                count++; // 素数个数加1
                System.out.print(i + " "); // 输出素数
            }
        }
        System.out.println("\n1~100之间共有" + count + "个素数。");

        Prime();
    }

    //埃拉托色尼筛法
    private static void Prime() {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1]; // 初始化为true
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) { // 如果i是素数
                for (int j = i * i; j <= n; j += i) { // 将i的倍数都标记为非素数
                    isPrime[j] = false;
                }
            }
        }

        int count = 0; // 计数器，记录素数的个数
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) { // 如果i是素数
                count++; // 素数个数加1
                System.out.print(i + " "); // 输出素数
            }
        }
        System.out.println("\n1~100之间共有" + count + "个素数。");

        /*
         * 解释：

         *  首先，我们创建一个布尔数组isPrime，其长度为n+1，表示从0n每个数字是否为素数，初始值都为true。接着，我们使用两个for循环，第一个for循环用于将isPrime中2n的元素都初始化为true；第二个for循环用于遍历2~sqrt(n)之间的所有素数i，将i的倍数都标记为非素数。

         *  第二个for循环中，我们首先判断i是否为素数，如果是素数，则从i的平方开始，将其所有的倍数都标记为非素数。其中，j的初始值为i的平方，是因为比i小的i的倍数在之前已经被其他素数标记为非素数了。

         *  最后，我们再次遍历isPrime数组，统计素数的个数并输出所有素数。注意，isPrime[0]和isPrime[1]都不是素数，因此在输出素数之前需要跳过这两个元素。

         *  该算法的时间复杂度为O(nloglogn)，空间复杂度为O(n)。与暴力算法相比，其时间复杂度更小，性能更优。

         */
    }
}




