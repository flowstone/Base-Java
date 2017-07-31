package me.xueyao.test01;

import java.io.File;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 2:48:09 PM
 */
public class Test01_02 {
    public static void main(String[] args) throws IOException {
        //创建文件对象 :绝对路径
        File f = new File("D:\\Temp\\Temp\\a.txt");
        //如果文件不存在,则创建文件
        if (!f.exists()) {
            f.createNewFile();
        }
    }
}
