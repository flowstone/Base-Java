package org.xueyao.socket.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 演示:InetAddress的基本使用
 * 封装IP对象:
 *  static InetAddress getByName(String host) 在给定主机名的情况下确定主机的IP地址
 * 获取IP和主机信息:
 *  String getHostAddress()返回IP地址字符串
 *  String getHostName()获取此IP地址的主机名
 * @author Yao Xue
 * @date Aug 4, 2017 9:13:49 AM
 */
public class InetAddressDemo {
    public static void main(String[] args) throws Exception {
        InetAddress ia = InetAddress.getByName("FlowStone");
        System.out.println(ia); //FlowStone/169.254.181.35
        InetAddress ia1 = InetAddress.getByName("169.254.181.35");
        System.out.println(ia1);//  /169.254.181.35

        //String getHostAddress()返回IP地址字符串(以文本表现形式)
        String ip = ia.getHostAddress();
        System.out.println(ip); //169.254.181.35
        
        //String getHostName()获取此IP地址的主机名
        String hostName = ia.getHostName();
        System.out.println(hostName); //FlowStone
        
        System.out.println(ip+"======"+hostName);
        System.out.println("-------------------");
    }
}
