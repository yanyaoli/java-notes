 /*
    判断101-200之间有多少个素数，并输出所有素数。
 */

package 素数判断;

public class PrimeNumber {

    public static void main(String[] args) {

        int count = 0;

        System.out.print("101-200之间的素数有: \n");

        for (int i = 101; i <= 200; i++) {

            if (isPrime(i)) {

                count++;

                System.out.print(i + " ");

            }

        }

        System.out.println("\n" + "总数: " + count);
    }

    private static boolean isPrime(int i) {

        if (i == 1 || i == 2) return true;

        for (int j = 2; j <= Math.sqrt(i); j++) {  // 从2开始除

            if (i % j == 0) {  //如果能整除，则说明不是素数

                return false;

            }

        }

        return true;
        
    }
    
}
