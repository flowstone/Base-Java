package me.xueyao.level2_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * a)   写一个复制文件的静态方法:copyFile(String src,String dest) 
    i.  这里的src为源文件路径,dest为目标文件路径
    ii. 定义BufferedReader br变量,初始值为null
    iii.    定义BufferedWriter bw 变量,初始值为null
    iv. 写try...catch...finally代码块
    v.  在try代码块中
        1.  创建BufferedReader的对象,绑定源文件,并把对象赋值给br
        2.  创建BufferedWriter的对象,绑定目标文件,并把对象赋值给bw
        3.  定义一个字符数组 chs,长度为1024,用于临时存储读取到的数据
        4.  定义整型变量len,用于记录读取到的有效字节个数
        5.  使用while循环,读一个字符数组,写一个字符数组,并刷新流
    vi. 在catch代码块中,打印异常信息
    vii.    在finally代码块
        1.  写一个try...catch代码块
        2.  在try代码块中: 如果bw不为null就关闭bw
        3.  在catch代码块中打印异常信息
        4.  在写一个try...catch代码块
        5.  在try代码块中,如果br不为null就关闭br
        6.  在catch代码中打印异常信息
    b)  提供main方法,在main方法中
    i.  在main方法,调用刚刚写copyFile方法,传入源文件路径和目标文件路径

 * @author Yao Xue
 * @date Jul 23, 2017 8:50:17 PM
 */
public class Test13 {
    public static void main(String[] args) {
        Test13.copyFile("content.txt", "dest.txt");
    }
    
    public static void copyFile(String src, String dest) {
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try {
            br = new BufferedReader(new FileReader(src));
            bw = new BufferedWriter(new FileWriter(dest));
            
            char[] chs = new char[1024];
            int len = 0;
            while ((len = br.read(chs))!= -1) {
                bw.write(chs, 0, len);
                bw.flush();
            }
        } catch (Exception e) {
           System.out.println("------");
           e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e2) {
                System.out.println("++++++");
                e2.printStackTrace();
            }
            
            try {
                if (br != null) {
                    br.close();
                }
            } catch (Exception e2) {
                System.out.println("=====");
                e2.printStackTrace();
            }
        }
    }
}
