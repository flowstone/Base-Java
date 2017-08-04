package me.xueyao.socket.demo;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *  * 客户端：套接字Socket
 * 步骤：
 * 1.创建客户端套接字对象 Socket(String host, int port) 
 * 2.获取输出流，目的地通道 OutputStream getOutputStream()
 * 3.写数据
 * 4.关闭资源
 * @author Yao Xue
 * @date Aug 4, 2017 8:07:17 PM
 */
public class ClientDemo2 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("192.168.42.111",6666);
        OutputStream os = s.getOutputStream();
        os.write("今天真好,适合出去玩".getBytes());
        os.close();
    }
}
