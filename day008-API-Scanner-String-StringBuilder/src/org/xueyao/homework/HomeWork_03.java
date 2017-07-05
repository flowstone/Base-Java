package org.xueyao.homework;

import java.util.Scanner;

/**
 * 第三题: 分析以下需求,并用代码实现
    1.键盘录入一个源字符串由字符串变量scrStr接收
    2.键盘录入一个要删除的字符串由字符串变量delStr接收
    3.要求
        删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
    4.代码运行打印格式:
        请输入源字符串:java woaijava,i like jajavava i enjoy java
        请输入要删除的字符串:java
        控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  i enjoy
        
 * @author Yao Xue
 * @date Jul 5, 2017 4:31:00 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入一个源字符串");
        String scrStr = sc.nextLine();
        System.out.println("请输出要删除的字符串");
        String delStr = sc.nextLine();
        
        String[] split = scrStr.split(delStr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            //System.out.println(split[i]);
            sb.append(split[i]);
        }
        System.out.println("源字符串中总共包含:"+(split.length)+" 个 "+delStr+" 删除"+delStr+"后的字符串为:"+sb);
        

    }
}
