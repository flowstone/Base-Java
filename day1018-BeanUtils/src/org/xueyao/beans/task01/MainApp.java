package org.xueyao.beans.task01;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 2.   定义一个MainApp类，包含main()方法，先创建一个Cat对象，使用BeanUtils工具为这个对象的各个属性赋值。
 * @author Yao Xue
 * @date Aug 10, 2017 6:59:56 PM
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat();
        BeanUtils.setProperty(cat, "name", "加菲猫");
        BeanUtils.setProperty(cat, "age", 5);
        BeanUtils.setProperty(cat, "color", "蓝色");
        BeanUtils.setProperty(cat, "gender", "公");
        
        System.out.println(cat);
    }
}
