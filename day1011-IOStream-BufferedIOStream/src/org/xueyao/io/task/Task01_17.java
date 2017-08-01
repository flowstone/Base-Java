package org.xueyao.io.task;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

/**
 * 使用集合存储10个1-50(含50)的随机偶数元素,要求数字不能重复,
 * 按指定格式输出到C盘的num.txt中,例如: 48,44,40,38,34,30,26...... 
 * @author Yao Xue
 * @date Aug 2, 2017 1:03:03 AM
 */
public class Task01_17 {
    public static void main(String[] args) throws IOException {
        HashSet<Integer> hs = new HashSet<Integer>();
        Random r = new Random();
        while (hs.size() < 10) {
            int num = r.nextInt(50)+1;
            if (num % 2 == 0) {
                hs.add(num);
            }
        }
        System.out.println(hs);
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\num.txt");
        for ( Integer i : hs) {
            //System.out.println(i);
            fos.write((i+",").getBytes());
        }
    }
}
