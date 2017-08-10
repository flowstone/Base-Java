package org.xueyao.beans.task04;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yao Xue
 * @date Aug 10, 2017 8:11:00 PM
 */
public class Demo {
    public void demo01() throws Exception {
        Map<String,String[]> map = new HashMap<String,String[]>();
        map.put("loginName", new String[]{"小明"});
        map.put("loginPassword", new String[] {"123"});
        map.put("gender", new String[]{"男"});
        map.put("degree", new String[]{"小学"});
        map.put("hobby", new String[]{"吃饭,睡觉,打豆豆"});
        
        User user = new User();
        MyBeanUtils.populate(user, map);
        System.out.println(user);
    }
}
