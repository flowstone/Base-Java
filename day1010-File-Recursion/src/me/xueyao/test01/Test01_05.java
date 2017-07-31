package me.xueyao.test01;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 2:52:58 PM
 */
public class Test01_05 {
    public static void main(String[] args) {
        //创建文件对象 
        File f = new File("D:\\Temp\\Temp\\a.txt");
        
        //删除文件
        f.delete();
        
        //创建文件夹对象
        File dir = new File("D:\\Temp\\Temp\\hello\\world");
        //删除文件夹
        dir.delete();
    }
}
