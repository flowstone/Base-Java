package org.xueyao.homework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 第二题：分析以下需求，并用代码实现    
        1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "qwe" "swd" "wwe"
        2.使用普通for循环获取集合中索引为3的元素并打印
        3.使用迭代器遍历集合,打印所有的元素
        4.使用增强for循环遍历集合并打印所有的元素
        5.遍历集合,碰到"def"元素时,"def"直接删除该元素(建议使用Iterator中的remove()方法),并直接打印集合
        6.将集合中每个元素中的小写字母变成大写字母
        7.在上一步的基础上,将集合转换成String类型的数组,遍历打印数组

 * @author Yao Xue
 * @date Jul 6, 2017 2:55:40 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        //1.定义ArrayList集合，存入多个字符串"abc" "def"  "efg" "qwe" "swd" "wwe"
        array.add("abc");
        array.add("def");
        array.add("efg");
        array.add("qwe");
        array.add("swd");
        array.add("wwe");
        
        //2.使用普通for循环获取集合中索引为3的元素并打印
        for (int i = 0; i < array.size(); i++) {
            if (i == 3) {
                System.out.println(array.get(i));
            }
        }
        // 3.使用迭代器遍历集合,打印所有的元素
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        //.使用增强for循环遍历集合并打印所有的元素
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            System.out.println(s);
        }
        //5.遍历集合,碰到"def"元素时,"def"直接删除该元素(建议使用Iterator中的remove()方法),并直接打印集合
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            if (s.startsWith("def")) {
                array.remove(i);
            }
        }
        //6.将集合中每个元素中的小写字母变成大写字母
        for (int i = 0; i < array.size(); i++) {
            String s = array.get(i);
            array.set(i, s.toUpperCase());
        }
        //7.在上一步的基础上,将集合转换成String类型的数组,遍历打印数组
        String[] strings = new String[array.size()];
        for (int i = 0; i < array.size(); i++) {
            strings[i] = array.get(i);
            System.out.println(strings[i]);
        }
    }
}
