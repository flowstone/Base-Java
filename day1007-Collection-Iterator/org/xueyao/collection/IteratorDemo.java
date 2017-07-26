package org.xueyao.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:17:23 AM
 */
public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        
        //获得容器的迭代器对象 ,通过iterator方法
        Iterator<String> it = coll.iterator();
        
        //使用具体的迭代器对象获取集合中的元素.参阅迭代器的方法
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        /**
         * 迭代器for循环的形式的使用
         */
        /*for(Iterator<String> iterator = coll.iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
        }
          */  
    }
}
