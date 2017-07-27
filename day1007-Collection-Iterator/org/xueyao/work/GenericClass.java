package org.xueyao.work;
/**
 * @author Yao Xue
 * @date Jul 26, 2017 8:16:25 PM
 */
public class GenericClass<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }
    
    public <E> void function(E e) {
        System.out.println(e);
    }
}
