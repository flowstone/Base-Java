package me.xueyao.test02;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:43:14 PM
 */
public class Test02_04 {
    public static void main(String[] args) {
        //创建文件夹对象
        File file = new File("D:\\Temp\\Temp");
        //获得该文件夹下的所有java文件
        File[] files = file.listFiles(new FileFilter() {
            
            @Override
            public boolean accept(File pathname) {
                //判断文件后缀名是否.java文件
                if (pathname.getName().endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });
        
        //遍历文件数组,打印所有的java文件路径 
        for (File f2 : files) {
            System.out.println(f2.getAbsolutePath());
        }
    }
}
