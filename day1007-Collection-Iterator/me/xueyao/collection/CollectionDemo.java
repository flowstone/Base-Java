package me.xueyao.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 1. 数组和集合的区别
            1. 数组是定长的，既可以存放基本类型又可以存放引用类型
            2. 集合长度是可变的,只能存放引用类型
    2. collection常用方法
        1. add
            1. 添加元素，返回值boolean，成功为true
            2. list中元素可重复，故恒为true。set中元素不可重复，有可能为false
        2. clear
            1. 清空集合中的所有元素。集合容器本身不会改变,继续使用
        3. remove
            1. 移除集合中的单个实例（参数obj），移除成功返回true
        4. toArray
            1. 集合中的元素,变成数组。集合存储的数据类型不确定,返回的数组的类型是Object
        5. contains 包含某个元素，如果有返回true,区分大小写
        6. size：获取大小    
 * @author Yao Xue
 * @date Jul 26, 2017 11:12:10 PM
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //method();
        //toArray();
        //add();
        //clear();
        //remove();
        contains();
    }

    private static void contains() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("张三");
        coll.add("王五");
        boolean contains = coll.contains("IOS");
        System.out.println(contains);
        
    }

    private static void remove() {
        // TODO Auto-generated method stub
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("张三");
        coll.add("王五");
        
        boolean remove = coll.remove("张三");
        System.out.println(remove);
        System.out.println(coll);
    }

    private static void clear() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("王五");
        System.out.println(coll);
        
        //清空集合中所有元素
        coll.clear();
        System.out.println(coll);
    }

    private static void add() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        boolean add2 = coll.add("张三");
        coll.add("李四");
        boolean add = coll.add("王五");
        System.out.println(coll);
    }

    private static void toArray() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("张三");
        coll.add("王五");
        Object[] array = coll.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void method() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("张三");
        coll.add("李四");
        coll.add("张三");
        coll.add("王五");
        coll.add("ios");
        //检查是否包含这个元素,如果有返回true,有大小写之分 
        boolean contains = coll.contains("IOS");
        System.out.println(contains);
    }
}
