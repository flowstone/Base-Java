package org.xueyao.annotation.task02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1.   创建项目day16作业_Test1_8
2.  定义自定义注解@MyTest，不需要属性。但要求这个注解只能在方法上使用，并且定义注解的生命周期为”运行时”。
3.  编写类Student，随意定义一个方法，使用此注解；
4.  编写类ParseAnno，使用反射加载类及判断@MyTest注解，执行具有@MyTest注解的所有方法。

 * @author Yao Xue
 * @date Aug 7, 2017 4:58:40 PM
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {

}
