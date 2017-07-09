package org.xueyao.copyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：
 *      把项目路径下的FileWriterDemo.java 中的内容复制到项目路径下的Copy.java
 *      
 * 数据源：
 *      FileWriterDemo.java --读数据 --FileReader
 * 目的地：
 *      Copy.java -- 写数据 -- FileWriter
 * @author Yao Xue
 * @date Jul 8, 2017 8:30:43 AM
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fr = new FileReader("FileWriterDemo.java");
        
        //创建输出流对象
        FileWriter fw = new FileWriter("Copy.java");
        
        //读数据
        int ch;
        while ((ch = fr.read())!=-1) {
            fw.write(ch);
        }
        
        //释放资源
        fw.close();
        fr.close();
    }
}
