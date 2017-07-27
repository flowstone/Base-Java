package me.xueyao.generic;

import java.util.ArrayList;

/**
 *  1. 泛型是JDK1.5特性，是一种安全机制，在集合中的泛型指定的数据存储类型
        1. 开发中，一个集合一般存储相同类型的数据
            1. 如果集合不设置泛型，就可能不小心存储任意类型的数据
            2. 用object类型接收好像没问题，但是要转成String获取长度，类转换异常了
        2. 泛型特点：强制集合存储的数据类型，避免了类型的强制转换
        3. 泛型将问题由运行时期，提前到了编译时期
        4. Java的泛型是伪泛型：只存在编译时期，编译成功之后生存的运行文件class中没有泛型(类型擦除)
 * @author Yao Xue
 * @date Jul 27, 2017 12:30:53 AM
 */
public class GenericDemo {
    public static void main(String[] args) {
        method();
       // method2();
    }

    private static void method() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("柳岩");
        arrayList.add("110");
        arrayList.add(111);
        arrayList.add(false);
        
        for (Object object : arrayList) {
            //java.lang.ClassCastException
            //本意:想存的都是字符串
            if (object instanceof String) {
                String s = (String) object;
                System.out.println(s.length());
            }
        }
    }

    private static void method2() {
        ArrayList<String> array = new ArrayList<String>();
        array.add("柳岩");
        array.add("110");
    }
}
