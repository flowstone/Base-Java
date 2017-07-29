package org.xueyao.code;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 五. Collections集合操作工具类
    1. sort:对List集合排序,升序排列

    2. shuffle:对List集合元素,随机排列,每次执行方法,效果不同
 * @author Yao Xue
 * @date Jul 29, 2017 10:18:15 PM
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        shuffle();
        sort2();
    }

    private static void sort2() {
        // TODO Auto-generated method stub
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-7);
        list.add(2);
        list.add(0);
        list.add(10);
        
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

    private static void shuffle() {
        // TODO Auto-generated method stub
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(-1);
        list.add(2);
        list.add(0);
        list.add(10);
        list.add(11);
        
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
