/*
 * 货车装西瓜
 * 一货车的车厢长400厘米、宽160厘米、高30厘米，
 * 现有100个直径约为23厘米的西瓜。
 * 问：这辆货车满载时能装多少个西瓜？实际能装多少个西瓜？
 */

package chapter03;

public class exercise8 {
    public static void main(String[] args) {
        
        int length = 400;
        int width = 160;
        int height = 30;
        int diameter = 23;

        int lCount = length / diameter;  // 长度可以放下的西瓜数量
        int wCount = width / diameter;  // 宽度可以放下的西瓜数量
        int hCount = height / diameter;  // 高度可以放下的西瓜数量

        System.out.println("货车满载时能装" + (lCount * wCount * hCount) + "个西瓜");
        System.out.println((lCount * wCount * hCount) > 100 ? "货车实际能装100个西瓜" : "货车实际能装" + (lCount * wCount * hCount) + "个西瓜");
    }
}
