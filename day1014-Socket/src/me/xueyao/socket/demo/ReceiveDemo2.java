package me.xueyao.socket.demo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *  接收端： 注意：接收端一定要指定端口
 * 步骤：
 * 1.创建套接字对象 DatagramSocket(int port)
 * 2.创建数据报包对象DatagramPacket(byte[] buf, int length)
 * 3.接收数据报包
 * 4.解析数据报包
 *   InetAddress getAddress() 获取发送端的IP
 *   byte[] getData() 获取发送端发送过来的数据
 *   int getPort()    获取发送端的端口
 *   int getLength() 返回将要发送或接收到的数据的长度。 数据实际长度
 * 5.释放资源
 * @author Yao Xue
 * @date Aug 4, 2017 8:17:07 PM
 */
public class ReceiveDemo2 {
    public static void main(String[] args) throws Exception {
        //创建套接字对象DatagramSocket(int port)
        DatagramSocket ds = new DatagramSocket(10086);
        
        byte[] buf = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        ds.receive(dp);
        
        InetAddress ia = dp.getAddress();
        String hostName = ia.getHostName();
        int port = dp.getPort();
        int length = dp.getLength();
        byte[] data = dp.getData();
        String hostAddress = ia.getHostAddress();
        System.out.println(hostName+"--------"+hostAddress+"------"+port);
        System.out.println(new String(data,0,length));
        ds.close();
    }
}
