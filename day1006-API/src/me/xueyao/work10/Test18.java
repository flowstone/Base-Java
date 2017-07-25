package me.xueyao.work10;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 使用SimpleDateFormat类,把2016-12-18转换为2016年12月18日. 
提示: SimpleDateFormat对象的日期格式字符串可以通过applyPattern(String pattern)进行修改
要求:异常处理使用throws的方式

 * @author Yao Xue
 * @date Jul 25, 2017 9:18:58 PM
 */
public class Test18 {
    public static void main(String[] args) {
            
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        //TODO:此处有问题
        df.applyPattern("yyyy年MM月dd日");
        String format = df.format(date);
        System.out.println(format);
        
    }
}
