package 水仙花数;

public class DaffodilNumber {
    public static void main(String[] args) {

        System.out.println("以下是所有的水仙花数：");

        int number = 100;  // 由于水仙花数是三位数，因此从 100 开始算起

        int i, j, k;  // 分别代表 number 的百位、十位、个位
        
        for (int sum; number < 1000; number++) {

            i = number / 100;

            j = (number - i * 100) / 10;

            k = number -i * 100 - j * 10;

            sum = i * i * i + j * j * j + k * k * k;

            if (sum == number) {

                System.out.println(number + " 是水仙花数！");

            }
        }
        
    }
}
