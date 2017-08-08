package me.xueyao.classloader;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 5:09:16 PM
 */
public class BootstrapClassLoaderDemo {
    @Test
    public void demo01() {
        //确定引导类加载器类型:null
        ClassLoader cl = String.class.getClassLoader();
        System.out.println(cl);
    }
}
