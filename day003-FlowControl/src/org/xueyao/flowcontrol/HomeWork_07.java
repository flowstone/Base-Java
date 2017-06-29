package org.xueyao.flowcontrol;
/*
 * 第七题：分析以下需求，并用代码实现：
    1.打印1到100之内的整数，但数字中包含9的要跳过
    2.每行输出5个满足条件的数，之间用空格分隔
    3.如：1 2 3 4 5 
    //9 19 29 39 49 59 69 79 89 99
 */
public class HomeWork_07 {
    public static void main(String[] args) {
        //初始化计数器,用于每满5个数字换行一下
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            /*//去掉数字中尾数包含9的数字
            if (i % 10 == 9) {
                continue;
            }*/
            
            //去掉数字中尾数和开头包含9的数字
            if (i / 10 ==9 || i % 10 == 9 ) {
                continue;
            }
            
            
            System.out.print(i+" ");
            
            //每行满足5个数字，换行
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
            
        }
    }
}
