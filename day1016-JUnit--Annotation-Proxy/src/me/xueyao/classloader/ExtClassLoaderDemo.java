package me.xueyao.classloader;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 5:11:33 PM
 */
public class ExtClassLoaderDemo {
    @Test
    public void test() {
        //添加项目访问规则 ->Properties->BuildPath->Library
        //->JRE System->Access rules->Edit->add->sun/**
        
        //确定扩展类加载器类型:Launcher$ExtClassLoader
        //DNSNameService.class.getClassLoader();
    }
}
