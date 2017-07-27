package me.xueyao.genericclass;
/**
 * @author Yao Xue
 * @date Jul 27, 2017 12:52:05 AM
 */
public class GenericClass<H> {
    //泛型H是在创建对象的时候指定,但是static 跟对象 无关
    static <V> void show2(V v) {
        System.out.println(v);
    }
    
    //这个方法相当于参数类型为Object
    //语法:<泛型>+返回值+方法名(泛型  变量名)
    
    <W> void speak(W w) {
        System.out.println(w);
    }
    
    void show(H h) {
        System.out.println(h);
    }

}
