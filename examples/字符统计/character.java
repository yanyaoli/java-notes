/*
    题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
    
    程序分析：
*/
package 字符统计;

import java.util.Scanner;

public class character {

    public static void main(String[] args) {

        
        System.out.println("请输入一段字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        count(str);
        ascii(str);
    }

    /*
    利用 ASCII 码确认字符的类型
    数字：48~57
    字母：(大写)65~90、(小写)97~122
    空格：32
    */
    private static void ascii(String str) {

        int num = 0; // 数字的个数
        int letter = 0; // 字母的个数
        int space = 0; // 空格的个数
        int others = 0; // 其他的个数

        char[] chars = str.toCharArray(); // 转换为字符数组
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57)
                num++;
            else if ((chars[i] >= 65 && chars[i] <= 90) || (chars[i] >= 97 && chars[i] <= 122))
                letter++;
            else if (chars[i] == 32)
                space++;
            else
                others++;
        }
        System.out.println("数字：" + num + "个，字母：" + letter + "个，空格：" + space + "个，其他：" + others + "个");
    }
        


    

    // 利用regex正则表达式
    private static void count(String str) {

        String E1 = "[\\u4e00-\\u9fa5]";// 汉字
        String E2 = "[a-zA-Z]";
        String E3 = "[0-9]";
        String E4 = "\\s";// 空格

        int Chinese = 0;   // 汉字
        int Letter = 0;    // 字母
        int Number = 0;    // 数字
        int Space = 0;     // 空格
        int Other = 0;     // 其他

        char[] array_Char = str.toCharArray();      // 将字符串转化为字符数组
        String[] array_String = new String[array_Char.length];      // 汉字只能作为字符串处理

        for (int i = 0; i < array_Char.length; i++) {
            array_String[i] = String.valueOf(array_Char[i]);
        }
            
        // 遍历字符串数组中的元素
        for (String s : array_String) {
            if (s.matches(E1))
                Chinese++;
            else if (s.matches(E2))
                Letter++;
            else if (s.matches(E3))
                Number++;
            else if (s.matches(E4))
                Space++;
            else
                Other++;
        }
        System.out.println("汉字：" + Chinese + "个， 数字：" + Number + "个，字母：" + Letter + "个，空格：" + Space + "个，其他：" + Other + "个");
    }
}
