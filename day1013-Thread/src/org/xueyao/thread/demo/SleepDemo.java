package org.xueyao.thread.demo;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 1:13:19 PM
 */
public class SleepDemo {
    public static void main(String[] args) {
        SleepTask st = new SleepTask();
        new Thread(st,"兔子").start();
    }
}


class SleepTask implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"==="+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}