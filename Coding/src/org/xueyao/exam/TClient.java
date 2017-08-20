package org.xueyao.exam;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 9:26:34 PM
 */
public class TClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream out = socket.getOutputStream();
        out.write("你好".getBytes());
        InputStream in= socket.getInputStream();
        byte[] byteArray = new byte[1024];
        int len = in.read(byteArray);
        System.out.println(new String(byteArray,0,len));
        socket.close();
       }
}
