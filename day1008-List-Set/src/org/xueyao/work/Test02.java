package org.xueyao.work;

import java.util.LinkedList;

/**
 * 1.   创建LinkedList
    2.  使用add方法添加元素
    3.  使用addFirst添加元素到集合最前面
    4.  使用addLast添加元素到集合最后面
    5.  使用getFirst获取集合第一个元素
    6.  使用getLast获取集合最后一个元素
    7.  使用removeLast删除集合第一个元素
    8.  使用removeLast删除集合最后一个元素

 * @author Yao Xue
 * @date Jul 27, 2017 7:42:44 PM
 */
public class Test02 {
    public static void main(String[] args) {
        LinkedList<String> ls = new LinkedList<String>();
        ls.add("赵灵儿");
        ls.add("李逍遥");
        ls.add("林月如");
        ls.add("阿奴");
        
        ls.addFirst("小青");
        ls.addLast("酒剑仙");
        
        System.out.println(ls);
        
        String first = ls.getFirst();
        System.out.println(first);
        
        String last = ls.getLast();
        System.out.println(last);
        
        ls.removeFirst();
        ls.removeLast();
        System.out.println(ls);
    }
}
