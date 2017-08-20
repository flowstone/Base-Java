package org.xueyao.exam;

import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream out = socket.getOutputStream();
        out.write("Hello".getBytes());
        out.close();
        socket.close();
    }
}