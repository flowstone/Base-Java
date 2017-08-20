package org.xueyao.exam;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 9:15:06 PM
 */
@SuppressWarnings("rawtypes")
public class Demo1 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("org.xueyao.exam.Student");
        Object obj = c.getConstructor().newInstance();
        Method m = c.getMethod("show");
        m.invoke(obj);
        
        ArrayList list = new ArrayList();
    }
}