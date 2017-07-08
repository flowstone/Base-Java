import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：往文件中写数据 
 *      写数据 -- 输出流 -- FileWriter
 * 
 * FileWriter:
 *      FileWriter(String fileName):传递一个文件名称
 * 
 * 输出流写数据的步骤：
 *      A：创建输出流对象
 *      B：调用输出流对象的写数据方法
 *      C：释放资源
 * @author Yao Xue
 * @date Jul 6, 2017 7:02:44 PM
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fw = new FileWriter("a.txt");
        /*
         * 创建输出流对象做了哪些事情：
         *      A：调用系统资源创建一个文件
         *      B：创建输出 流对象
         *      C:把输出流对象指向文件
         */
        //调用输出流对象的写数据的方法
        //写一个字符串数据
        fw.write("IO流你好");
        //数据没有直接写到文件中，其实是写到了内存缓冲区
        fw.flush();
        //释放资源
        fw.close();
    }
}
