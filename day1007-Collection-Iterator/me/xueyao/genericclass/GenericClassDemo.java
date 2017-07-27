package me.xueyao.genericclass;

import java.util.ArrayList;

/**
 * 泛型的定义和使用
        1. 泛型位置的E：element的缩写，本质上是一个变量，接收的是数据类型(类)

        2. 泛型类：创建此类对象，需要指定数据类型

        3. 泛型方法
            1. 方法的参数上的泛型 T,和类上的泛型不一样，需要单独的定义
            2. 在方法返回值前面定义
            3. 泛型T,调用方法才有类型,传递什么,就是什么

            4. 静态方法,泛型不能和类上的泛型一样（因为E是类上泛型,创建对象指定，而static属于类,跟对象无关）

            5. 作用：跟直接传参Object是一样的
        3. 泛型接口
            1. 实现类: 实现类实现接口,不实现泛型：Arraylist
            2. 实现类: 实现接口,同时指定类型，开发中很少见到

        4. 泛型通配符
            0. 需求:封装一个方法,可以遍历参数为任意类型的ArrayList
            1. 注意:如果泛型指定Object，就表示集合的泛型也得是Object
            2. 通配符？表示任意类型的泛型
            3. 特殊格式
                1. <? extends Person>：表示可以传递Person及其子类
                2. <? super Person>：表示可以传递Person及其父类
 * @author Yao Xue
 * @date Jul 27, 2017 12:57:19 AM
 */
public class GenericClassDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //String s = list.get(1);
        GenericClass<String> gc = new GenericClass<String>();
        gc.show("xueyao.org");
        
        GenericClass<Integer> gc2 = new GenericClass<Integer>();
        gc2.show(1);
        
        GenericClass<Double> gc3 = new GenericClass<Double>();
        gc3.show(2.34);
        
        //只有不指定泛型的时候,才能定义Object类型一致
        GenericClass gc4 = new GenericClass();
        gc4.show("object");
        
        GenericClass<Object> gc5 = new GenericClass<Object>();
        gc3.show(2.34);
        //泛型方法在调用的时候指定参数类型
        gc5.speak(false);
        gc5.show2(2.34);
        
        
        B<String> b = new B<String>();
        b.show("www");
    }
}
