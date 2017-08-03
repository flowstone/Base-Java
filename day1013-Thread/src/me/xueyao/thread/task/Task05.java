package me.xueyao.thread.task;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 编写线程同步模拟应用程序:
    1. 大气环境数据为:温度,湿度,风速；
    2. 一个大气环境传感器测量环境数据需要5秒时间；
    3. 一个计算机读取传感器获得数据需要0.01秒时间；
    4. 模拟100个计算机读取大气环境传感器获取的随机温度,湿度,风速； 

 * @author Yao Xue
 * @date Aug 3, 2017 9:30:31 PM
 */
public class Task05 {
    public static void main(String[] args) {
        Weather w = new Weather();
        for (int i = 0; i < 100; i++) {
            new Thread(w).start();
        }
    }
}

class Weather implements Runnable {
    private Lock l = new ReentrantLock();
    @Override
    public void run() {
        l.lock();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Random r = new Random();
        int temperature = r.nextInt(50)+1;
        int  humidity= r.nextInt(50)+1;
        int wind = r.nextInt(50)+1;
        
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"-当前温度:"+temperature);
        System.out.println(Thread.currentThread().getName()+"-当前湿度:"+humidity);
        System.out.println(Thread.currentThread().getName()+"-当前风速:"+wind);
        l.unlock();
    }
}
