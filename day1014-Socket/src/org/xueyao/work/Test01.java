package org.xueyao.work;

import java.net.InetAddress;

/**
 * 一、   创建新项目，按以下要求编写代码：
1.  使用InetAddress类获取本地计算机的IP地址和主机名
2.  使用InetAddress类获取传智播客(www.itcast.cn)主机的IP地址：

 * @author Yao Xue
 * @date Aug 6, 2017 10:01:42 AM
 */
public class Test01 {
    public static void main(String[] args) throws Exception {
        InetAddress ia = InetAddress.getLocalHost();
        String hostAddress = ia.getHostAddress();
        String hostName = ia.getHostName();
        System.out.println(hostName+"--------"+hostAddress);
        
        
        InetAddress ia2 = InetAddress.getByName("nsdual.boxuegu.com");
        String hostAddress2 = ia2.getHostAddress();
        System.out.println(hostAddress2);  //192.168.50.187
    }
}
