package org.xueyao.homework;

import java.util.Random;

/**
 * 第五题: 分析以下需求,并用代码实现
    1.定义String getStr(char[] chs)方法
        功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
    2.定义main方法，方法内完成：
        (1)定义长度为26，元素值为26个大写英文字母的数组chs
        (2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值   
 * @author Yao Xue
 * @date Jul 5, 2017 4:32:06 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        char[] chs = new char[26];
        for (int i = 0; i < chs.length; i++) {
            chs[i] = (char) (65 + i);
        }

        String s = getStr(chs);
        System.out.println(s);
    }

    private static String getStr(char[] chs) {
        //StringBuilder sb = new StringBuilder();
        String s = "";
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(26);
            //sb.append(chs[index]);
            s += chs[index];
        }
        int number = r.nextInt(10);
        //sb.append(number);
        s += number;
        return s;
        
    }
    
    
}
