package me.xueyao.work;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 模拟用户登录和注册功能实现。
接收用户输入的用户名和密码，然后和文件中存储的用户名、密码匹配。
如果文件已经存在用户名并且密码也是正确的，提示登录成功，否则提示登录失败。
如果文件中不存在该用户名，则使用该用户名和密码注册一个新的账号，并提示注册成功。

 * @author Yao Xue
 * @date Aug 2, 2017 10:34:58 AM
 */
public class Test03_01 {
    public static void main(String[] args) {
        //创建键盘流入对象 
        Scanner sc = new Scanner(System.in);
        //请输入用户名和密码
        System.out.println("请输入您的用户名:");
        String username = sc.nextLine().trim();
        System.out.println("请输入您的密码");
        String password = sc.nextLine().trim();
        //调用 登录方法
        login(username, password);
    }

    private static boolean login(String username, String password) {
        //声明高效字符流
        BufferedReader br  = null;
        try {
            File f = new File("D:\\Temp\\Temp\\test2\\admin.txt");
            //判断文件是否存在
            if (!f.exists()) {
                f.createNewFile();
                return false;
            }
            br = new BufferedReader(new FileReader("D:\\Temp\\Temp\\test2\\admin.txt"));
            String line = null;
            //定义标记记录用户是否存在
            boolean exists = false;
            //循环读取每一行数据
            while ((line = br.readLine())!= null) {
                //使用-分隔
                String[] strs = line.split("=");
                //判断用户名是否正确
                if (strs[0].equals(username)) {
                    exists = true;
                    if (strs[1].equals(password)) {
                        System.out.println("登录成功");
                        return true;
                    } else {
                        System.out.println("用户名或密码错误,请重新登录");
                        return false;
                    }
                }
                
            }
            if (!exists) {
                System.out.println("用户名不存在");
                //注册账号
                register(username,password);
            }
        } catch (IOException e) {
            // TODO: handle exception
        } finally {
            try {
                if (br != null) {
                    br.close();
                } 
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private static void register(String username, String password) throws IOException {
        //创建字符输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Temp\\Temp\\test2\\admin.txt"));
        //保存用户名和密码
        bw.write(username);
        bw.write("=");
        bw.write(password);
        bw.newLine();
        bw.close();
    }
}
