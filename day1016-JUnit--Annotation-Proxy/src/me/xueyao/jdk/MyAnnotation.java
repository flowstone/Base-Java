package me.xueyao.jdk;
/**
 * @author Yao Xue
 * @date Aug 7, 2017 11:00:03 AM
 */

//必须要执行元注解(Target,
public @interface MyAnnotation {
    //如果只有一个属性,请将属性定义为value
    String value();
}
