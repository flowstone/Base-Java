package me.xueyao.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * 从控制台获取输入的文件目录然后将该目录(包含子目录)下的.
 * java文件复制到D:/java文件夹中,并统计java文件的个数.
提示:如果有相同的名称的文件,如果两个Test01.java,
则拷贝到目标文件夹时只能有一个Test01.java,
另一个Test01.java要修改为另一个名称:该名称可随机生成,只要不重复即可.

 * @author Yao Xue
 * @date Aug 2, 2017 11:29:12 AM
 */
public class Test03_03 {
    //定义统计变量记录Java文件的总数
    private static int count = 0;
    public static void main(String[] args) throws IOException {
        //获得源文件夹
        File srcDir = inputFile();
        //创建目标文件夹对象
        File destDir = new File("D:\\Temp\\Temp\\java");
        destDir.mkdirs();
        //拷贝Java文件
        copyJavaFile(srcDir,destDir);
        System.out.println("count="+count);
    }
    
    /**
     *  将srcDir文件夹下的所有.java文件拷贝到destDir文件夹下
     * @param srcDir  源路径 
     * @param destDir  目的路径
     * @throws IOException 
     */
    private static void copyJavaFile(File srcDir, File destDir) throws IOException {
        //获得源文件夹下所有java文件和子文件夹
        File[] files = srcDir.listFiles(new FileFilter() {
            
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || pathname.getName().endsWith(".java")) {
                    return true;
                }
                return false;
                
            }
        });
        
        //遍历文件数组
        for (File file : files) {
            //判断file是否是文件夹
            if (file.isDirectory()) {
                //递归调用 当前方法
                copyJavaFile(file, destDir);
            } else {
                //获得要拷贝的文件名
                String fileName = file.getName();
                //在目标文件夹destDir下创建一个同名的文件名
                File destFile = new File(destDir,fileName);
                //判断目标文件是否存在
                while (destFile.exists()) {
                    //重命名目标文件名
                    destFile = new File(destDir,new Random().nextInt(100000)+fileName);
                }
                System.out.println(destFile);
                copyFile(file,destFile);
            }
        }
    }
    
    /**
     * 字节流缓冲区流读写字节数组
     * @param file
     * @param destFile
     * @throws IOException 
     */
    private static void copyFile(File srcFile, File destFile) throws IOException {
        //计数器加一
        count ++;
        //创建字节缓冲输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        //创建字节缓冲输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int len = 0;
        byte[] buffer = new byte[1024];
        //循环读取数据
        while ((len = bis.read(buffer))!=-1) {
            //利用输出流往输出目的写数据
            bos.write(buffer, 0, len);
        }
        
        bis.close();
        bos.close();
    }

    /**
     * 根据用户输入的路径字符串创建文件对象
     * @return
     */
    
    private static File inputFile() {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径 :");
        //接收用户输入的路径:
        String filePath = sc.nextLine().trim();
        //根据路径字符串创建文件对象
        File dir = new File(filePath);
        if (!dir.exists()) {
            throw new RuntimeException("你输入的文件路径 不存在");
        }
        
        //判断是否是文件夹
        if (!dir.isDirectory()) {
            throw new RuntimeException("输入的路径 不是文件夹路径");
        }
        return dir;
    }
}
