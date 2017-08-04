package me.xueyao.socket.demo;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 4:46:13 PM
 */
public class ReceiveDemo {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(6666);
        byte[] buf = new byte[1024];
    }
}
