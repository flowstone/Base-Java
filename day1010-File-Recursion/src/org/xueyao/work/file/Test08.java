package org.xueyao.work.file;

import java.io.File;

/**
 * 获取指定文件夹下所有的文件，并将所有文件的名字输出到控制台。
注意：不包含子文件夹下的文件

 * @author Yao Xue
 * @date Jul 30, 2017 8:19:00 PM
 */
public class Test08 {
    public static void main(String[] args) {
        File f = new File("D:\\Temp\\JavaRunTestCodeFolder");
        String[] arr = f.list();
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
