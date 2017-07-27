package org.xueyao.work1;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * 使用LinkedHashSet存储以下元素:"王昭君","王昭君","西施","杨玉环","貂蝉".
 * 使用迭代器和增强for循环遍历LinkedHashSet
 * 1.   创建LinkedHashSet
    2.  使用add方法添加元素到LinkedHashSet
    3.  使用迭代器获取LinkedHashSet中的元素
    4.  使用增强for获取LinkedHashSet中的元素

 * @author Yao Xue
 * @date Jul 27, 2017 8:23:30 PM
 */
public class Test06 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("王昭君");
        linkedHashSet.add("王昭君");
        linkedHashSet.add("西施");
        linkedHashSet.add("貂蝉");
        
        Iterator<String> it = linkedHashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}
