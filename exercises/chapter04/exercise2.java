/**
 * 输出菱形
 * 编写Java程序
 * 使用for循环打印菱形
 */

package chapter04;

public class Exercise2 {
    public static void main(String[] args){

		// 菱形上半部分
		for(int i=1; i<=10; i++)
		{
			// 上半部分空格循环
			for(int j=10; j>=i; j--)
			{
				System.out.print(" ");
			}
			// 上半部分菱形循环
			for(int k=1; k<i*2; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			}
				
		// 菱形下半部分
		for(int l=1; l<10; l++)
		{
			// 下半部分空格循环
			for(int m=0; m<=l; m++)
			{
				System.out.print(" ");
			}
			// 下半部分菱形循环
			for(int n=19; n>l*2; n--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

		otherMethod(args);
	}

	// 其他方法
	private static void  otherMethod(String[] agrs){

        // 正三角
        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= 9 - i; k++) {  // 根据每行空格数与行数的关系输出空格数
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {  // 根据行数与每行*的个数关系输出*的个数
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // 倒三角
        for (int i = 1; i <= 8; i++) {
            for (int k = 1; k <=  i; k++) {  // 根据每行空格数与行数的关系输出空格数
                System.out.print(" ");
            }
            for (int j = 1; j <= 15 + (-2 * (i - 1)); j++) {  // 根据行数与每行*的个数关系输出*的个数
                System.out.print("*");
            }
            System.out.print("\n");
        }
	}
}