package org.xueyao.arraylist;

import java.util.ArrayList;

/**
 * 为什么会出现集合类：
 *      我们学习的是面向对象编程语言，而面向对象编程语言对事物的描述都是通过对象来体现的。
 *      为了方便对多个对象进行操作，我们就必须对多个对象进行存储，而要想对多个对象进行存储。
 *      就不能是一个基本的变量，而应该是一个容器类型的变量
 *      到目前为止，我们学习过了哪些容器类型的数据呢？ StringBuilder, 数组
 *      所以，我们目前只能选择数组了，也就是我们前面学习过的对象数组。
 *      但是，数组的长度是固定的，适应不了变化 的需求，那么， 我们该如何选择呢？
 *      这个时候，java就提供了集合类供我的使用。
 *  
 *  集合的特点：
 *      长度可变
 *      
 *  ArrayList<E>:
 *          大小可变数组的实现
 *          
 *          <E>是一种特殊的数据类型，泛型。
 *          怎么用呢？
 *              在出现E的地方我们使用引用 数据类型替换即可
 *              举例：ArrayList<String>,ArrayList<Student>
 *              
 *  构造方法：
 *          ArrayList()
 *      
 *  添加元素：
 *          public boolean add(E e); 添加元素
 *          public void add(int index, E element) 在指定的索引添加一个元素 
 * @author Yao Xue
 * @date Jul 5, 2017 10:56:11 PM
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        
        // add(E e); 添加元素
        array.add("hello");
        array.add("world");
        array.add("java");
        
        //add(int index, E element) 在指定的索引添加一个元素 
        //array.add(1, "android");
        
        System.out.println("array:"+array);
    }
}
