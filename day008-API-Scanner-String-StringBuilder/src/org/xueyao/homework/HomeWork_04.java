package org.xueyao.homework;

import java.util.Scanner;


/**
 * 第四题: 分析以下需求,并用代码实现
    1.键盘录入一个字符串
    2.将该字符串变成字符数组(不能使用toCharArray()方法)
    3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
    4.如果第一位和最后一位的内容不相同,则交换
    5.将字符数组中索引为偶数的元素变成'~'
    6.打印数组元素的内容
    
 * @author Yao Xue
 * @date Jul 5, 2017 4:31:23 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        //将该字符串变成字符数组(不能使用toCharArray()方法)
        char[] chs = createCharArray(str);
        
        //将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
        // A 65  Z 90  a  97   z 122
        chageLowerCase(chs);
        
       // 如果第一位和最后一位的内容不相同,则交换
        exchange(chs);
        //5.将字符数组中索引为偶数的元素变成'~'
        changeIndexValue(chs);
        //打印数组元素的内容
        printAarray(chs);
    }
    
    public static void printAarray(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i]+" ");
        }
    }

    public static void changeIndexValue(char[] chs) {
        for (int i = 1; i < chs.length; i=i+2) {
            chs[i] = '~';
        }
    }

    public static void exchange(char[] chs) {
        if (chs[0] != chs[chs.length-1]) {
            char temp = chs[chs.length-1];
            chs[chs.length-1] = chs[0];
            chs[0] = temp;
        }
    }

    public static void chageLowerCase(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            if (chs[i]>='A' && chs[i]<='Z') {
                chs[i] += 32;
            }
        }
    }

    public static char[] createCharArray(String str) {
        char[] chs = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chs[i] = str.charAt(i);
        }
        return chs;
    }
}
