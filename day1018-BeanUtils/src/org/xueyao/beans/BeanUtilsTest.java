package org.xueyao.beans;



import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

/**
 * @author Yao Xue
 * @date Aug 10, 2017 3:30:25 PM
 */
public class BeanUtilsTest {
    public static void main(String[] args) throws Exception {
        //功能3：封装表单数据，使用Map模拟request.getParameterMap()
        //需求： 将数据封装到JavaBean对象中
        
        User user = new User();
        BeanUtils.populate(user, Request.getParameterMap());
        System.out.println(user);
    }
}

class Request {
    //方法
    
    public static Map<String, Object> getParameterMap() {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("id", "u001");
        map.put("username", "Jack");
        map.put("pwd", "123456");
        map.put("age", 18);
        map.put("score", 99.5f);
        return map;
    }
}
