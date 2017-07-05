package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * 获取元素
 *      public E get(int index):返回指定索引处的元素
 * 集合长度
 *      public int size():返回集合中元素的个数
 * 删除元素
 *      public boolean remove(Object o):删除指定元素，返回删除是否成功
 *      public E remove(int index): 删除指定索引处的元素，返回被删除的元素
 * 修改元素
 *      public E set(int index,E elemet)：修改指定索引处的元素，返回被修改的元素
 * 
 * @author Yao Xue
 * @date Jul 5, 2017 11:09:50 PM
 */
public class ArrayListCURD {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<String> array = new ArrayList<String>();
        
        array.add("hello");
        array.add("world");
        array.add("java");
        
        //public E get(int index):返回指定索引处的元素
        //System.out.println("get:"+array.get(0));
        //System.out.println("get:"+array.get(1));
        //System.out.println("get:"+array.get(2));
        
        //public int size():返回集合中元素的个数
        //System.out.println("size:"+array.size());
        
        //public boolean remove(Object o):删除指定元素，返回删除是否成功
        //System.out.println("remove:"+array.remove("world")); //true
        //System.out.println("remove:"+array.remove("world"));  //false
        
        //public E remove(int index): 删除指定索引处的元素，返回被删除的元素
        //System.out.println("remove:"+array.remove(0));
        
        //public E set(int index,E elemet)：修改指定索引处的元素，返回被修改的元素
        System.out.println("set:"+array.set(1, "android"));
        //输出
        System.out.println(array);
    }
}
