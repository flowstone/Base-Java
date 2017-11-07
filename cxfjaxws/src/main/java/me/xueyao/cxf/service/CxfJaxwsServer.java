package me.xueyao.cxf.service;

import me.xueyao.cxf.service.impl.MobileAddressServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author XueYao
 * @date 2017-11-06
 */
public class CxfJaxwsServer {
    public static void main(String[] args) {
        //发布服务
        //1.创建工厂对象
        JaxWsServerFactoryBean serviceFactoryBean = new JaxWsServerFactoryBean();
        //2.设置属性
        //接口暴露
        serviceFactoryBean.setServiceClass(MobileAddressService.class);
        //实现
        serviceFactoryBean.setServiceBean(new MobileAddressServiceImpl());
        //地址
        serviceFactoryBean.setAddress("http://127.0.0.1:8888/mobile");
        //3.发布服务
        serviceFactoryBean.create();

        System.out.println("服务发布成功");

    }

}
