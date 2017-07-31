package org.xueyao.work.file;

import java.io.File;

/**将C盘下a.txt文件删除
将C盘下aaa文件夹删除,要求文件夹aaa是一个空文件夹

 * @author Yao Xue
 * @date Jul 30, 2017 7:53:40 PM
 */
public class Test05 {
    public static void main(String[] args) {
        /*File f = new File("D:\\a.txt");
        if (f.exists()) {
            boolean boo = f.delete();
            System.out.println(boo);
        }*/
        
        File f = new File("D:\\ccc");
        boolean bool = f.delete();
        System.out.println(bool);
        
    }
}
