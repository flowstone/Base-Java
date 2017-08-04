package me.xueyao.socket.demo;

import java.net.InetAddress;

/**
 * 1）创建测试类InetAddressDemo ，在测试类中定义一个main函数；
2）根据InetAddress调用getByName()函数获取InetAddress类的对象ia；
3）使用InetAddress类的对象ia调用 getHostAddress()函数获取指定主机的IP地址；
4）使用InetAddress类的对象ia调用getHostName()函数IP 地址的主机名；
5）输出上述获取的IP地址和主机名；
6）使用InetAddress类调用getAllByName获取InetAddress类的对象并放到数组中，遍历数组依次打印数组中的内容；

 * @author Yao Xue
 * @date Aug 4, 2017 7:15:38 PM
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ia = InetAddress.getByName("FlowStone");
        System.out.println(ia);
        String ip = ia.getHostAddress();
        System.out.println(ip);
        
        String hostName = ia.getHostName();
        System.out.println(hostName);
        
        InetAddress[] allByName = InetAddress.getAllByName("FlowStone");
        for (InetAddress i : allByName) {
            System.out.println(i);
        }
    }
}
