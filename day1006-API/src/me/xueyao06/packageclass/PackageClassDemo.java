package me.xueyao06.packageclass;
/**
 * 1. 基本类型对象的包装类概述
        1. 需求:比如用户的输出字符串，我们要转换成基本数据类，比如年龄int，成绩double等，方便进行运算。
        2. Java推出了8个基本类型的包装类：主要作用提供了类型之间转换的方法
        3. Byte(byte)、Short(short)、Integer(int)、Long(long)、Float(float)、Double(double)、Character(char)、Boolean(boolean)
        4. 包装类全在java.lang包中：主要是基本类型和字符串之间的转换
    2. String类型转成int类型
        1. parseInt 静态方法
        2. 构造方法和intvalue的组合
    3. 自动装箱和拆箱
        1. JDK1.5出现的新特性
        2. 自动装箱：基本数据类型自动变成对象
        3. 自动拆箱：对象自动变成基本数据类型
 * @author Yao Xue
 * @date Jul 26, 2017 1:50:08 AM
 */
public class PackageClassDemo {
    public static void main(String[] args) {
        System.out.println(Double.MAX_VALUE);
        
        method2();
        method();
        method3();
        
        int i = 1;
        String s = i+"";
        String valueOf = String.valueOf(100);
        Boolean valueOf2 = Boolean.valueOf("false");
        method4();
    }

    private static void method4() {
        Integer i1 = new Integer(200);
        Integer i2 = new Integer(200);
        System.out.println(i1 == i2); //false,引用类型比较的是地址值 
        System.out.println(i1.equals(i2)); //true,因为Integer重写了equals方法
        
        Integer i3 = 200;
        Integer i4 = 200;
        System.out.println(i3 == i4); //false,自动装箱
        System.out.println(i3.equals(i4));//true,因为Integer重写了equals方法
        
        Integer i5 = 100; //创建对象 
        Integer i6 = 100; //直接返回
        /**
         * 1.如果Integer的取值范围在Byte(-128~127)之间,会在缓冲池中查找
         * 是否存在这个对象,如果没有则创建,如果可以有则直接返回该对象地址
         * 2.如果超出byte返回,直接new
         */
        
        System.out.println(i5 == i6); //true,同一个对象 
        System.out.println(i5.equals(i6));//true,因为Integer重写了equals方法
    }

    private static void method3() {
        Integer i = 100; //基本类型转成包装类型  自动装箱
        int i2 = i + 1; //包装类型转成基本类型  自动拆箱
        System.out.println(i2);
    }

    private static void method() {
        String s = "100";
        int i = Integer.parseInt(s);
        System.out.println(i+1);
    }

    private static void method2() {
        Integer integer = new Integer("1000");
        int i = integer.intValue();
        System.out.println(i+1);
        
    }
}
