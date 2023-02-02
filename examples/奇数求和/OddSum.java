package 奇数求和;

public class OddSum {

    public static void main(String[] args) {

        // 初始值为 1， 奇数递增加 2
        int number = 1;  

        int sum = 0;

        for (; number < 100; number += 2) {

            sum += number;

        }

        System.out.println("1+3+5+7+···+99= " + sum);

    }
}
