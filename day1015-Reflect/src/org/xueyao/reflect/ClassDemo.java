package org.xueyao.reflect;
/**
 * 演示：获取Class的三种方式
 * 方式1：类名.class
 * 方式2：对象.getClass()
 * 方式3：static Class forName(String className)根据类的名称获取类的Class对象 
 *      注意：这里的className必须是类的全名！

 * @author Yao Xue
 * @date Aug 6, 2017 9:03:08 AM
 */
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        //方式一:类名.class 
        
        Class clazz = String.class;
        //输出clazz全名,就是包名.类名   java.lang.string
        System.out.println(clazz.getName());//java.lang.String
        System.out.println(clazz.getSimpleName()); //String
        
        //方式2:对象.getClass()
        Class clazz2 = "小明".getClass();
        System.out.println(clazz2.getName());  //java.lang.String
        System.out.println(clazz2.getSimpleName());   //String
        
        //方式3:static Class forName(String className)根据类的名称获取类的Class对象 
        //注意：这里的className必须是类的全名！
        
        Class clazz3 = Class.forName("java.lang.String");
        System.out.println(clazz3.getName());   //java.lang.String
        System.out.println(clazz3.getSimpleName());   //String
        
        System.out.println(clazz == clazz2);   //true
        System.out.println(clazz == clazz3);   //true;
        System.out.println(clazz2 == clazz3);   //true;
    }
}
