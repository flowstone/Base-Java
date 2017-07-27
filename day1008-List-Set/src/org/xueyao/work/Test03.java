package org.xueyao.work;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 往HashSet中添加字符串"zhangsan", "lisi", "wangwu", "zhangsan".
 * 使用迭代器获取HashSet中的元素
 * 1.   创建HashSet集合
    2.  使用add方法往HashSet添加元素
    3.  使用迭代器获取HashSet中的元素

 * @author Yao Xue
 * @date Jul 27, 2017 7:52:42 PM
 */
public class Test03 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("zhangsan");
        hs.add("lisi");
        hs.add("wangwu");
        boolean add = hs.add("zhangsan");
        //System.out.println(add);
        
        
        Iterator<String> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
