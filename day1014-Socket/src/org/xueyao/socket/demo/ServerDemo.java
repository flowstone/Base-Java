package org.xueyao.socket.demo;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 10:28:07 AM
 */
public class ServerDemo {
    public static void main(String[] args) throws Exception {
        //创建服务端套接字
        ServerSocket serverSocket = new ServerSocket(10000);
        //侦听并获取客户端套接字
        Socket socket = serverSocket.accept();
        //获取输入流,数据源是通道
        InputStream is = socket.getInputStream();
        //获取客户端IP
        String ip = socket.getInetAddress().getHostAddress();
        System.out.println("["+ip+"]");
        //读取数据
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = is.read())!= -1) {
            //输出数据
            System.out.println(new String(buf, 0, len));
        }
        //关闭资源
        socket.close();
        serverSocket.close();
    }
}
