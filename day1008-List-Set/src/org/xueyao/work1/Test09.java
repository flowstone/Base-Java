package org.xueyao.work1;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 1已知数组存放一批QQ号码.QQ号码最长为11位,最短为5位
String[] strs = {"12345","67891",1"2347809933","98765432102","67891","12347809933"}
将该数组里面的所有qq号都存放在LinkedList中,将list中重复元素删除,将list中所有元素用两种方式打印出来
1.  定义QQ号码数组String[] strs
2.  创建LinkedList
3.  遍历strs获取每个qq号码
4.  判断LinkedList是否已经存在这个qq号码
5.  不存在这个qq号码则添加到LinkedList中
6.  增强for遍历LinkedList
7.  迭代器遍历LinkedList

 * @author Yao Xue
 * @date Jul 27, 2017 8:42:08 PM
 */
public class Test09 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList<String> linkedList = new LinkedList<String>();
        for (String s : strs) {
            if (!linkedList.contains(s)) {
                linkedList.add(s);
            }
        }
        
        for (String s : linkedList) {
            System.out.println(s);
        }
        
        System.out.println("-------美丽分割线-------");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
