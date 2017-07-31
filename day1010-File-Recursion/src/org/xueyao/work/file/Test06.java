package org.xueyao.work.file;

import java.io.File;

/**
 * 1.   获取文件信息：文件名，文件大小，文件的绝对路径，文件的父路径
 * @author Yao Xue
 * @date Jul 30, 2017 8:00:42 PM
 */
public class Test06 {
    public static void main(String[] args) {
        File f = new File("D:\\aaa\\1.txt");
        
        String fileName = f.getName();
        long fileLength = f.length();
        String pathName = f.getAbsolutePath();
        String parent = f.getParent();
        
        System.out.println("文件名:"+fileName);
        System.out.println("文件大小:"+fileLength);
        System.out.println("文件绝对路径:"+pathName);
        System.out.println("文件的父路径:"+parent);
    }
}
