package org.xueyao.work01;

import java.util.ArrayList;

/**
 * 定义一个方法add接收0个及以上的String类型数据,
 * 这个方法的作用是将传入的String类型的参数放入一个ArrayList中,并返回这个ArrayList集合
 * @author Yao Xue
 * @date Jul 30, 2017 1:52:40 AM
 */
public class Test13 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        add(list,"小明","小组","小李");
        
        for (String s : list) {
            System.out.print(s+" ");
        }
    }

    public static void add(ArrayList list, String... str) {
        for (String s : str) {
            list.add(s);
        }
    }
}
