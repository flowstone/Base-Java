package org.xueyao.thread.demo;
/**
 * @author Yao Xue
 * @date Aug 3, 2017 1:07:03 PM
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        
        Thread t1 = new Thread(task,"小明");
        Thread t2 = new Thread(task,"小华");
        
        t1.start();
        t2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"==="+i);
        }
    }
}

class MyTask implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
       for (int i = 0; i < 10; i++) {
           System.out.println(Thread.currentThread().getName()+"==="+i);
        
       } 
    }
}