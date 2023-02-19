package exercises.basic;

/*
 * 象棋口诀
 * 先使用 char 型变量定义 “马” “象” “卒” 这3个棋子
 * 再输出 “马走日，象走田，小卒一去不复还” 的象棋口诀。
 * */

public class example01 {
    public static void main(String[] args) {

        char ma = '马';
        char xiang = '象';
        char zu = '卒';

        System.out.println(ma + "走日，" + xiang + "走田，小" + zu + "一去不复还");
    }
}