package org.xueyao.beans.task03;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.beanutils.BeanUtils;

/**
1)   先定义一个Map<String,String[]>类型的集合，将以下数据填充到集合中：
    键(所有名称要跟User类的属性名一致)        值
登录名                                 “zhangsan”
登陆密码                                    “888888”
性别                                      “男”
学历                                      “本科”
爱好                                      {"读书”,”唱歌”,”旅游”}

2)  创建一个User对象；
3)  使用BeanUtils工具类将Map中的值填充到User对象中
4)  打印User对象的所有属性值。

 * @author Yao Xue
 * @date Aug 10, 2017 7:27:26 PM
 */
public class MainApp {
    public static void main(String[] args) throws Exception {
        Map<String,String[]> map = new HashMap<String,String[]>();
        map.put("username", new String[]{"zhangsan"});
        map.put("password", new String[] {"888888"});
        map.put("gender", new String[]{"男"});
        map.put("degree", new String[]{"本科"});
        map.put("hobby", new String[]{"读书","唱歌","旅游"});
        
        User user = new User();
        Iterator<Entry<String,String[]>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, String[]> next = iterator.next();
            String key = next.getKey();
            String[] value = next.getValue();
            BeanUtils.setProperty(user, key, value);
        }
        
        System.out.println(user);
    }
}
