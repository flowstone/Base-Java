package org.xueyao.beans.task05;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 一、   请自定义工具类：MyBeanUtils，定义方法：
populate(Class c,Map<String,String[])，实现功能：可以根据Map中的键值对信息，为c所代表的对象的各个属性赋值。此方法要被修饰为公有、静态的。

 * @author Yao Xue
 * @date Aug 10, 2017 8:38:25 PM
 */
public class MyBeanUtils {
    public static void populate(Class c, Map<String,String[]> map) throws Exception {
        Iterator<Entry<String,String[]>> it = map.entrySet().iterator();
        Object obj = c.newInstance();
        while (it.hasNext()) {
            Entry<String,String[]> next = it.next();
            String key = next.getKey();
            String[] value = next.getValue();
            BeanUtils.setProperty(obj, key, value);
        }
    }
}
