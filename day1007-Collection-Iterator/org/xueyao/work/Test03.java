package org.xueyao.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 往ArrayList添加以下元素”abc1”, ”abc2”, ”abc3”, ”abc4”.使用迭代器获取ArrayList集合中的元素
 * 1.   创建集合对象
    2.  往集合中存放元素
    3.  获取容器的迭代器
    4.  使用迭代器判断是否有下一个元素
    5.  使用迭代器对象获取集合中的元素

 * @author Yao Xue
 * @date Jul 26, 2017 7:48:20 PM
 */
public class Test03 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        
        for (Iterator<String> it = coll.iterator();it.hasNext();) {
            String next = it.next();
            System.out.println(next);
        }
    }
}
