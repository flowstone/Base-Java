package me.xueyao.socket.demo;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 4:46:19 PM
 */
public class SendDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        
        byte[] buf = "你好,小明在哪里".getBytes();
        
        DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("169.254.181.35"), 6666);
        
        ds.send(dp);
        
        ds.close();
    }
}
