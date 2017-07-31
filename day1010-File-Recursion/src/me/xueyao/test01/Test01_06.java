package me.xueyao.test01;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 2:55:48 PM
 */
public class Test01_06 {
    public static void main(String[] args) {
        //创建文件对象
        File f  = new File("D:\\Temp\\Temp\\a.txt");
        //获得文件名
        String filename = f.getName();
        //获得文件大小
        long filesize = f.length();
        //获得文件的绝对路径
        String path = f.getAbsolutePath();
        //获得父文件夹路径,返回字符串
        String parentPath = f.getParent();
        //获得父文件夹路径,返回文件对象
        File parentFile = f.getParentFile();
        //输出信息
        System.out.println("文件名: "+filename);
        System.out.println("文件大小: "+filesize);
        System.out.println("文件路径: "+path);
        System.out.println("文件父路径: "+parentPath);
        System.out.println("文件父路径: "+parentFile);
        
    }
}
