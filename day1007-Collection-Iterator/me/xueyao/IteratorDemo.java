package me.xueyao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 3:25:08 PM
 */
public class IteratorDemo {
    public static void main(String[] args) {
        methoda();
    }

    private static void methoda() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("java");
        coll.add("php");
        coll.add("python");
        coll.add("android");
        //通过集合的内部 
        Iterator<String> it = coll.iterator();
        //如果有下一个元素,返回true
        while (it.hasNext()) {
            //获取下一个元素,指针往后移一位
            String next = it.next();
            System.out.println(next);
        }
        // b = it.hasNext();
        //String next = it.next();
        //System.out.println(next);
        
        //节省内存,开发中几乎不用
        for (Iterator<String> it2 = coll.iterator(); it2.hasNext();) {
            String next = it2.next();
            System.out.println(next);

        }
    }
}
