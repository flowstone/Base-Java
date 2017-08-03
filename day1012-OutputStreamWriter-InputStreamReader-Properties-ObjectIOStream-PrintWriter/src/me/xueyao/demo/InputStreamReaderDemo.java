package me.xueyao.demo;

import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *  * 需求：在硬盘上新建一个文本文件D:\\out.txt，输入”你好”两个汉字，并以UTF-8编码保存,使用程序读取文件中的数据并打印到控制台上。
 * 源文件：你好  UTF-8
 * 结果：浣犲ソ 默认编码 GBK
 * 乱码：使用的编码表不一致导致的
 * 解决方案：我们可以考虑在读取文件的时候指定编码表，UTF-8
 * 
 * InputStreamReader(InputStream in, String charsetName) 创建使用指定字符集的 InputStreamReader。
 * 
 * 总结：
 * 开发中如何使用FileReader 和 InputStreamReader？
 * 如果指定默认编码表 那么 FileReader
 * 如果必须指定编码表请使用 InputStreamReader
 * @author Yao Xue
 * @date Aug 2, 2017 9:49:18 PM
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws Exception {
        //使用字符流读取文件数据输出到控制台
        //创建字符流对象
        //FileReader fr = new FileReader("D:\\Temp\\Temp\\copy.txt");
        //创建字节转字符输入转换流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Temp\\Temp\\copy.txt"),"utf-8");
        char[] ch = new char[1024];
        int len = 0;
        while ((len = isr.read(ch))!= -1) {
            System.out.println(new String(ch, 0, len));
        }
        //释放资源
        isr.close();
    }
}
