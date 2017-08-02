package me.xueyao.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 在d盘目录下有一个加密文件a.txt（文件里只有英文和数字），密码是“heima”
当密码输入正确时才能读取文件里的数据。现要求用代码来模拟读取文件的过程，并统计文件里各个字母出现的次数，并把统计结果按照如下格式输出到d盘的count.txt中。
a：2个
b：3个
c：4个
............

 * @author Yao Xue
 * @date Aug 2, 2017 11:09:13 AM
 */
public class Test03_02 {
    public static void main(String[] args) throws IOException {
        //创建键盘流入对象
        Scanner sc = new Scanner(System.in);
        //请输入密码
        System.out.println("请输入密码:");
        //判断密码是否正确
        while (true) {
            String password = sc.nextLine();
            if (password.equals("heima")) {
                break;
            } else {
                System.out.println("密码错误,请重新输入:");
            }
        }
        
        //创建map集合存放数据
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        //统计每个字符出现的次数
        calCuteCharCount(map);
        //将统计结果保存到文件中
        saveResult(map);
    }

    private static void saveResult(Map<Character, Integer> map) throws IOException {
        //创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Temp\\Temp\\test2\\admin1.txt", true));
        //遍历map集合
        for (Entry<Character,Integer> entry : map.entrySet()) {
            bw.write(entry.getKey()+":"+entry.getValue());
            //写换行符
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    private static void calCuteCharCount(Map<Character, Integer> map) throws IOException {
        //创建字符输入高效流
        BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\Temp\\test2\\admin.txt"));
        String line = null;
        //循环读取数据
        while ((line = br.readLine())!= null) {
            //遍历字符串
            for (int index=0; index < line.length(); index++) {
                //获得每一个字符
                Character ch = line.charAt(index);
                //判断map集合是否有该字符对应的键
                if (map.containsKey(ch)) {
                    map.put(ch,map.get(ch)+1);
                } else {
                    map.put(ch,1);
                }
            }
        }
        br.close();
    }
}
