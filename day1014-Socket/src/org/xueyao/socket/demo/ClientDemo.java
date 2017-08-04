package org.xueyao.socket.demo;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Yao Xue
 * @date Aug 4, 2017 10:24:42 AM
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        //创建客户端套接字对象
        Socket s = new Socket("169.254.181.35",10000);
        
        //获取输出流,关联通道
        OutputStream os = s.getOutputStream();
        //写数据
        os.write("hello,TCP,我来了".getBytes());
        //释放资源
        s.close();
    }
}
