/**
 * 输出个人信息
 * 控制台输出如下所示的个人基本信息。
 * 
 * 个人基本信息
 * ------------------------
 * 姓名：  李四
 * 性别：  男
 * 年龄：  25
 * 身高：  1.76米
 * 体重：  65.5千克
 * 是否已婚：  false
 */

package chapter03;

public class Exercise3 {
    public static void main(String[] args) {
        
        String name = "李四";
        String sex = "男";
        String age = "25";
        double height = 1.75;
        double weight = 65.5;
        boolean married = false;

        System.out.println("个人基本信息\n");
        System.out.println("------------------");
        System.out.println("姓名： " + name);
        System.out.println("性别： " + sex);
        System.out.println("年龄： " + age);
        System.out.println("身高： " + height + "米");
        System.out.println("体重： " + weight + "千克");
        System.out.println("是否已婚：  " + married); 
    }
}
