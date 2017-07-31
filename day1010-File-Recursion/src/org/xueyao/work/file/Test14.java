package org.xueyao.work.file;

import java.io.File;

/**
 * 获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 * @author Yao Xue
 * @date Jul 30, 2017 9:23:37 PM
 */
public class Test14 {
    public static void main(String[] args) {
        File f = new File("F:\\CODE\\Java\\day001-HelloWorld");
        //过滤器
        File[] arr = f.listFiles(new MyFileFilter());
        for (File f2: arr) {
            System.out.println(f2.getAbsolutePath());
        }
    }
}
