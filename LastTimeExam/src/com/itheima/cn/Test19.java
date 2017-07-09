package com.itheima.cn;

import java.util.Scanner;

/**
 * 三.长度11位； 
手机号码的每一位都是数字。 
根据键盘输入的一个字符串类型的手机号码，判断手机号码的合法性，要求： 
1.如果手机号码长度不合法，在控制台打印输出：长度不合法（如长度不合法就不判断后续的条件） 
2.如果手机号码中包含非数字的字符：在控制台打印输出：含非法字符 

3.如果手机号码符合标准格式：在控制台打印输出：合法号码 
 * @author Yao Xue
 * @date Jul 9, 2017 7:19:51 PM
 */
public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个手机号");
        String number = sc.nextLine();
        if (number.length() != 11) {
            System.out.println("长度不合法");
            System.exit(0);
        } else {
           boolean flag = false;
           for (int i = 0; i < number.length(); i++) {
               if (number.charAt(i) <= 48 || number.charAt(i) >= 57) {
                   flag = true;
                   break;
               }
           }
           if (flag) {
               System.out.println("含非法字符");
           } else {
               System.out.println(number);
           }
        }
        
    }
}
