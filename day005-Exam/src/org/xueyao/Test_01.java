package org.xueyao;

import java.util.Random;

/**
 * 获取10个随机数的累加和，具体要求如下：
        定义 int[] getArr(int n)静态方法，方法内完成：随机生成n个100~999（包含100和999）之间的奇数并存放在整数数组arr中并返回
        定义main方法，在main方法中完成：
        1．传递10作为参数调用getArr方法并获取返回值arr；
        2．计算arr中所有元素的总和；
        3．在控制台中打印总和

 * @author Yao Xue
 * @date Jul 1, 2017 6:58:33 PM
 */
public class Test_01 {
    public static void main(String[] args) {
       int n = 10;
       int[] arr = getArr(n);
       /* 测试用
       System.out.print("[");
       for (int i = 0; i < arr.length; i++) {
           if (i == arr.length-1) {
               System.out.print(arr[i]+"]");
           } else {
               System.out.print(arr[i]+", ");
           }
           
       }
       System.out.println();
       */
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       
       System.out.println("数组总和为"+sum);
    }
    /**
     * @Description: TODO 初始化数组
     * @return: int[]
     */
    public static int[] getArr(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length;) {
            int temp = r.nextInt(900)+100;
            if (temp % 2 != 0) {
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
}
