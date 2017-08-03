package me.xueyao.thread.task;

import java.util.ArrayList;
import java.util.Random;

/**
 * 请按如下要求编写多线程程序：
1.得到一个随机的整数n，创建n个子线程对象；
2.要求在子线程中把当前线程的名称作为元素添加一个集合中；
3.当n个线程的名称都添加到集合中，遍历集合打印每个线程的名称；
步骤:
    1.创建随机数n    假设n(1-10)
    2.根据n创建n个子线程对象    
    3.创建一个ArrayList集合
    4.把线程的名称添加集合中
    5.遍历集合中的数据
 * @author Yao Xue
 * @date Aug 3, 2017 8:29:22 PM
 */
public class Task03 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(10)+1;
        //System.out.println("随机数是:"+n);
        final ArrayList<String> list = new ArrayList<String>();
        while (n > 0) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    // TODO Auto-generated method stub
                    list.add(Thread.currentThread().getName());
                }
            }).start();
            n--;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
