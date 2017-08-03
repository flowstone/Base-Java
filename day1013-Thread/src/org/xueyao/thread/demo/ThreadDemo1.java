package org.xueyao.thread.demo;
/**
 * 
 * @author Yao Xue
 * @date Aug 3, 2017 12:55:31 PM
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
       MyThread mt = new MyThread();
       //mt.run();
       mt.start();
       //mt.start();
       MyThread mt2 = new MyThread();
       mt2.start();
       for (int i = 0; i < 10; i++) {
           System.out.println(i);
       }
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
