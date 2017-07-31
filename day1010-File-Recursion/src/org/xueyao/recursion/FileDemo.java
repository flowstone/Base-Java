package org.xueyao.recursion;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 12:51:04 PM
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\Temp\\JavaRunTestCodeFolder");
        getFileAll(file);
    }
    
    //获取指定目录以及子目录中的所有的文件
    public static void getFileAll(File file) {
        File[] files = file.listFiles();
        //遍历当前目录下的所有的文件和文件夹
        for (File f : files) {
            //判断当前遍历到的是否为目录 
            if (f.isDirectory()) {
                //是目录,继续获取这个目录下的所有文件和文件夹
                getFileAll(f);
            } else {
                //不是目录,说明当前f就是文件,那么就打印出来
                System.out.println(f);
            }
        }
    }
}
