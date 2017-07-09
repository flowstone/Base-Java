package com.itheima.cn;

import java.util.Scanner;

/**
 *
 *键盘输入1个小于1000的正整数金额，输出金额对应的大写格式，大写数字如下： 
"零","壹","贰","叁","肆","伍","陆","柒","捌","玖" 
演示格式如下： 
请输入金额：11111       请输入金额：123      请输入金额：12          请输入金额：1 
你输入的金额不合法！                                            壹贰叁                                            壹贰                                              壹 
 * @author Yao Xue
 * @date Jul 9, 2017 5:31:17 PM
 */
public class Test14 {
    public static void main(String[] args) {
        String[] str = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖" };
        Scanner sc = new Scanner(System.in);
        System.out.println("1个小于1000的正整数金额");
        int price = sc.nextInt();
        
        if (price >=1000) {
            System.out.println("你输入的金额不合法！ ");
        } else {
            int ge = price % 10;
            int shi = price / 10 % 10;
            int bai = price / 10 / 10 % 10;
            if (bai == 0 && shi != 0) {
                System.out.println(str[shi]+str[ge]);
            }else if (bai == 0 && shi == 0) {
                System.out.println(str[ge]);
            } else {
                System.out.println(str[bai]+str[shi]+str[ge]);
            }
        }
    }
}
