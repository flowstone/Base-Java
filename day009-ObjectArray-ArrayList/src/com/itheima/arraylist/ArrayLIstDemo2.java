package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 获取元素
 *      public E get(int index) 返回集合中的元素
 *集合长度
 *
 *  删除长度
 *      
 *  修改元素
 *  
 *      public E set()
 * @author Yao Xue
 * @date Jul 7, 2017 10:46:01 AM
 */
public class ArrayLIstDemo2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        
        //添加元素
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        
        //获取元素
        //System.out.println("get:"+arrayList.get(0));
        //System.out.println("get:"+arrayList.get(1));
        //System.out.println("get:"+arrayList.get(02));
        
        //删除
        //System.out.println("remove:"+arrayList.remove("world"));
        
        //修改
        System.out.println("set:"+arrayList.set(2, "PHP"));
        
        //输出
        System.out.println("array:"+arrayList);
    }
}
