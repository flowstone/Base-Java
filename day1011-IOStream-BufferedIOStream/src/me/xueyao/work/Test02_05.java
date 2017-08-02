package me.xueyao.work;

import java.io.FileInputStream;

/**
 * 在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中指定字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次

 * @author Yao Xue
 * @date Aug 2, 2017 10:11:09 AM
 */
public class Test02_05 {
    public static void main(String[] args) {
        calcuteCount('a');
    }

    private static void calcuteCount(char c) {
        FileInputStream fis = null;
        try {
            //定义一个变量,存储字符出现的次数
            int count = 0;
            fis = new FileInputStream("D:\\Temp\\Temp\\test2\\copy.txt");
            int len = -1;
            while ((len = fis.read())!= -1) {
                //将读取的字节转换成字符
                char ch= (char)len;
                //判断字符ch与外界传入的字符是否相同
                if (ch == c) {
                    count ++;
                }
            }
            System.out.println("字符"+c+"出现了"+count+"次");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                } 
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
