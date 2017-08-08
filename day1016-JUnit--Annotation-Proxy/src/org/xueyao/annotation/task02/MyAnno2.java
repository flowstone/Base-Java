package org.xueyao.annotation.task02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 4:41:39 PM
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnno2 {
    String type() default "java";
    
}
