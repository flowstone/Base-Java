package me.xueyao.thread.task;
/**
 * 请编写程序，分别打印主线程的名称和子线程的名称。
        要求使用两种方式实现：
            第一种方式：继承Thread类；
            第二种方法：实现Runnable接口；

 * @author Yao Xue
 * @date Aug 3, 2017 8:14:42 PM
 */
public class Task01 {
    public static void main(String[] args) {
        //new MyThread().start();
        //System.out.println(Thread.currentThread().getName());
        MyTesk mt = new MyTesk();
        new Thread(mt,"哈哈").start();
        System.out.println(Thread.currentThread().getName());
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class MyTesk implements Runnable {
    @Override
    public void run() {
        // TODO Auto-generated method stub
        System.out.println(Thread.currentThread().getName());
    }
}