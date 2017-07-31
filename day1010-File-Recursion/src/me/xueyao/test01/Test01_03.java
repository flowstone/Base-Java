package me.xueyao.test01;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 2:50:02 PM
 */
public class Test01_03 {
    public static void main(String[] args) {
        //创建文件对象
        File f = new File("D:\\Temp\\Temp\\world");
        //创建文件夹
        f.mkdir();
    }
}
