package org.xueyao07.finallyd;

import java.io.Closeable;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 5. finally代码块
        1. 语法：try...catch...finally{'此代码必须执行'}
        2. 一般用于IO关流
 * @author Yao Xue
 * @date Jul 24, 2017 2:54:07 PM
 */
public class FinallyDemo {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        
        try {
            fr = new FileReader("a.txt"); ////FileNotFoundException(IO异常子类) :文件找不到
            fw = new FileWriter("b.txt"); //IOException:IO异常(交互 :调用系统资源帮java进行读写)
            
            char[] ch = new char[1024];
            int len = 0;
            while ((len = fr.read(ch))!= -1) {
                fw.write(ch, 0, len);
                fw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //这里的代码一定执行，一定释放资源
            System.out.println(fr);
            closeTo(fr,fw);
            /*try {
                if (fr != null) {
                    fr.close();
                }
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }*/
        }
    }

    private static void closeTo(Closeable... ios) {
        for (int i = 0; i < ios.length; i++) {
            Closeable io = ios[i];
            if (io != null) {
                try {
                    io.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

   
}
