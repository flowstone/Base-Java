package org.xueyao.file;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 12:06:39 PM
 */
public class FileMethodDemo3 {
    public static void main(String[] args) {
        File dir = new File("D:\\Temp\\JavaRunTestCodeFolder");
        //获取的是目录下的当前的文件以及文件夹的名称.
        String[] names = dir.list();
        for (String name : names) {
            System.out.println(name);
        }
        
        //获取目录下当前文件以及文件对象 ,只要拿到文件对象 ,那么就可以获取其中想要的信息
        File[] files = dir.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
