package me.xueyao.work;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Random;

/**
 * 使用集合存储10个1-50(含50)的随机偶数元素,要求数字不能重复,
 * 按指定格式输出到C盘的num.txt中,例如: 48,44,40,38,34,30,26...... 
 * @author Yao Xue
 * @date Aug 2, 2017 10:23:22 AM
 */
public class Test02_06 {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        HashSet<Integer> hs = new HashSet<Integer>();
        //创建随机数对象
        Random r = new Random();
        //使用循环创建10个数字
        while (hs.size() < 10) {
            //随机生成一个随机数
            int num = r.nextInt(50)+1;
            //判断是否是偶数
            if (num % 2 == 0) {
                //添加到集合中
                hs.add(num);
            }
        }
        //将集合中的元素,按照指定格式拼接成字符串
        
        StringBuilder sb = new StringBuilder();
        
        for (Integer i : hs) {
            sb.append(i).append(",");
        }
        //删除最后一个逗号
        sb.deleteCharAt(sb.length()-1);
        //创建字节输出高效流指向目标对象
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Temp\\Temp\\test2\\num.txt"));
        bos.write(sb.toString().getBytes());
        bos.close();
    }
}
