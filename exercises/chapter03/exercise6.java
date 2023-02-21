/*
 * 判断成绩会否及格
 * 当分数大于等于60时，成绩及格，否则不及格。
 * 现一学生的分数是80分，使用三元运算符判断这名学生的成绩能否及格。
 */

package chapter03;

public class exercise6 {
    public static void main(String[] args) {
        double score = 80;

        if(score >= 60){
            System.out.println("成绩及格");
        }else{
            System.out.println("成绩不及格");
        }

    }
}
