package org.xueyao.flowcontrol;
/*
 * 第八题:分析以下需求，并用代码实现：
    1.按照从大到小的顺序输出四位数中的个位+百位=十位+千位(3553,2332,1166,8228,3773)的数字及个数
    2.每行输出5个满足条件的数，之间用空格分隔
    3.如：9999 9988 9977 9966 9955 
 */
public class HomeWork_08 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 9999; i >= 1000; i--) {
            //分别取出个位、十位、百位、千位
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            
            if (ge + bai == shi + qian) {
                count++;
                System.out.print(i+" ");
                //一行满足5个数字换行
                if (count % 5 == 0) {                 
                    System.out.println();
                }
            }
        }
    }
}
