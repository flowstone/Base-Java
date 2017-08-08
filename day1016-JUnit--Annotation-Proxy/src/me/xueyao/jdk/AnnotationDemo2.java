package me.xueyao.jdk;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 10:01:08 AM
 */
public class AnnotationDemo2 {
    public static void main(String[] args) {
        
    }
}

//自定义一个类,使用自定义注解


/**
 * 自定义注解:
 *  1.自定义注解的关键字为:@interface
 *  2.书写注解名称.  首字母大写
 *  3.注解只有属性,没有方法.属性格式 为: 数据类型 属性名(); 格式类似于接口中的抽象方法
 *  4.属性可以设置默认值,使用default关键字
 *  5.注解中可以定义的类型总共有12种,8种基本数据类型,,其中包含字符串,类类型,注解类型,枚举类型
 *  6.如果自定义注解中没有任何属性,那么该 注解被称为标识注解
 *  7.如果自定义注解中值只有一个属性,请将属性名称定为value.因为可以省略value=
 *  元注解:修饰注解的注解
 */

@Target(ElementType.TYPE)



@interface Description {
    String desc();
    
    String author();
    
    int age() default 18;
    
   
}
