package me.xueyao.thread.demo;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 5:59:05 PM
 */
public class SellTicketsDemo {
    public static void main(String[] args) {
        SellTicketsTask stt = new SellTicketsTask();
        new Thread(stt,"窗口1").start();
        new Thread(stt,"窗口2").start();
        new Thread(stt,"窗口3").start();
        new Thread(stt,"窗口4").start();
    }
}


class SellTicketsTask implements Runnable {
    
    private int tickets = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        //模拟卖票
        while (true) {
            synchronized (obj) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"----"+tickets);
                    tickets--;
                }
            }
        }
    }
    
}