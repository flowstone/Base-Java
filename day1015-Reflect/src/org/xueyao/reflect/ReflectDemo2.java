package org.xueyao.reflect;

import java.io.File;
import java.lang.reflect.Constructor;

/**
 * 反射获得构造函数
 * @author Yao Xue
 * @date Aug 6, 2017 11:41:01 AM
 */
public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class clazz = File.class;
        
        Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }
        
        System.out.println("==========");
        
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        
        System.out.println("==========");
        
        
        Constructor constructor = clazz.getConstructor(String.class);
        System.out.println(constructor);
        
        System.out.println("==========");
        
        Constructor constructor2 = clazz.getDeclaredConstructor(String.class, File.class);
        System.out.println(constructor2);
        
        File f = (File)constructor.newInstance("D:\\Temp\\Temp\\a.txt");
        System.out.println(f.getAbsolutePath());
    }
    
    
}
