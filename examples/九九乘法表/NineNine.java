package 九九乘法表;


public class NineNine {
    public static void main(String[] args) {

        System.out.println();

        // 外层循环，即为九九乘法表的行数
        for (int i = 1; i < 10; i++) {

            // 内层循环，每行的列数
            // 每行的列数 = 每行的行数，例如第一行有一列，第二行有两列
            for (int j = 1; j <= i; j++){
                
                // 在内层循环中打印语句
                // 变化的数即为变量，不变的乘号和等号用字符表示，中间利用加号起连接作用,使用制表符\t使中间的空格保持一致     
                System.out.print("\t" + j + "X" + i + "=" + i*j);

            }
           
            System.out.println();
                
        }
        
    }
}
