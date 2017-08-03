package me.xueyao.demo;

import java.util.Properties;
import java.util.Set;

/**
 * Properties()创建一个无默认值的空属性列表
 * 添加数据:
 *  Object setProperty(String key, String value)  调用Hashtable的方法put.相当于put
 *  Set<String> stringPropertyNames() 返回此属性列表的键集   相当于Set<K> keySet()
 *  String getProperty(String key) 用指定的键在此属性列表搜索属性.相当于根据键获取值 get(key)
 * @author Yao Xue
 * @date Aug 3, 2017 10:15:28 AM
 */
public class PropertiesDemo {
    public static void main(String[] args) {
        //创建集合对象
        Properties p = new Properties();
        //添加数据
        p.setProperty("文章","姚笛");
        p.setProperty("陈冠希","张柏芝");
        p.setProperty("陶喆","马蓉");
        p.setProperty("锁哥", "柳岩");
        
        //获取所有的键
        Set<String> keys = p.stringPropertyNames();
        
        for (String key : keys) {
            //根据键获取值
            String value = p.getProperty(key);
            //输出
            System.out.println(key+"----"+value);
        }
    }
}
