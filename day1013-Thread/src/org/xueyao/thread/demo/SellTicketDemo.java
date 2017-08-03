package org.xueyao.thread.demo;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 1:16:14 PM
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicketTask stt = new SellTicketTask();
        new Thread(stt,"窗口1").start();
        new Thread(stt,"窗口2").start();
        new Thread(stt,"窗口3").start();
        new Thread(stt,"窗口4").start();
    }
}

class SellTicketTask implements Runnable {
    private int tickets = 100;
    private Object obj = new Object();
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            synchronized (obj) {
                if (tickets > 0) { //判断是否还有余票
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        
                    }
                    System.out.println(Thread.currentThread().getName()+"出票"+tickets);
                    tickets--;
                }
            }
        }
    }
    
}
