package me.xueyao.cxf.server.publish;

import me.xueyao.cxf.server.domain.User;
import me.xueyao.cxf.server.service.impl.UserServiceImpl;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @author XueYao
 * @date 2017-11-06
 */
public class CxfJaxrsServer {
    public static void main(String[] args) {
        //创建工厂
        JAXRSServerFactoryBean serverFactory = new JAXRSServerFactoryBean();
        //设置属性
        //发布地址
        serverFactory.setAddress("http://127.0.0.1:8888/userService");
        //设置实现对象
        serverFactory.setServiceBean(new UserServiceImpl());
        //设置资源表述转换对象类型
        serverFactory.setResourceClasses(User.class);

        //创建并发布服务
        serverFactory.create();
        System.out.println("服务发布成功!");
    }
}
