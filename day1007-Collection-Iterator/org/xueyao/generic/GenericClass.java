package org.xueyao.generic;
/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:47:41 AM
 */
public class GenericClass<E> {//自定义的类中,可以写<>泛型
    //E表示未知的数据类型  调用者创建对象的时候,才能明确数据类型
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    
    
    
}
