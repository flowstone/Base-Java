package me.xueyao02.dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ##二.DateFormat类
    1. 日期转字符串
        1. 需求：对当前日期进行格式化，变成中国人的阅读习惯：2017年07月13日9点01分01秒
        2. DateFormat 是日期/时间格式化子类的抽象类，所以用子类SimpleDateFormat，看构造方法
    2. 字符串转日期
        1. 需求：用户输入的时间转换成计算机时间
    3. 小结论:
        1. Date日期转成字符串: SimpleDateFormat的父类方法format,传递Date返回String
        2. 字符串转成Date对象: SimpleDateFormat的父类方法parse,传递String返回Date
 *
 * @author Yao Xue
 * @date Jul 25, 2017 3:10:30 PM
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        method();
    }
    
    private static void method() {
        // 1. 需求：对当前日期进行格式化，变成中国人的阅读习惯：2017年07月13日9点01分01秒
        String string = "Tue Jul 25 15:18:08 CST 2017";
        //日期时间：面粉团
        Date date = new Date();
        //日期格式化：模具
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 ");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //格式化：模具往面粉团上上一套，就出来 一个面包(符合模具规范)
        String format = sdf.format(date);
        System.out.println(format);
    }
}
