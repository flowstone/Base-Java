package me.xueyao.homework;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Yao Xue
 * @date Jul 25, 2017 7:41:03 PM
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        
        long time = date.getTime();
        System.out.println(time);
        
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");
        String strtime = df.format(time);
        System.out.println(strtime);
    }
}
