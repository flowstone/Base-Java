package org.xueyao.socket.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 9:56:42 AM
 */
public class ReceiveDemo {
    public static void main(String[] args) throws Exception {
        
        //创建套接字对象 
        DatagramSocket ds = new DatagramSocket(9999);
        //创建空的数据报包
        byte[] buf = new byte[1024];
        //缓冲区大小
        int length = buf.length;
        DatagramPacket p = new DatagramPacket(buf,length);
        //接收数据
        ds.receive(p);
        
        //解析数据报包
        InetAddress ia = p.getAddress();
        String ip = ia.getHostAddress();
        //获取数据
        byte[] data = p.getData();
        //获取数据长度
        int length2 = p.getLength();
        //将上述字节数组变成字符串
        String str = new String(data, 0, length2);
        System.out.println(ip+"========="+str);
        //释放资源
        ds.close();
        
    }
}
