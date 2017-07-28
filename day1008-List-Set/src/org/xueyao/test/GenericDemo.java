package org.xueyao.test;

import java.util.ArrayList;

/**
 *
 * 4. 泛型通配符
            0. 需求:封装一个方法,可以遍历参数为任意类型的ArrayList
            1. 注意:如果泛型指定Object，就表示集合的泛型也得是Object
            2. 通配符？表示任意类型的泛型
            3. 特殊格式
                1. <? extends Person>：表示可以传递Person及其子类
                2. <? super Person>：表示可以传递Person及其父类
                3. 为了方便,一般用作参数类型
 *

 * @author Yao Xue
 * @date Jul 28, 2017 2:01:19 PM
 */
public class GenericDemo {
    public static void main(String[] args) {
        //E变量名 = String类
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Object> list3 = new ArrayList<Object>();
        
        ArrayList<Fu> fuList = new ArrayList<Fu>();
        ArrayList<Zi> ziList = new ArrayList<Zi>();
        
        //向上转型
        fuList.add(new Zi());
        
        //为什么用使用通配符:可以传递     类型为本类及其子类的集合
        fuList.addAll(ziList);
        
        //ArrayList<Fu> 是ArrayList<? extends Fu> 子类
        //有继承关系的是元素,不是集合,用通配符就有继承关系
        ArrayList<? extends Fu> fuList2 = new ArrayList<Fu>();
        ArrayList<? extends Fu> fuList3 = new ArrayList<Zi>();
        
        ArrayList<? super Fu> fuList4 = new ArrayList<Object>();
        
        //E = ?  extends Fu(表示父类及其子类)
        //不存在一个元素  同时表示父类及其子类
        
        fuList2.add(null);
        //fuList2.add(new Fu());
        //fuList2.add(new Zi());
        
        method(list2);
        int i = 1;
        int j = i;
        int k = j;
        int m;
        int E;  //如果默认值为?(任意类型),那么调用者有可能忘记赋值,其实本意想定义成String类型,但是编辑也通过
        
    }
    
    //E = Object
    //ArrayList<?> 是ArrayList<任意类型> 的父类
    //E是变量名 = ? 值,类名(任意类的类名)
    private static void method(ArrayList<Integer> list2) {
        // TODO Auto-generated method stub
        
    }
}

class Fu {
    
}

class Zi extends Fu {
    
}
