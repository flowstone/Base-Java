package org.xueyao.beans.task05;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 三、   定义一个Demo类，包含方法demo01()，方法内创建一个Map<String,String[]>对象，并填充一个图书信息；
 * 调用MyBeanUtils类的populate()方法为Book对象的成员赋值。
 * @author Yao Xue
 * @date Aug 10, 2017 8:51:54 PM
 */
public class Demo {
    @Test
    public void demo01() throws Exception {
        Map<String,String[]> map = new HashMap<String,String[]>();
        map.put("bookName", new String[]{"美国童话"});
        map.put("author", new String[]{"小明"});
        map.put("price", new String[]{"18.8"});
        map.put("passDate", new String[]{"2012-12-12"});
        Class cls = Class.forName("org.xueyao.beans.task05.Book");
        MyBeanUtils.populate(cls, map);
    }
}
