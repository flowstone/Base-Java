package me.xueyao.test01;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 2:51:31 PM
 */
public class Test01_04 {
    public static void main(String[] args) {
        //创建文件对象 
        File f = new File("D:\\Temp\\Temp\\hello\\world");
        //创建多级文件夹
        f.mkdirs();
    }
}
