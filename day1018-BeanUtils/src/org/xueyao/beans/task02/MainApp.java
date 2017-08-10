package org.xueyao.beans.task02;


import org.apache.commons.beanutils.BeanUtils;

/**
 * 2.   定义一个MainApp类，包含main()方法，先创建一个Phone对象，使用构造方法或者set方法为各属性赋值。
3.  使用BeanUtils工具获取这个对象的各个属性的值。

 * @author Yao Xue
 * @date Aug 10, 2017 7:05:45 PM
 */
public class MainApp {
    public static void main(String[] args) throws Exception{
        Phone phone = new Phone("Apple","蓝色",5999f, 6.0f);
        String brand = BeanUtils.getProperty(phone, "brand");
        String color = BeanUtils.getProperty(phone, "color");
        float price = Float.parseFloat(BeanUtils.getProperty(phone, "price"));
        float size = Float.parseFloat(BeanUtils.getProperty(phone, "size"));
        
        System.out.println("小明买了一个"+brand+"牌的手机,"+color+",价格是"+price+"元,尺寸是"+size+"英寸");
    }
}
