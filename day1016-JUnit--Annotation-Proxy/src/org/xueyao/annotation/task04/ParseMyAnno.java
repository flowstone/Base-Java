package org.xueyao.annotation.task04;

import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 7:29:44 PM
 */
public class ParseMyAnno {
    @Test
    public void parse() throws Exception {
        Class<?> cls = Class.forName("org.xueyao.annotation.task04.Student");
        Object obj = cls.newInstance();
        
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyBefore.class)) {
                method.invoke(obj, new Object[]{});
            } 
        }
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(obj, new Object[]{});
            } 
        }
        
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyAfter.class)) {
                method.invoke(obj, new Object[]{});
            } 
        }
        
    }
}
