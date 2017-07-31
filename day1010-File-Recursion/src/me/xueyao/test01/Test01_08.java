package me.xueyao.test01;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:19:06 PM
 */
public class Test01_08 {
    public static void main(String[] args) {
        //创建文件对象
        File f = new File("D:\\Temp\\Temp");
        //获得文件夹下所有文件
        File[] files = f.listFiles();
        //遍历文件数组
        for (File file : files) {
            //将文件的名字打印到控制台
            System.out.println(file.getName());
        }
    }
}
