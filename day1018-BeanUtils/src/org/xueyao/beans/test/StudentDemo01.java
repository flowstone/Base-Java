package org.xueyao.beans.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author Yao Xue
 * @date Aug 10, 2017 6:32:22 PM
 */
public class StudentDemo01 {
    public static void main(String[] args) throws Exception {
        //创建一个集合,存储Student类型的对象
        ArrayList<Student> list = new ArrayList<Student>();
        //解析xml
        
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("student.xml");
        Element rootElement = document.getRootElement();
        
        List<Element> stuElements = rootElement.elements();
        for (Element stu : stuElements) {
            //获取stuNo的属性值
            String stuNo = stu.attributeValue("stuNo");
            System.out.println(stuNo);
            //创建一个学生对象,并为学生对象的stuNo的属性赋值
            Student s = new Student();
            s.setStuNo(stuNo);
            //再获取stu 标签下的所有子标签
            List<Element> elements = stu.elements();
            for (Element element : elements) {
                String name = element.getName(); //获取标签名
                //String value = element.getStringValue();
                String value = element.getText(); //获取标签中文本信息
                //System.out.println(value);
                System.out.println("\t"+name+"="+value);
                //将name和value赋值给创建的学生对象
                BeanUtils.setProperty(s, name, value);
            }
            //将创建 的student对象添加到集合中
            list.add(s);
        }
        
        //遍历查看集合
        for (Student stu : list) {
            System.out.println(stu);
        }
    }
}
