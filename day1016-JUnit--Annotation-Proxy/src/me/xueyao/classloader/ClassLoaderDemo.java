package me.xueyao.classloader;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 6:08:14 PM
 */
public class ClassLoaderDemo {
    @Test
    public void demo01() {
        //验证三个类加载器之间的关系:
        ClassLoader cl1 = ClassLoaderDemo.class.getClassLoader();
        System.out.println(cl1);  //sun.misc.Launcher$AppClassLoader@9cb0f4
        
        ClassLoader cl2 = cl1.getParent();
        System.out.println(cl2);  //sun.misc.Launcher$ExtClassLoader@125844f

        
        ClassLoader cl3 = cl2.getParent();
        System.out.println(cl3);  //null
    }
}
