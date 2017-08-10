package org.xueyao.beans;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 10, 2017 3:09:34 PM
 */
public class BeanUtilsDemo {
    @Test
    public void setPropertyTest() throws Exception {
        User user = new User();
        
        //通过BeanUtils工具，设置user对象的值 
        BeanUtils.setProperty(user, "id", "001");
        BeanUtils.setProperty(user, "username", "jack");
        BeanUtils.setProperty(user, "pwd", "123456");
        BeanUtils.setProperty(user, "age", 18);
        BeanUtils.setProperty(user, "scores", 99.5f);
        
        System.out.println(user);
        
    }
    
    @Test
    public void getPropertyTest() throws Exception {
        User user  = new User("002", "小明", "admin", 19, 100);
        
        //获取值
        String id = BeanUtils.getProperty(user, "id");
        String username = BeanUtils.getProperty(user, "username");
        String pwd = BeanUtils.getProperty(user, "pwd");
        String age = BeanUtils.getProperty(user, "age");
        String score = BeanUtils.getProperty(user, "scores");
        
        System.out.println(id+"----"+username+"----"+pwd+"----"+age+"----"+score);
    }
}
