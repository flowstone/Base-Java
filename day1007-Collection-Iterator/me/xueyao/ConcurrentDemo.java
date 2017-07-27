package me.xueyao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 3:59:46 PM
 */
public class ConcurrentDemo {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        
        Collection<String> coll = new ArrayList<String>();
        coll.add("java");
        coll.add("php");
        coll.add("ios");
        coll.add("android");
        
        Iterator<String> it = coll.iterator();
        //集合长度被记录起来,不能更改
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
            if ("java".equals(next)) {
                coll.add("oracle");
            }
        }
        //遍历开始,集合长度就已经被记录起来
        for (int i = 0; i < coll.size(); i++) {
            
        }
    }
}
