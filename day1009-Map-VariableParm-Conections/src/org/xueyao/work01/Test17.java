package org.xueyao.work01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 利用键盘录入，输入一个字符串,统计该字符串中各个字符的数量
如用户输入字符串:"hello world java",程序输出结果：h(1)e(1)l(3)o(2) (2)w(1)r(1)d(1)j(1)a(2)v(1)
注：输出结果不要求顺序一致

 * @author Yao Xue
 * @date Jul 30, 2017 2:43:01 AM
 */
public class Test17 {
    public static void main(String[] args) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        
        String line = sc.nextLine();
        char[] chs = line.toCharArray();
        //TODO:未除空格
        for (Character ch: chs) {
                Integer count = map.get(ch);
                if(count==null) {
                    map.put(ch,1);
                } else {
                    map.put(ch,count+1);
                } 
            
        }
        System.out.println(map);
    }
}
