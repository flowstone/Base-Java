package org.xueyao.io.stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 9:26:28 AM
 */
public class FileOutputStreamDmeo1 {
    public static void main(String[] args) throws IOException {
        method_1();
        method_2();
    }
    /*
     * 解决办法:
     *    通过System类,调用这个类的函数getProperties()
     */
    private static void method_2() throws IOException {
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\4.txt",true);
        /**
         * 向文件中写入数据
         * fos.write("我叫小明".getBytes();
         * 表示获得系统中所有的属性
         * Properties properties = System.getProperties();
         * System.out.println(properties);
         */

        //获得系统中的行分隔符
        String separator = System.getProperty("line.separator");
        //向文件中写出数据
        fos.write(("我叫小明"+separator).getBytes());
        //关闭资源
        fos.close();
    }
    //需求:使用字节输出流把字符串数据"你好吗"写到硬盘上,要求不能覆盖文件中原有的数据
    private static void method_1() throws IOException {
        //创建输出流对象
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\4.txt",true);
        /*
         *对于以上构造函数进行说明
         *如果第二个参数为true,那么就会在已经存在的文件中的末尾处追加数据,如果这个4.txt不存在
         *那么就会创建这个文件
         *如果第二个参数为false,那么向文件添加数据的时候就会覆盖原来的数据 
         */
        //向文件中添加数据
        fos.write("你好吗".getBytes());
        fos.write("我叫小明".getBytes());
        //关闭资源
        fos.close();
        
    }
}
