package me.xueyao.test02;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:26:13 PM
 */
public class Test02_01 {
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //提示用户输入一个文件路径 
        System.out.println("请输入一个文件路径:");
        //接收用户输入的文件路径
        String filePath = sc.nextLine();
        //根据文件路径创建文件对象
        File file = new File(filePath);
        //判断文件是否存在
        if (!file.exists()) {
            //不存在,则创建文件
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else {
            //输入文件大小
            System.out.println("文件大小为:"+file.length());
        }
    }
}
