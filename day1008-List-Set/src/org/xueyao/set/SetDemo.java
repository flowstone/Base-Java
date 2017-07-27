package org.xueyao.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Yao Xue
 * @date Jul 27, 2017 4:30:30 PM
 */
public class SetDemo {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        // TODO Auto-generated method stub
        Set<String> s =  new HashSet<String>();
        //treeSet是会自动会存入的元素进行排序
//        Set<String> s =  new TreeSet<String>();
        s.add("b");
        s.add("a");
        s.add("a");//相同元素不能重复添加 
        s.add("c");
        s.add("d");
        System.out.println(s);
        
        for (String string : s) {
            System.out.println(string);
        }
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
    
}
