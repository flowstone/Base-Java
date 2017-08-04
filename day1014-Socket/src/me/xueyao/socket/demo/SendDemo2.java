package me.xueyao.socket.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP协议编程的发送端：
 * 步骤：
 * 1.创建套接字对象 DatagramSocket()
 * 2.打数据报包 DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
 * 3.发送数据 void send(DatagramPacket p) 
 * 4.释放资源
 * @author Yao Xue
 * @date Aug 4, 2017 8:10:47 PM
 */
public class SendDemo2 {
    public static void main(String[] args) throws Exception {
       DatagramSocket ds = new  DatagramSocket();
       byte[] buf = "小明在哪里".getBytes();
       DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.42.111"), 6666);
       ds.send(dp);
       ds.close();
       
    }
}
