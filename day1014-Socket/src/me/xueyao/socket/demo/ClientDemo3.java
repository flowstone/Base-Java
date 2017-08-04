package me.xueyao.socket.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

/**
 * 文件上传客户端：
 * 数据源文件：bw.txt FileReader  字符流缓冲区对象 BufferedReader readLine()
 * 目的地文件：写通道中  BufferedWriter newLine() flush()
 * 步骤：
 * 1.创建字符输入流缓冲区对象关联数据源文件 new BufferedReader(new FileReader("bw.txt"));
 * 2.创建客户端套接字对象s
 * 3.调用getOutputStream获取输出流对象，向通道中写数据
 * 4.读取数据并书写数据
 * 5.关闭资源
 * @author Yao Xue
 * @date Aug 4, 2017 8:39:43 PM
 */
public class ClientDemo3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("test.txt"));
        Socket s = new Socket("127.0.0.1",6666);
        OutputStream os = s.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        String line = null;
        while ((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        s.close();
        br.close();
    }
}
