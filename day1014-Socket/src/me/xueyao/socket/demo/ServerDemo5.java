package me.xueyao.socket.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 使用多线程实现多个客户端上传文件
 * @author Yao Xue
 * @date Aug 4, 2017 8:52:46 PM 
 */
public class ServerDemo5 {
    public static void main(String[] args) throws Exception {
        //创建任务
        MyTask mt = new MyTask();
        //创建线程对象 
        Thread t1 = new Thread(mt);
        //启动线程
        t1.start();
    }
}

class MyTask implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                //创建服务端套接字对象
                ServerSocket ss = new ServerSocket(6666);
                //创建字符输出流缓冲区对象BufferedWriter  
                BufferedWriter bw = new BufferedWriter(new FileWriter(System.currentTimeMillis()+"copy.txt"));
                //侦听并获取客户端套接字对象
                Socket accept = ss.accept();
                //调用getInputStream获取字节输入流
                InputStream inputStream = accept.getInputStream();
                //转化为BufferedReader
                BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
                //读写数据
                String line = null;
                //br.readLine() 服务端面阻塞在这里
                while ((line = br.readLine())!=null) {
                    bw.write(line);
                    bw.newLine();
                    bw.flush();
                    
                }
                //获取输出流对象
                OutputStream os = accept.getOutputStream();
                os.write("恭喜您,上传种子成功".getBytes());
                ss.close();
                bw.close();
                accept.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
}
