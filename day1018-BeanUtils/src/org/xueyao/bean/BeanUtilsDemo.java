package org.xueyao.bean;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Yao Xue
 * @date Aug 10, 2017 9:35:07 AM
 */
public class BeanUtilsDemo {
    public static void main(String[] args) throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("beans.xml");
        Element rootElement = document.getRootElement();
        List<Element> beanElements = rootElement.elements();
        
        for (Element bean : beanElements) {
            String className = bean.attributeValue("className");
            System.out.println(className);
            
            Class<?> cls = Class.forName(className);
            Object obj = cls.newInstance();
            
            List<Element> propElements = bean.elements();
            
            for (Element prop : propElements) {
                String name = prop.attributeValue("name");
                String value = prop.attributeValue("value");
                
                BeanUtils.setProperty(obj, name, value);
            }
            System.out.println(obj);
        }
        
    }
}
