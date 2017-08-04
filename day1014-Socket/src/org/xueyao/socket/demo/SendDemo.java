package org.xueyao.socket.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 9:43:06 AM
 */
public class SendDemo {
    public static void main(String[] args) throws Exception {
        //创建套接字的对象
        DatagramSocket ds = new DatagramSocket();
        //封装数据报包
        byte[] buf = "hello,UPD,我来了".getBytes();
        //数据长度
        int length = buf.length;
        
        //发送到目标的IP地址
        InetAddress address = InetAddress.getByName("169.254.181.35");
        int port = 9999;
        DatagramPacket p = new DatagramPacket(buf, length, address, port);
        
        //发送数据
        ds.send(p);
        //释放资源
        ds.close();
    }
}
