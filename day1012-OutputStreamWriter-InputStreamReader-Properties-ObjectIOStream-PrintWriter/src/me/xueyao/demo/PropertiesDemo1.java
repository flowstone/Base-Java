package me.xueyao.demo;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 * 如何将集合Properties中的内容长久存储到持久设备?
 * 使用Properties集合类中的方法:
 * void store(OutputStream out, String comments)
 * void store(Writer writer, String comments)
 * 上述方法都是将集合内容长久存储到持久设备
 * 
 * 从持久设备加载到内存中的方法
 * void load(InputStream inStream)
 * void load(Reader reader)
 * @author Yao Xue
 * @date Aug 3, 2017 10:24:10 AM
 */
public class PropertiesDemo1 {
    public static void main(String[] args) throws Exception {
        method1();
        method2();
    }
    //读取配置文件中的数据
    private static void method2() throws Exception {
        //创建Properties集合对象
        Properties p = new Properties();
        //调用方法加载到内存中,当以下方法执行完毕以后,
        p.load(new FileReader("person.txt"));
        //获取所有的键
        Set<String> keys = p.stringPropertyNames();
        //迭代
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key+"---"+p.getProperty(key));
        }
    }

    private static void method1() throws Exception {
        //将集合Properties中的数据长久保存到硬盘上
        //创建集合对象
       Properties p = new Properties();
       //添加数据
       p.setProperty("文章","姚笛");
       p.setProperty("陈冠希","张柏芝");
       p.setProperty("陶喆","马蓉");
       p.setProperty("锁哥", "柳岩");
       
       //将数据写到硬盘上
       p.store(new FileWriter("person.txt"), "person");
    }
}
