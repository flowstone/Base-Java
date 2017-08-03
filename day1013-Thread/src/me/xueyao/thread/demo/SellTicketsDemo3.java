package me.xueyao.thread.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Yao Xue
 * @date Aug 3, 2017 7:43:50 PM
 */
public class SellTicketsDemo3 {
    public static void main(String[] args) {
        //创建任务类对象 
        SellTicketTask3 stt3 = new SellTicketTask3();
        new Thread(stt3, "窗口1").start();
        new Thread(stt3, "窗口2").start();
        new Thread(stt3, "窗口3").start();
        new Thread(stt3, "窗口4").start();
    }
}

/**
 * 需求:使用Lock实现线程安全的卖票
 * Lock是接口,只能通过他的子类ReentrantLock创建对象
 * 构造函数ReentrantLock()创建一个ReentrantLock的实例
 * void lock()获取锁
 * void unlock()试图释放此锁
 * @author Yao Xue
 *
 */
class SellTicketTask3 implements Runnable {
    //定义100张票
    private static int tickets = 100;
    //定义一把锁
    Lock l = new ReentrantLock();
    @Override
    public void run() {
        //使用Lock锁
        while (true) {
            //获取锁
            l.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"出票:"+tickets--);
            }
            //释放锁
            l.unlock();
        }
    }
    
}
