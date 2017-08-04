package me.xueyao.socket.demo;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * * 服务端：ServerSocket
 * 步骤：
 * 1.创建服务端套接字对象ServerSocket(int port)
 * 2.侦听并获取客户端套接字对象 Socket accept()
 * 3.使用客户端套接字对象调用InputStream getInputStream() 
 * 4.从通道中读取数据
 * 5.关闭资源
 * @author Yao Xue
 * @date Aug 4, 2017 8:33:58 PM
 */
public class ServerDemo2 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        Socket accept = ss.accept();
        InputStream is = accept.getInputStream();
        
        byte[] buf = new byte[1024];
        int len =  -1;
        while ((len = is.read(buf))!= -1) {
            System.out.println(new String(buf, 0, len));
        }
        ss.close();
    }
}
