/**
 * 象棋口诀
 * 先使用 char 型变量定义 “马” “象” “卒” 这3个棋子
 * 再输出 “马走日，象走田，小卒一去不复还” 的象棋口诀。
 */

package exercises.basic;

public class example01 {
    public static void main(String[] args) {

        char horse = '马';
        char elephant = '象';
        char soldier = '卒';

        System.out.println(horse + "走日，" + elephant + "走田，小" + soldier + "一去不复还");
    }
}