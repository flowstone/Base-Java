package org.xueyao.xml;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 8, 2017 5:19:04 PM
 */
public class XMLParseDemo {
   @Test
   public void parseXML001() throws Exception {
       /**
        * SaxReader 类：
        * 作用-》读取xml文件到内存中，在内存中形成一棵`文档树`
        *      read(String fileName);
        * Document 文档树类型
        * 作用：获取根标签
        *      getRootElement();
        * Element 元素类型：
        *      作用：获取标签中的所有子标签 或 指定标签
        * 
        */
       //1.创建一个SaxReader对象
       SAXReader saxReader = new SAXReader();
       //2.使用saxReader调用read方法将xml文件读取到内存中，形成一个文档树
       Document document = saxReader.read("beans.xml");
       //3.使用document数对象获取根标签对象
       Element rootElement = document.getRootElement();
       
       //4.根据rootElement根标签获取其子标签
       List<Element> elements = rootElement.elements();
       //5.遍历元素集合
       for (Element bean  : elements) {
           //bean元素中有我们需要的属性数据，使用bean对象，调用 attributeValue(属性的名称)
           String id = bean.attributeValue("id");
           String className = bean.attributeValue("className");
           System.out.println(id+":"+className);
           
           //6使用bean标签调用 elements()方法获取其子标签
           List<Element> propElements = bean.elements();
           for (Element prop: propElements) {
               String name = prop.attributeValue("name");
               String value = prop.attributeValue("value");
               System.out.println("\t"+name+"="+value);
           }
       }
   }
   
   @Test
   public void parseXML002() throws Exception {
       //1.获取SAXReader 对象
       SAXReader saxReader = new SAXReader();
       //2.读取文件
       Document document = saxReader.read("servlet.xml");
       //3.根标签
       Element rootElement = document.getRootElement();
       //4.获取子标签
       List<Element> servletElements = rootElement.elements("servlet");
       for (Element servlet : servletElements) {
           //可以直接通过父标签获取子标签中的数据内容     方法：elementText(子标签)  
           String name = servlet.elementText("servlet-name");
           String cls = servlet.elementText("servlet-class");
           System.out.println(name+":"+cls);
           
       }
       //5.获取子标签  servlet-mapping
       List<Element> mappingElements = rootElement.elements("servlet-mapping");
       for (Element mapping : mappingElements) {
           //可以直接通过父标签获取子标签中数据内容
           String name = mapping.elementText("servlet-name");
           String url = mapping.elementText("url-pattern");
           System.out.println(name+":"+url);
       }
       
       
   }
}
