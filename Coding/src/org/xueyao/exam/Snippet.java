package org.xueyao.exam;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Yao Xue
 * @date Aug 19, 2017 9:13:28 PM
 */

public class Snippet {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] byteArray = new byte[1024];
        int len = in.read(byteArray);
        System.out.println(new String(byteArray, 0, len));
        in.close();
        server.close();
    }
}
