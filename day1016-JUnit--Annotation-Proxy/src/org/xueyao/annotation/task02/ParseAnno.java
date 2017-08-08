package org.xueyao.annotation.task02;

import java.lang.reflect.Method;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 7:00:15 PM
 */
public class ParseAnno {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("org.xueyao.annotation.task02.Student");
        Object obj = cls.newInstance();
        Method[] methods = cls.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(obj, new Class[]{});
                
            }
        }
    }
}
