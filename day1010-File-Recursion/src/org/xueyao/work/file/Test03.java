package org.xueyao.work.file;

import java.io.File;

/**
 * 在C盘下创建一个名为bbb的文件夹。
 * @author Yao Xue
 * @date Jul 30, 2017 7:48:55 PM
 */
public class Test03 {
    public static void main(String[] args) {
        File f = new File("D:\\bbb");
        if (!f.exists()) {
            boolean boo = f.mkdir();
            System.out.println(boo);
        }
    }
}
