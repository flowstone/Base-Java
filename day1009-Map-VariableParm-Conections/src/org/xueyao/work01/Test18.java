package org.xueyao.work01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 键盘录入一个字符串,分别统计出其中英文字母、空格、数字和其它字符的数量,
 * 输出结果:”其他=1, 空格=2, 字母=12, 数字=6”
 * @author Yao Xue
 * @date Jul 30, 2017 3:12:23 AM
 */
public class Test18 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        
        System.out.println("请输入一个字符串");
        String line = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char[] chs = line.toCharArray();
        for (Character ch : chs) {
            countingKey(map,ch);
        }
    }
    public static void countingKey(HashMap<Character,Integer> map, Character key) {
        Integer count = map.get(key);
        if (count == null) {
            map.put(key,1);
        } else {
            map.put(key,count+1);
        }
    }
}
