package me.xueyao08.birth;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *  1. 获取这个人的生日
        1. String - > Date(DateFormat)-> millsecond
    2. 今天-生日 
        1. 今天的毫秒值(System.current) - 生日毫秒值
        2. 转成天
 * @author Yao Xue
 * @date Jul 26, 2017 2:17:06 AM
 */
public class BirthdayDemo {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请按此格式输入你的生日:例子(1999-02-27)");
        String birthString = sc.nextLine();
        
        //String格式化成Date取出毫秒值
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(birthString);
        long birthTime = birthday.getTime();
        
        //再取出当前时间毫秒值
        long currentTime = System.currentTimeMillis();
        //今天的毫秒值-生日毫秒值
       long time =  (currentTime - birthTime)/1000/60/60/24;
       System.out.println("恭喜你,成功活了"+time+"天!");
    }
}
