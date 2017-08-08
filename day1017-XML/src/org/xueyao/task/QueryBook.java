package org.xueyao.task;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
1.   查询出所有id大于等于2的所有图书信息，并打印；
2.  查询出所有书名中包含Java的所有图书信息，并打印；
3.  查询出所有价格大于50元的所有图书信息，并打印；

 * @author Yao Xue
 * @date Aug 8, 2017 7:09:45 PM
 */
public class QueryBook {
    @Test
    public void queryIdBook() throws Exception {
        //获得SAXReader解析对象
        SAXReader saxReader = new SAXReader();
        //读取xml文件
        Document document = saxReader.read("book.xml");
        //获得xml的根元素
        Element rootElement = document.getRootElement();
        //通过根元素获得所有的元素
        List<Element> elements = rootElement.elements();
        for (Element bookelements : elements) {
            int id = Integer.parseInt(bookelements.attributeValue("id"));
            //System.out.println(id);
            if (id >= 2) {
                String title = bookelements.elementText("title");
                String date = bookelements.elementText("publishDate");
                String price = bookelements.elementText("price");
                System.out.println("图书名《"+title+"》，出版时间："+date+"，价格："+price);
            }
        }
    }
    @Test
    public void queryJavaBook() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read("book.xml");
        Element rootElement = read.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element book : elements) {
            boolean contains = book.elementText("title").contains("Java");
            if (contains) {
                String title = book.elementText("title");
                String date = book.elementText("publishDate");
                String price = book.elementText("price");
                
                System.out.println("图书名《"+title+"》，出版时间："+date+"，价格："+price);
            }
        }
    }
    
    @Test
    public void queryPriceBook() throws Exception {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("book.xml");
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        
        for (Element book : elements) {
            int price = Integer.parseInt(book.elementText("price"));
            if (price > 50) {
                String title = book.elementText("title");
                String date = book.elementText("publishDate");
                System.out.println("图书名《"+title+"》，出版时间："+date+"，价格："+price);

            }
        }
    }
}
