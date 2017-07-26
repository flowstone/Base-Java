package org.xueyao.generic;
/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:54:15 AM
 */
public class GenericMethod<E> {
    public void show(E e) {
        System.out.println(e);
    }
    
    public <T> void function(T t) { //自定义泛型的方法
        //自己写一个方法,方法中的数据类型,采用<>泛型
        //如果方法中泛型,和类上的泛型不同
        //在方法返回值前加入<>
        System.out.println(t);
        
    }
}
