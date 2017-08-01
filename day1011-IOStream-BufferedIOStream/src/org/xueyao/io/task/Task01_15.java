package org.xueyao.io.task;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在C盘下创建一个目录d1,在目录d1下创建若干个txt文件，并在每一个txt文件中添加若干内容。
 * 将所有txt文件的内容复制到D盘下的copy.txt中。
* 要求所有txt的文件内容都复制到同一个文件中

 * @author Yao Xue
 * @date Aug 1, 2017 11:56:23 PM
 */
public class Task01_15 {
    public static void main(String[] args) throws IOException {
        File f = new File("d:\\Temp\\Temp\\test1");
        //设置路径前缀
        String prefix = "d:\\Temp\\Temp\\test1\\";
        File[] listFiles = f.listFiles();
        FileOutputStream fos = new FileOutputStream("d:\\Temp\\Temp\\copy.txt",true);
        for (File file : listFiles) {
            //System.out.println(prefix+file.getName());
            FileInputStream fis = new FileInputStream(prefix+file.getName());
            byte[] buf = new byte[1024];
            int len = 0;
            while ((len = fis.read(buf))!=-1) {
                fos.write(buf, 0, len);
            }
            fis.close();
        }
        fos.close();
    }
}
