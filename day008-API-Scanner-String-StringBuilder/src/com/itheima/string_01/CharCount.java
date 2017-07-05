package com.itheima.string_01;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 5, 2017 3:50:06 PM
 */
public class CharCount {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        int upperCount = 0;
        int lowerCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' &&ch <= 'Z') {
                upperCount++;
            } else if(ch >= 'a' && ch <= 'z') {
                lowerCount++;
            } else if(ch >= '0' && ch<= '9') {
                numberCount++;
            }
        }
        
        System.out.println("大写字母字符出现"+upperCount+"次");
        System.out.println("小写字母字符出现"+lowerCount+"次");
        System.out.println("数字字符出现"+numberCount+"次");
        
    }
}
