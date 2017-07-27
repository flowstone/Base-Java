package org.xueyao.work1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * ArrayList集合有以下元素:{"张柏芝","刘德华","张亮","张靓颖","杨颖","黄晓明","张柏芝","刘德华"}.
 * 1.使用HashSet将重复的元素去除.
 * 2.编写一个方法:将去重后的人员写入到D:\\a.txt中.
 * 3.编写一个方法:将D:\\a.txt中所有姓张的人员信息读取出来并打印到控制台上
 * 1.   定义ArrayList
    2.  使用add方法往ArrayList添加指定的内容
    3.  创建HashSet.将ArrayList的内容放入HashSet去除重复内容
    4.  定义save(HashSet<String> hs)方法
    5.  在save方法中创建BufferedWriter字符输出流
    6.  在save方法中遍历获取每个名称
    7.  在save方法中将名称写入指定文件中
    8.  在save方法中关闭流
    9.  调用save方法,传入去重后的名称
    10. 定义read()方法读取指定文件内容
    11. 在read()方法中创建BufferedReader字符输入流
    12. 在read()方法中读取文件中的名称
    13. 在read()方法中判断名称是否以张开头
    14. 在read()方法中打印以张开头的名称
    15. 调用read方法

 * @author Yao Xue
 * @date Jul 27, 2017 9:12:08 PM
 */
public class Test12 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("张柏芝");
        arrayList.add("刘德华");
        arrayList.add("张亮");
        arrayList.add("张靓颖");
        arrayList.add("杨颖");
        arrayList.add("黄晓明");
        arrayList.add("张柏芝");
        arrayList.add("刘德华");
        
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.addAll(arrayList);
        //System.out.println(hashSet);
        
        //save(hashSet);
        read();
    }
    
    public static void save(HashSet<String> sh) {
        BufferedWriter bufferedWriter = null;
        try {
             bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
            Iterator<String> it = sh.iterator();
            while (it.hasNext()) {
                bufferedWriter.write(it.next());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
    
    public static void read() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("a.txt"));
            String line = null;
            while ((line = bufferedReader.readLine())!=null) {
                if (line.startsWith("张")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e2) {
                // TODO: handle exception
            }
        }
    }
}
