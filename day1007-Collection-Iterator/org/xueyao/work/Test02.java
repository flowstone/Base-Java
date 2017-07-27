package org.xueyao.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 1.   hasNext()方法：用来判断集合中是否有下一个元素可以迭代。如果返回true,说明可以迭代。
    2.  next()方法：用来返回迭代的下一个元素，并把指针向后移动一位。

 * @author Yao Xue
 * @date Jul 26, 2017 7:44:53 PM
 */
public class Test02 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("丽丽");
        coll.add("欣欣");
        coll.add("小明");
        
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
        }
    }
}
