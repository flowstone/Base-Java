package org.xueyao.work.file;

import java.io.File;

/**
 * 在C盘下创建一个名为ccc的文件夹，要求如下：
    1.ccc文件夹中要求包含bbb子文件夹
    2.bbb子文件夹要求包含aaa文件夹

 * @author Yao Xue
 * @date Jul 30, 2017 7:51:35 PM
 */
public class Test04 {
    public static void main(String[] args) {
        File f = new File("D:\\ccc\\bbb\\aaa");
        boolean boo = f.mkdirs();
        System.out.println(boo);
    }
}
