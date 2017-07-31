package me.xueyao.test02;

import java.io.File;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:31:20 PM
 */
public class Test02_02 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //提示用户输入 一个文件路径
        System.out.println("请输入一个文件路径:");
        //接收用户输入的文件路径
        String filePath = sc.nextLine();
        //根据文件路径 创建文件对象
        File file = new File(filePath);
        //判断是否是文件
        if (file.isFile()) {
            //输入文件大小
            System.out.println("文件大小为:"+file.length());
        } else {
            //是文件夹
            //定义变量统计文件大小之和
            int length = 0;
            //获得该文件夹下的所有文件
            File[] files = file.listFiles();
            //遍历文件数组
            for (File f : files) {
                if (f.isFile()) {
                    //累加文件大小
                    length += f.length();
                }
            }
            //输入文件夹的总大小
            System.out.println("文件总大小为:"+length);
        }
    }
}
