package org.xueyao.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 8:58:39 AM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
         Collection<String> coll = new ArrayList<String>();
         //往集合中添加对象元素 add(Object)
         coll.add("小明");
         coll.add("小花");
         coll.add("小华");
         
         //删除
         coll.remove("小花");
         
         //判断是否包含
         System.out.println(coll.contains("小丽"));
         
         //消除
         coll.clear();
         
         //打印集合
         System.out.println(coll);
    }
}
