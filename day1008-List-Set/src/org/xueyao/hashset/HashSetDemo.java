package org.xueyao.hashset;

import java.util.HashSet;

import org.xueyao.bean.Person;

/**
 * 
 * @author Yao Xue
 * @date Jul 27, 2017 4:58:46 PM
 */
public class HashSetDemo {
    public static void main(String[] args) {
        
       // method();
        //hashcode();
        //stringhashcode();
        
        String s = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("abc");
        HashSet<String> set = new HashSet<String>();
        set.add(s);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
        
        //有没有可能字符不同,但是hashcode相同
        String s4 = "通话";
        String s5 = "重地";
        set.add(s4);
        set.add(s5);
        System.out.println(set);
        System.out.println(s4.hashCode());
        System.out.println(s5.hashCode());
        
    }

    public static void stringhashcode() {
        String s = new String("abc");
        String s2 = new String("abc");
        System.out.println(s ==s2); //false ,比较的是真的地址值
        //两个结果相等
        //String的重写了hashCode方法
        System.out.println(s.hashCode()); //96354
        System.out.println(s2.hashCode()); //96354
    }

    public static void hashcode() {
        Person p = new Person();
        System.out.println(p.hashCode());  //10进制
        //打印的是地址值转换成的hashcode,为了内存安全也不能直接暴露地址值 
        System.out.println(p);//16进制
    }

    public static void method() {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(100);
        System.out.println(set);
    }
}
