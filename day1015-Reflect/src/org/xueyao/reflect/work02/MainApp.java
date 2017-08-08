package org.xueyao.reflect.work02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 使用反射的方式创建一个实例、并初始化，
 * 使用反射方式调用setName方法对名称进行设置,
 * 设置之后 在通过反射方式执行getName()方法
 * @author Yao Xue
 * @date Aug 6, 2017 9:41:13 PM
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("org.xueyao.reflect.work02.Person");
        Person p = (Person) clazz.newInstance();
        /*Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
       
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        field.set(p, "小明");
        
        Method method = clazz.getMethod("getName",null);
        String str = (String) method.invoke(p, null);
        System.out.println(str);
        
    }
}
