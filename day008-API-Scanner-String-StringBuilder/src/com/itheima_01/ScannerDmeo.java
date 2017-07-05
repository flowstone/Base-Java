package com.itheima_01;

import java.util.Scanner;

/**
 * Scannner：用于获取键盘录入的数据 。基本数据类型，字符串数据
 * @author Yao Xue
 * @date Jul 5, 2017 10:33:48 AM
 */
public class ScannerDmeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入一个字符串数据：");
        String s = sc.nextLine();
        
        System.out.println("s:"+s);
    }
}
