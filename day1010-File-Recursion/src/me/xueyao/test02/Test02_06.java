package me.xueyao.test02;

import java.io.File;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:56:05 PM
 */
public class Test02_06 {
    public static void main(String[] args) {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径:");
        //接收用户输入的路径
        String filePath = sc.nextLine();
        //根据路径字符串创建文件对象 
        File dir = new File(filePath);
        //调用 calculate方法获得文件大小
        long length = calculate(dir);
        System.out.println("文件夹总大小: "+length);
    }
    public static long calculate(File dir) {
        long length = 0;
        //获得文件数组
        File[] files = dir.listFiles();
        //遍历数组
        for (File file : files) {
            //判断是否是文件
            if (!file.isFile()) {
                length += calculate(file);
            } else {
                length += file.length();
            }
        }
        return length;
    }
}
