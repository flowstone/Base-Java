package org.xueyao.homework;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:49:04 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        /*
         * 第四题: 分析以下需求，并用代码实现
        1.键盘录入一个整数(正数或者负数都可以,但是符号位不算有效的数字位)
        2.定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
        3.在main方法中打印该数字是几位数
        4.演示格式如下:
            (1)演示一:
                                    请输入一个整数:1234
                                    控制台输出:1234是4位数字
                                    
            (2)演示二:
                                    请输入一个整数:-34567
                                    控制台输出:-34567是5位数字
            思路                        
                        输入 15067
                                                                     结果                  计数                                        
           15067/10    1506     1
           1506/10     150      2
           150/10      15       3
           15/10       1        4
           1/10        0        5 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        int countDigit = numberDigit(number);
        System.out.println(number+"是"+countDigit+"位数字");
    }
    /**
     * @Description: TODO 计算数字是几位数字
     * @return: int
     */
    public static int  numberDigit(int number) {
         
         int count = 0;
         while (number != 0) {
             number = number / 10;
             count++;
             //System.out.println(number+"---------"+count);
        }
         return count;
         
         
    }
}
