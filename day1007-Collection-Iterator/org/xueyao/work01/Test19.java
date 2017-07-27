package org.xueyao.work01;
/**
 * 编写一个泛型方法求两个数之和.两个数可以传入int、long、float、double类型. 
 * 提示:泛型不能使用基本数据类型,需要使用引用数据类型.
 * Integer,Long,Float,Double都是Number的子类. Number有doubleValue()方法
 * @author Yao Xue
 * @date Jul 27, 2017 11:17:57 AM
 */
public class Test19 {
    public static void main(String[] args) {
        double sum = sum(1, 5);
        System.out.println(sum);
        System.out.println(sum(1.3, 2.5));
    }
    
    public static <E extends Number> double sum(E num1, E num2) {
        
        return num1.doubleValue()+num2.doubleValue();
        
    }
}
