/*
    题目：利用条件运算符的嵌套来完成此题：
    学习成绩 >=90 分的同学用 A 表示， 60-89 分之间的用 B 表示，60 分以下的用 C 表示。
*/

package 分数等级;

import java.util.Scanner;

public class score {

    public static void main(String[] args) {
        System.out.println("请输入分数：");
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        sc.close();
        System.out.println("分数等级为：" + getGrade(score));
    }

    private static String getGrade(double score){
        return score >=  60 ? (score >= 90 ? "A":"B"):"C";
    }
    
}
