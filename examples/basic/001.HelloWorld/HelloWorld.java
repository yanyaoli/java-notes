// 创建文件 HelloWorld.java(文件名需与类名一致)
/*
    首先定义一个类 class类名
    在类定义后加上一对大括号 {}
    在大括号中间添加一个主(main)方法/函数 public static void main(String [] args){ }
    在主方法的大括号中间添加一行输出语句 System.out.println(“hello world”);
 */

public class HelloWorld {
    public static void main(String[] args) {    
        // 注：String args[] 与 String[] args 都可以执行，但推荐使用 String[] args，这样可以避免歧义和误读。

        System.out.println("Hello World"); // 结果为：Hello World

        /*
            +的几种作用：
            加法
            正数
            字符串连接符
         */
        System.out.println("a"); // 结果为： a

        System.out.println("a" + 1); // 结果为： a1

        System.out.println("hello" + 'a' + 1);  // 结果为：helloa1

        System.out.println('a' + 1 + "hello"); // 结果为: 98hello

        System.out.println("5+5=" + 5 + 5); // 结果为: 5+5=55

        System.out.println(5 + 5 + "=5+5"); // 结果为 10=5+5
    }
}
