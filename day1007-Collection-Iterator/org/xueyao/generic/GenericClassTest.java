package org.xueyao.generic;
/**
 * @author Yao Xue
 * @date Jul 26, 2017 9:52:23 AM
 */
public class GenericClassTest {
    public static void main(String[] args) {
        //自定义的泛型类,进行测试
        GenericClass<Integer> g = new GenericClass<Integer>();
        //E传递什么类型就是什么类型
        g.setE(100);
        Integer i = g.getE();
        System.out.println(i);
        
        
        //--------------------
        GenericMethod<Double> g1 = new GenericMethod<Double>();
        g1.show(1.1);
        
        g1.function(1.2F);//传递什么类型就是什么类型
    }
}
