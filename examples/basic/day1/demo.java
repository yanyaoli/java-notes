// 注释是用于解释说明程序的文字
// 注释的作用
//    1. 解释说明程序，提高程序的阅读性
//    2. 帮助调试程序


//    【单行注释】 一般用于解释说明单行程序
             // 单行注释

//    【多行注释】 一般用于解释说明多行程序
              /*
                  多行注释
                  多行注释
                  多行注释
              */

//    【文档注释】 一般是对类或者方法进行说明，被javadoc工具解析生产一个文档说明书
             /**
              * 注释文档
              * 注释文档
              */

/*
    【需求】 HelloWorld案例
    【分析】
        1. Java语言最基本的单位是类，所以我们首先定义一个类
        2. Java程序想要独立运行，必须有主方法
        3. 如果想要程序有输出，必须有输出语句
    【格式】
        1. 定义类
                class 类名 {
                        类体
                }
        2. 主方法
                public static void main(String[] args) {
                        方法体
                }
        3. 输出语句
                System.out.println("输出内容");
 */

class demo {
    // main主方法是程序的入口，JVM会自动调用main方法
    public static  void main(String[] args) {
    // 输出语句
        System.out.println("Hello World");
    }
}

/*
	【关键字】 被Java语言赋予特定含义的单词
	    【特点】 关键字都是小写的
	    【注意事项】 goto和const作为保留字存在,目前并不使用


	【标识符】
	    【组成规则】
	        1. 英文字母大小写
	        2. 数字
	        3. _ 和 $
	    【注意事项】
	        1. 不能以数字开头
	        2. 不能是Java中的关键字
	        3. 区分大小写
	            Student 和 student 是两个不同的名称
	    【常见的命名规则】见名知意
	        1. 包 （其实就是文件夹，用于解决相同类名问题）
	                · 全部小写
	                · 单级 com
	                · 多级 cn.itcast
	        2. 类或接口
	                · 一个单词 —— 首字母大写
	                            Student, Person, Teacher
	                · 多个单词 —— 每个单词的首字母大写
	                            HelloWorld, MyName, NameDome
	        3. 方法或变量
	                · 一个单词 —— 全部小写
	                            name, age, show()
	                · 多个单词 —— 从第二个单词开始，每个单词首字母大写
	                            myName, showAllStudentNames()
	        4. 常量
	                · 一个单词 —— 全部大写
	                            AGE
	                · 多个单词 —— 每个单词都大写，用_连接
	                            STUDENT_MAX_AGE
*/