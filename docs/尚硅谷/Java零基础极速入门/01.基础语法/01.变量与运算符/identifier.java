/*
 * 【标识符】 标识数据的符号，主要用于起名
 */

public class identifier {
    
    public static void main(String[] args) {

        // 英文拉丁字母
        String name = "Tom";

        // 汉语拼音
        String xingming = "zhangsan";

        // 符号 @ # % $
        // 标识符只能用下划线和 $ 符号，其他符号不能使用，
        // 空格也属于特殊符号，不能作为标识符使用
        String _name = "Tom";
        String $name = "Tom";
        String $na_me = "Tom";

        // 数字 （0-9）
        // 可以使用，但不能用作命名开头
        // 数字如果在标识符的开头，会被识别为数字，而不是标识符，会发生错误
        String name1 = "Tom";

        // 在大括号{}范围内，标识符命名不允许重复
        // String name = "Tom";    **name是重复的标识符**

        // 标识符区分大小写
        String NAME = "Tom"; // 与小写的name不冲突

        System.out.println(name + "\n" + xingming + "\n" + _name + "\n" + $name + "\n" + $na_me + "\n" + name1 + "\n" + NAME);

        // 关键字（保留字）：Java 中预先定义好了一些标识符名称，不允许重复定义
        // String static = "java";  

        // 驼峰命名法（规范命名）
        // 标识符长度无限制
        // 中文亦可命名，但容易出现乱码
        

    }
}
