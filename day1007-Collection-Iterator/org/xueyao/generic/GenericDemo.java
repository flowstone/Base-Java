package org.xueyao.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:38:04 AM
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("HelloWorld");
        
        //list.add(5);//当集合明确类型后,存放类型不一致就会编译报错
        //集合已经明确具体存放的元素类型,那么在使用迭代器的时候,迭代器也同样知道具体遍历元素类型
        
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            //当使用Iterator<String>控制元素类型后,就不需要强转了.获取到的元素直接就是String
            
            System.out.println(next.length());
        }
        
    }
}
