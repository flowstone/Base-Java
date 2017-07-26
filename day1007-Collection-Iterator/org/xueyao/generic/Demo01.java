package org.xueyao.generic;

import java.util.ArrayList;

/**
 * 泛型通配符?代表任意的数据类型
 * 定义：(查看ArrayList的构造方法)无法在类中使用
 * 
 * 使用：调用方法时可以给予任意类型。参照Arraylist的构造方法
 * public ArrayList(Collection<? extends E> c)
 * 为了便于?的理解,我们将以上方法重写为public ArrayList(ArrayList<? extends E> c)
 * 
 * 该方法的意思:创建集合对象A时,给于另外一个集合对象B作为参数,则创建好的集合A中包含了集合B中的元素
 * 
 * ? extends E代表只要是E类型的子类即可
 * ? super E代表只要是E类型的父类即可

 * @author Yao Xue
 * @date Jul 26, 2017 10:05:03 AM
 */
public class Demo01 {
    public static void main(String[] args) {
        //定义集合b,包含3个元素
        ArrayList<String> listB = new ArrayList<String>();
        listB.add("Jack");
        listB.add("Rose");
        listB.add("Trump");
        
        //使用集合b创建集合a
        ArrayList<Object> listA = new ArrayList<Object>(listB);
        listA.add("Obama");
        
        //观察集合A
        System.out.println(listA);
    }
}
