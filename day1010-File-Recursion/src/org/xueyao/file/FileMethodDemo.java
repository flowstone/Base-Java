package org.xueyao.file;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 11:24:47 AM
 */
public class FileMethodDemo {
    public static void main(String[] args) {
        //创建文件对象 
        File file = new File("FileDemo.java");
        //获取文件的绝对路径,即全路径
        String absPath = file.getAbsolutePath();
        //File中封装的路径是什么获取到的就是什么
        String path = file.getPath();
        //获取文件名称
        String filename = file.getName();
        //获取大小
        long size = file.length();
        
        System.out.println("absPath="+absPath);
        System.out.println("path="+ path);//path=FileDemo.java

        System.out.println("filename="+ filename); //filename=FileDemo.java

        System.out.println("size="+size);
    }
}
