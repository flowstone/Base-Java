package me.xueyao.utils;

import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import me.xueyao.dao.UserDao;
import me.xueyao.dao.impl.UserDaoImpl;

public class BeanFactory {
    
    //存放所有对象
    private static final Map<String,Object> map = new HashMap<String,Object>();
    
    static {
        SAXReader sax = new SAXReader();
        
        try {
            Document document = sax.read(BeanFactory.class.getClassLoader().getResourceAsStream("beans.xml"));
            Element root = document.getRootElement();
            //获取id属性的值 
            String id = root.attributeValue("id");
            //获取class属性的值
            String value = root.attributeValue("class");
            //根据class属性的值实例化对象
            Object obj = Class.forName(value).newInstance();
            //把对象存放到Map中
            map.put(id, obj);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * 根据id获取对象
     * @return
     */
    public static Object getBean(String id) {
        return map.get(id);
    }
}
