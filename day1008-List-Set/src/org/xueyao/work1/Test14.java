package org.xueyao.work1;

import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 * 键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.必须保证顺序.例如输入: aaaabbbcccddd,打印结果为: abcd
 * 1.   创建Scanner对象,用于键盘录入
    2.  调用Scanner的nextLine()方法,让用户输入一个字符串
    3.  创建LinkedHashSet.用于去除重复的字符串,并保证迭代顺序
    4.  将字符串串转成char[]
    5.  使用增强for循环遍历每个字符
    6.  将每个字符添加到LinkedHashSet中
    7.  使用增强for打印LinkedHashSet中的内容

 * @author Yao Xue
 * @date Jul 27, 2017 9:39:08 PM
 */
public class Test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        
        /*LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        String next = sc.nextLine().trim();
        char[] charArray = next.toCharArray();
        for (char chs : charArray) {
             String string = Character.toString(chs);
            linkedHashSet.add(string);
        }*/
        
        LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<Character>();
        String next = sc.nextLine().trim();
        char[] charArray = next.toCharArray();
        for (char chs : charArray) {
             
            linkedHashSet.add(Character.valueOf(chs));
        }
        System.out.println(linkedHashSet);
    }
}
