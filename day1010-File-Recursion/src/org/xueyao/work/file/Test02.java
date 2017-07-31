package org.xueyao.work.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 7:41:39 PM
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        //创建对象
        File f = new File("D:\\a.txt");
        //判断文件是否存在
        if (!f.exists()) {
            //创建文件
            boolean boo = f.createNewFile();
            System.out.println(boo);
        }
    }
}
