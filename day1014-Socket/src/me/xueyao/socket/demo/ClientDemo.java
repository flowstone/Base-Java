package me.xueyao.socket.demo;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 5:40:57 PM
 */
public class ClientDemo {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("192.1", 6666);
    }
}
