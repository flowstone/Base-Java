package me.xueyao.classloader;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 5:30:11 PM
 */
public class AppClassLoaderDemo {
    @Test
    public void test() {
        //确定应用类加载器类型:Launcher$AppClassLoader
        ClassLoader classLoader = AppClassLoaderDemo.class.getClassLoader();
        System.out.println(classLoader);
    }
}
