package org.xueyao.task;

import java.util.List;
import java.util.Scanner;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
接收用户输入一个字符串，例如：”/s1”，要求程序可以通过检索<servlet-mapping>元素下的<url-pattern>元素进匹配，匹配后获取同级的<servlet-name>元素的值；通过这个值再检索<servlet>元素下的<servlet-name>元素的值进行匹配，匹配成功后，获取同级下的<url-pattern>的值，并打印<url-pattern>的值。
例如：用户输入：/s1，控制台打印：cn.itheima.servlets.MyServlet1
      用户输入：/s2，控制台打印：cn.itheima.servlets.MyServlet2
分析
    1.Scanner
    2.获得所有子元素
    
 * @author Yao Xue
 * @date Aug 8, 2017 8:04:00 PM
 */
public class MatchXML {
    @Test
    public void parseXML() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入路径");
        String inputPath = sc.nextLine().trim();
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("web.xml");
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        String url = null;
        for (Element e : elements) {
            if (inputPath.equals(e.elementText("url-pattern"))) {
                url = e.elementText("servlet-name");
                //System.out.println(url);
            }
        }
        for (Element e: elements) {
            if (e.elementText("servlet-name").equals(url)) {
                String servletClass = e.elementText("servlet-class");
                System.out.println(servletClass);
            }
        }
    }
}
