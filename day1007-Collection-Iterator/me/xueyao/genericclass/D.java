package me.xueyao.genericclass;
/**
 * @author Yao Xue
 * @date Jul 27, 2017 12:48:17 AM
 */
public class D {
    public static void main(String[] args) {
        
    }
}

class CustomList<H> {
    //这个能存类型为指定类型本身及其子类的list对象 
    void add(CustomList<? extends H> list) {
        
    }
    
    //这个只能存指定类型的list对象 
    /*void add(CustomList<H> list) {
        
    }*/
}
