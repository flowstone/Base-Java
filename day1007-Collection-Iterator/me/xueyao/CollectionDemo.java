package me.xueyao;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Yao Xue
 * @date Jul 26, 2017 3:07:31 PM
 */
public class CollectionDemo {
    public static void main(String[] args) {
        //method();
        //clear();
        //remove();
        //toArray();
        contain();
    }

    private static void contain() {
        Collection<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("张三");
        collection.add("张三");
        //检查是否包含这个元素,区分大小写
        boolean contains = collection.contains("张二");
        System.out.println(contains);
    }

    private static void toArray() {
        Collection<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("张三");
        collection.add("张三");
        Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void remove() {
        Collection<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("张二");
        collection.add("张一");
        boolean remove = collection.remove("张三");
        System.out.println(remove);
        System.out.println(collection);
        
    }

    private static void clear() {
        Collection<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("张三");
        collection.add("张三");
        System.out.println(collection);
        collection.clear();
        collection = null; //这才是真正的置空
        System.out.println(collection);
    }

    private static void method() {
        Collection<String> collection = new ArrayList<String>();
        collection.add("张三");
        collection.add("张三");
        collection.add("张三");
        System.out.println(collection);
    }
}
