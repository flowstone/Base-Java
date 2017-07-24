package me.xueyao.level1_11;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 2.   定义类(Test11)
3.  写一个静态方法 void write(String content),在方法中
a)  定义字符缓冲输出流变量BufferedWriter bw;初始值为null
b)  写一个try{   }catch(IOException e){  }finally{ }代码块
c)  在try{ }在代码块中    
i.  创建BufferedWriter对象,绑定content.txt文件,赋值给bw
ii. 调用bw的write()方法,传入content
d)  在catch代码块中,打印异常信息
e)  在finally代码块关闭流
i.  写try{}catch(IOException ex){} 代码块
ii. 在try 代码块中,如果bw!=null,调用bw.close()方法
iii.    在catch代码块,打印异常信息
4.  在main方法中调用write(String conent)方法

 * @author Yao Xue
 * @date Jul 23, 2017 8:25:49 PM
 */
public class Test11 {
    public static void main(String[] args) {
        Test11.write("哈哈");
    }
    
    public static void write(String content) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter("content.txt"));
            bw.write("content");
            bw.flush();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("文件不存在");

            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                // TODO Auto-generated catch block
                System.out.println("文件不存在");
                e.printStackTrace();
            }
        }
    }
}
