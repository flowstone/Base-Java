package me.xueyao.test01;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:02:12 PM
 */
public class Test01_07 {
    public static void main(String[] args) {
        //创建文件对象 
        File f1 = new File("D:\\Temp\\Temp\\a.txt");
        //判断是否是一个文件
        if (f1.isFile()) {
            System.out.println(f1.getName()+"是一个文件");
        } else {
            System.out.println(f1.getName()+"是一个文件夹");
        }
        
        //创建文件对象
        File f2 = new File("D:\\Temp\\Temp");
        //判断是否是一个文件夹
        if (f2.isDirectory()) {
            System.out.println(f2.getName()+"是一个文件夹");
        } else {
            System.out.println(f2.getName()+"不是一个文件夹");
        }
    }
}
