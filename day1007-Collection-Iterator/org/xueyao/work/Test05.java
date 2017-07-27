package org.xueyao.work;

import java.util.ArrayList;

/**
 * 往ArrayList添加以下元素” itcast”, ” itcast2”, ” itcast3”, ” itcast4”使用增强for遍历ArrayList中的元素
 * 1.   创建ArrayList
    2.  往ArrayList中添加元素
    3.  使用增强for循环获取元素

 * @author Yao Xue
 * @date Jul 26, 2017 7:56:38 PM
 */
public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("HelloWorld1");
        arrayList.add("HelloWorld2");
        arrayList.add("HelloWorld3");
        arrayList.add("HelloWorld4");
        
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}
