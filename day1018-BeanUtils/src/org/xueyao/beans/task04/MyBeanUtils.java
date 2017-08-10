package org.xueyao.beans.task04;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtils;

/**
 * 一、   请自定义工具类：MyBeanUtils，定义方法：
populate(Object obj,Map<String,String[])，实现功能：可以根据Map中的键值对信息，为obj的各个属性赋值。此方法要被修饰为公有、静态的。

 * @author Yao Xue
 * @date Aug 10, 2017 8:07:34 PM
 */
public class MyBeanUtils {
    public static void populate(Object obj,Map<String,String[]> map) throws Exception {
        Iterator<Entry<String,String[]>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String,String[]> next = it.next();
            BeanUtils.setProperty(obj, next.getKey(), next.getValue());
        }
    }
}
