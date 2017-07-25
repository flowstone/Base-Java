package me.xueyao.work02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把你的生日字符串表示转换为对应的日期对象
 * @author Yao Xue
 * @date Jul 25, 2017 7:56:18 PM
 */
public class Test10 {
    public static void main(String[] args) {
        String birthday = "2008-08-08";
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        Date parse = null;
        try {
            parse = df.parse(birthday);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(parse);
    }
}
