package org.xueyao.work;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 1.   创建Colection对象.Collection是接口.所以创建子类ArrayList对象
    2.  往集合中添加对象元素
    3.  删除元素
    4.  获取集合大小
    5.  清空集合
    6.  输出集合内容

 * @author Yao Xue
 * @date Jul 26, 2017 7:36:47 PM
 */
public class Test01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("丽丽");
        coll.add("欣欣");
        coll.add("贾笑林");
        coll.add("罗罗");
        System.out.println(coll);
        
        coll.remove("罗罗");
        System.out.println(coll);
        
        int size = coll.size();
        System.out.println("coll集合的大小为"+size);
        
        coll.clear();
        System.out.println(coll);
    }
}
