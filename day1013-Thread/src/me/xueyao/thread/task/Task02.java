package me.xueyao.thread.task;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 使用3个线程模拟电影院3个窗口同时卖票的过程，总票数量为100张。
 * 在卖票的过程要考虑到线程同步的问题，不能出现多卖、少卖、重复卖票的情况。
 * @author Yao Xue
 * @date Aug 3, 2017 8:21:44 PM
 */
public class Task02 {
    public static void main(String[] args) {
        
        SellTicket st = new SellTicket();
        
        new Thread(st, "窗口1").start();
        new Thread(st, "窗口2").start();
        new Thread(st, "窗口3").start();
    }
}

class SellTicket implements Runnable {
    private int tickets = 100;
   
    private Lock l = new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            //加锁
            l.lock();
            if (tickets > 0) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"出票:"+tickets);
                tickets--;
                //释放锁
                l.unlock();
            }
        }
    }
}
