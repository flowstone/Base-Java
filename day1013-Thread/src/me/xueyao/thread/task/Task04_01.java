package me.xueyao.thread.task;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
2.随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名；
步骤:
    1.锁,休眠5秒
    2,创建10个子线程
 * @author Yao Xue
 * @date Aug 3, 2017 9:09:41 PM
 */
public class Task04_01 {
    public static void main(String[] args) {
        Climb c = new Climb();
        for (int i = 0; i < 10; i++) {
            new Thread(c,("小明"+(i+1))).start();
        }
    }
}

class Climb implements Runnable {
    private int number = 0;
    private Lock l = new ReentrantLock();
    @Override
    public void run() {
        
            l.lock();
            
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                number++;
                System.out.println(Thread.currentThread().getName()+"通过人数"+number);
          
            l.unlock();
        
        
    }
}
