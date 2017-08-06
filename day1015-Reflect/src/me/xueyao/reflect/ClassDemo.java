package me.xueyao.reflect;
/**
 * @author Yao Xue
 * @date Aug 6, 2017 3:17:20 PM
 */
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        Class clazz = String.class;
        System.out.println(clazz);
        
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        
        
        Class clazz1 = "小明".getClass();
        System.out.println(clazz1.getName());
        System.out.println(clazz1.getSimpleName());
        
        
        
        Class clazz3 = Class.forName("java.lang.String");
        System.out.println(clazz3.getName());
        System.out.println(clazz3.getSimpleName());
    }
}
