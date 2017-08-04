package me.xueyao.socket.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * * 文件上传服务端代码书写：
 * 数据源：通道 获取字节输入流   字符流缓冲区对象 BufferedReader readLine() 
 * 目的地：项目根目录，名字叫做copy.txt
 * 步骤：
 * 1）创建服务端套接字对象
 * 2）创建字符输出流缓冲区对象 BufferedWriter newLine
 * 3）侦听并获取客户端套接字对象
 * 4）调用getInputStream获取字节输入流并转化为BufferedReader
 * 5）读写数据
 * 6）关闭资源
 * @author Yao Xue
 * @date Aug 4, 2017 8:52:46 PM 
 */
public class ServerDemo3 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(6666);
        BufferedWriter bw = new BufferedWriter(new FileWriter("copy.txt"));
        Socket accept = ss.accept();
        InputStream inputStream = accept.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        while ((line = br.readLine())!=null) {
            bw.write(line);
            bw.newLine();
            bw.flush();
            
        }
        ss.close();
        bw.close();
        accept.close();
    }
}
