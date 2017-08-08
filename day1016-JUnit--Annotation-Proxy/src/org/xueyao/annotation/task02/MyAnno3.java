package org.xueyao.annotation.task02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 4:49:33 PM
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface MyAnno3 {
    String type();
    int[] intArr();
    
}
