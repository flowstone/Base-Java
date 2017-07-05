package org.xueyao.string;

import java.util.Scanner;

/**
 * Scannner:用于获取键盘录入的数据。(基本数据类型，字符串数据)
 *          public String nextLine(); 获取键盘录入的字符串数据 
 * @author Yao Xue
 *
 */
public class ScannerDemo {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        
        //接收数据 
        System.out.println("请输入一个字符串数据：");
        String s = sc.nextLine();
        
        //输出结果 
        System.out.println("s:"+s);
    }
}
