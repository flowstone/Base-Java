package org.xueyao.annotation.task02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 1)   不需要任何属性。
2)  此注解只能修饰“类”和接口(参考讲义2.6)。
3)  此注解要出现在源码和字节码中(参考讲义2.6)
4)  定义测试类：Test1，并使用此注解修饰(参考讲义2.4)

 * @author Yao Xue
 * @date Aug 7, 2017 4:28:21 PM
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.CLASS)

public @interface MyAnno1 {
}
