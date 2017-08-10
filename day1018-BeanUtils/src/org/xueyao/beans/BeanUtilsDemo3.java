package org.xueyao.beans;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Yao Xue
 * @date Aug 10, 2017 4:26:21 PM
 */
public class BeanUtilsDemo3 {
    public static void main(String[] args) throws Exception {
        //创建一个SAXReader解析器
        SAXReader saxReader = new SAXReader();
        //读取xml文档，获取document对象
        Document document = saxReader.read("employee.xml");
        //获取根标签
        Element rootElement = document.getRootElement();
        List<Element> beanElement = rootElement.elements();
        
        for (Element bean : beanElement) {
            String className = bean.attributeValue("className");
            //System.out.println(className);
            Class<?> cls = Class.forName(className);
            Object obj = cls.newInstance();
            
            List<Element> propElements = bean.elements();
            for (Element prop : propElements) {
                String name = prop.attributeValue("name");
                String value = prop.attributeValue("value");
                //System.out.println(name+"-----"+value);
                BeanUtils.setProperty(obj, name, value);
            }
            System.out.println(obj);
        }
    }
}
