package org.xueyao.beans.task06;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * 二、   请按XML文件中的属性定义两个类。并使用dom4j解析这个xml文件，
 * 先获取每个<bean>元素的className属性，通过反射创建对象。
 * 获取每个bean数据，使用BeanUtils工具分别填充两个Bean对象
 * @author Yao Xue
 * @date Aug 10, 2017 9:26:31 PM
 */
public class BeanUtilsDemo {
    @Test
    public void populateTest() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("beans2.xml");
        Element rootElement = document.getRootElement();
        List<Element> beanElement = rootElement.elements();
        for (Element bean: beanElement) {
            String className = bean.attributeValue("className");
            //System.out.println(className);
            Class<?> cls = Class.forName(className);
            Object obj = cls.newInstance();
            
            List<Element> propElement = bean.elements();
            for (Element  prop : propElement) {
                String name = prop.attributeValue("name");
                String value = prop.attributeValue("value");
                
                BeanUtils.setProperty(obj, name, value);
            }
            System.out.println(obj);
        }
        
        
    }
}
