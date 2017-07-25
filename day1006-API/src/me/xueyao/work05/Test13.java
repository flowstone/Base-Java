package me.xueyao.work05;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算你活了多少天
 * @author Yao Xue
 * @date Jul 25, 2017 8:20:22 PM
 */
public class Test13 {
    public static void main(String[] args) {
        String birthday = "2017-07-24";
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = null;
        try {
            parse = df.parse(birthday);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        long time = parse.getTime();
        long currentTime = System.currentTimeMillis();
        long dayTime = (currentTime - time)/1000/60/60/24;
        System.out.println("恭喜你，成功活了"+dayTime+"天");
    }
}
