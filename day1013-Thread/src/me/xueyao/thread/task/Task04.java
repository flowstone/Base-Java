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
 * @date Aug 3, 2017 8:51:31 PM
 */
public class Task04 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                private int number = 0;
                private Lock l = new ReentrantLock();
                @Override
                public void run() {
                        l.lock();
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                        number++;
                        System.out.println(Thread.currentThread().getName()+"第"+number+"通过");
                        l.unlock();
                 }
            },("小明"+i)).start();
        }
    }
}
