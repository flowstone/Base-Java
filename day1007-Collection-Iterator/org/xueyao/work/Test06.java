package org.xueyao.work;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 往ArrayList添加以下元素” abc”, ” itcast”, 5.练习ArrayList不加泛型和加泛型2种情况迭代出ArrayList中的元素.获取元素的长度.并说出泛型的好处
 * 1.   定义method01方法
    a)  定义没有泛型的ArrayList
    b)  添加字符串
    c)  添加Integer类型
    d)  获取迭代器
    e)  判断是否有下一个元素
    f)  获取下一个元素,并强转为String类型
    g)  获取字符串的长度
    2.  定义method02方法
    a)  定义有泛型的ArrayList
    b)  添加字符串
    c)  添加Integer类型
    d)  获取迭代器
    e)  判断是否有下一个元素
    f)  获取下一个元素,元素是String类型
    g)  获取字符串的长度
    3.  调用这2个方法

 * @author Yao Xue
 * @date Jul 26, 2017 8:04:13 PM
 */
public class Test06 {
    public static void main(String[] args) {
        method01();
        method02();
    }

    private static void method02() {
        Collection<String> coll = new ArrayList<String>();
        coll.add("陈陈");
        coll.add("芳芳");
        coll.add("露露");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println(next);
            System.out.println(next.length());
        }
    }

    private static void method01() {
        Collection coll = new ArrayList();
        coll.add("丽丽");
        coll.add("欣欣");
        Iterator it = coll.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = next.toString();
            System.out.println(string);
        }
    }
}
