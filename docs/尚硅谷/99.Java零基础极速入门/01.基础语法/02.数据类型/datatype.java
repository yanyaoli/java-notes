/*
 * 【数据类型】
 *  数据存储单位：
    比特（bit位）：数据运算的最小存储单位
    字节（byte）：计算机数据的最小存储单位
    转换：1 byte = 8 bit
    其他单位：1GB = 1024MB = ……
    Java 的数据类型可以确定数据范围

    基本数据类型
        1. 整数类型
            1.1 byte 8位
            1.2 short 16位
            1.3 int 32位
            1.4 long 64位
        2. 浮点类型
            2.1 float 单精度浮点数
            2.2 double 双精度浮点数
            2.3 默认情况下，小数点苏剧会被识别位精度更高的双精度double类型
            2.4 如果想要设置单精度，数据需要使用F/f结尾
        3. 字符类型
            3.1 char
            3.2 使用符号（单引号）表示文字内容
        4. 布尔类型
            4.1 boolean
            4。2 true 或 false

    数据类型的转换
        1. 注意数据类型
            不同的数据类型不能赋值转换
        2. 注意数值范围（从小到大）
            byte - short - int - long - float - double
        3. 范围大的数据无法直接转换位范围小的数据，但可以使用小括号进行强制转换

    引用数据类型
        1. 可以被引用的数据类型（存储时箭头的指向，变量指向应用数据类型）
        2. 变量如果是基本数据类型，在存储时不会有相应箭头（只有向量存储）
        3. 包括String、类、数组、接口、枚举、特殊类型值null等

 */

public class datatype {

    public static void main(String[] args) {
        
    // 整数类型
        byte bt = 10;
        short st = 10;
        int it = 10;
        long lg = 10;

    // 浮点类型
        float ft = 1.0f;
        double db = 2.0;
  

    // 字符类型
        char c = '@';

    // 布尔类型
        boolean bln = true;
        

    // 数据类型的转换
        String name = "java";
        int age = 30;

        name = "python";
        
        byte b = 10;
        short s = b;
        int i = s;
        long lon = i;
        float f = lon;
        double d = f;


    // 引用数据类型
        String str = "abc";
        // 后续详细讲解
    }
}