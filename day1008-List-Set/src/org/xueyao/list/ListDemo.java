package org.xueyao.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 27, 2017 3:50:26 PM
 */
public class ListDemo {
    public static void main(String[] args) {
       // add();
        //set();
        sublist();
        ArrayList<String> list = new ArrayList<String>();
    }

    private static void sublist() {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        List<String> subList = list.subList(1, 3);
        System.out.println(subList);
    }

    private static void set() {
        // TODO Auto-generated method stub
List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        //该索引没有值就无法修改
        list.set(4, "e");
        System.out.println(list);
    }

    private static void add() {
        // TODO Auto-generated method stub
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        
        //list.add(1, "e");
        list.add(4, "e");
        //java.lang.IndexOutOfBoundsException 集合下标越界
        //list.add(5,"e");
        String s2 = list.get(3);
        String remove = list.remove(2);
        System.out.println(remove);
        System.out.println(s2);
        System.out.println(list);
    }
}
