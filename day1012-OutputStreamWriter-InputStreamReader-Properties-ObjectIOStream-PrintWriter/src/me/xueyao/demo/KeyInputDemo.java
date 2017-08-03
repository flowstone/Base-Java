package me.xueyao.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yao Xue
 * @date Aug 3, 2017 9:16:07 AM
 */
public class KeyInputDemo {
    public static void main(String[] args) throws Exception {
//        //获取键盘录入流
//        InputStream is = System.in;
//        //输出提示
//        System.out.println("请输入内容:");
//        //使用字节流对象调用方法读取输入内容
//        System.out.println((char)is.read());
//        System.out.println((char)is.read());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容");
        //模板代码
        String line = null;
        while ((line = br.readLine())!=null) {
            if ("over".equals(line)) {
                break;
            }
            //输出到控制台
            System.out.println(line);
        }
        //释放资源
        br.close();
    }
}
