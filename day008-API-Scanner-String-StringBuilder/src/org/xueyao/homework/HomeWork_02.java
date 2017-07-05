package org.xueyao.homework;

import java.util.Scanner;

/**
 * 第二题：分析以下需求，并用代码实现
    1.键盘录入一个大字符串,再录入一个小字符串
    2.统计小字符串在大字符串中出现的次数
    3.代码运行打印格式:
        请输入大字符串:javajava I love java l like jajavava I enjoy javajavajava
        请输入小字符串:heima
        控制台输出:小字符串heima,在大字符串woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma中共出现3次
            
 * @author Yao Xue
 * @date Jul 5, 2017 4:30:37 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大字符串");
        String bigStr = sc.nextLine();
        System.out.println("请输入小字符串");
        String smallStr = sc.nextLine();
        
        String[] chs = bigStr.split(smallStr);
        System.out.print("小字符串"+smallStr+",在大字符串"+bigStr+"中共出现"+(chs.length-1)+"次");
       
    }
}
