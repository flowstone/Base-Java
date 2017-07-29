package me.xueyao.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Yao Xue
 * @date Jul 29, 2017 5:40:27 PM
 */
public class CollectionsDemo {
   public static void main(String[] args) {
       sort();
   }
    private static  void sort() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("a");
        list.add("c");
        list.add("b");
        list.add("z");
        list.add("w");
        
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
