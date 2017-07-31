package me.xueyao.test02;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:39:26 PM
 */
public class Test02_03 {
    public static void main(String[] args) {
        //创建文件夹对象
        File dir = new File("D:\\Temp\\Temp");
        //调用递归方法
        printFiles(dir);
    }
    
    /**
     * 递归方法:遍历指定文件夹的所有文件
     * @param dir
     */
    public static void printFiles(File dir) {
         //获得该文件夹下的所有文件
        File[] files = dir.listFiles();
        //遍历文件数组
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getAbsolutePath());
            } else {
                //是文件夹,递归调用当前方法
                printFiles(f);
            }
        }
    }
}
