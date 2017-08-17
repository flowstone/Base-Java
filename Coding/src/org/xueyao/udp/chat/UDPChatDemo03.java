package org.xueyao.udp.chat;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Aug 15, 2017 9:14:07 AM
 */
public class UDPChatDemo03 {
    public static void main(String[] args) throws Exception {
        //创建一个码头
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        
        //创建一个发送任务
        String ip = "127.0.0.1";
        int port = 8888;
        SendTask sendTask = new SendTask(datagramSocket, ip, port);
        Thread sendThread = new Thread(sendTask, "发送任务");
        sendThread.start();
        
        //创建一个接收任务
        ReceiveTask receiveTask = new ReceiveTask(datagramSocket);
        Thread receiveThread = new Thread(receiveTask, "接收任务");
        receiveThread.start();
        
    }
}
//接收任务
class ReceiveTask implements Runnable {
    private DatagramSocket datagramSocket;
    
    public ReceiveTask(DatagramSocket datagramSocket) {
        this.datagramSocket = datagramSocket;
    }
    @Override
    public void run() {
        //循环接收
        byte[] buf = new byte[1024];
        while (true) {
            //接收的集装箱
            DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length);
            try {
                datagramSocket.receive(datagramPacket);
                //解析数据
                byte[] data = datagramPacket.getData();
                int len = datagramPacket.getLength();
                String str = new String(data, 0, len);
                String ip = datagramPacket.getAddress().getHostAddress();
                System.out.println(ip+":"+str);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
    
}

//发送任务
class SendTask implements Runnable {
    
    private DatagramSocket datagramSocket;
    private String ip;
    private int port;
    //构造方法初始化数据
    public SendTask (DatagramSocket datagramSocket, String ip, int port) {
        this.datagramSocket = datagramSocket;
        this.ip = ip;
        this.port = port;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        //创建发送的集装箱
        Scanner sc = new Scanner(System.in);
        String line = null;
        while ((line = sc.nextLine())!=null) {
            //约定结束条件
            if ("exit".equals(line)) {
                break;
            } 
            
            try {
                InetAddress address = InetAddress.getByName(ip);
                byte[] buf = line.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(buf,buf.length, address, port);
                datagramSocket.send(datagramPacket);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
        sc.close();
    }
   
}