package me.xueyao.genericclass;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *  4. 泛型通配符
            0. 需求:封装一个方法,可以遍历参数为任意类型的ArrayList
            1. 注意:如果泛型指定Object，就表示集合的泛型也得是Object,要看这个类包括泛型,不能只看泛型
            2. 通配符？表示任意类型的泛型
            3. 特殊格式
                1. <? extends Person>：表示可以传递Person及其子类  上限
                2. <? super Person>：表示可以传递Person及其父类     下限
 * @author Yao Xue
 * @date Jul 27, 2017 1:08:50 AM
 */
public class GenericSymbolDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("柳岩");
        list.add("柳岩2");
        list.add("柳岩3");
        list.add("柳岩4");
        
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        
        ArrayList<Object> list3 = new ArrayList<Object>();
        list3.add(false);
        list3.add(1);
        list3.add("String");
        
        /**
         * 注意:<Object>代表集合中的类型已经被指定为Object(而非其他类型,子类也不行)
         */
        method(list);
        method(list2);
        method(list3);
        
        
        //存在继承关系的是元素不是集合<泛型>本身
        ArrayList<Person> pList = new ArrayList<Person>();
        ArrayList<Student> pList2 = new ArrayList<Student>();
        
        pList.add(new Student());
        
        CustomList<Person> c1 = new CustomList<Person>();
        CustomList<Student> c12 = new CustomList<Student>();
        c1.add(c12);
    }

    //需求:封闭一个方法,可以遍历参数为任意类型的ArrayList
    private static void method(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            System.out.println(next);
        }
    }
}

class Fu {
    
}

class Person extends Fu {
    
}

class Student extends Person {
    
}
