package org.xueyao.io.task;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 模拟用户登录和注册功能实现。
接收用户输入的用户名和密码，然后和文件中存储的用户名、密码匹配。
如果文件已经存在用户名并且密码也是正确的，提示登录成功，否则提示登录失败。
如果文件中不存在该用户名，则使用该用户名和密码注册一个新的账号，并提示注册成功。

 * @author Yao Xue
 * @date Aug 2, 2017 1:12:28 AM
 */
public class Task01_18 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> hm = new HashMap<String,String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String name = sc.nextLine().trim();
        System.out.println("请输入密码");
        String password = sc.nextLine().trim();
        BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\Temp\\test1\\admin.txt"));
        String len = null;
        while ((len = br.readLine())!= null) {
           
            String[] split = len.split("=");
            if (name.equals(split[0])) {
                if (password.equals(split[1])) {
                    System.out.println("登录成功");
                } else {
                    System.out.println("登录失败");
                }
            } else {
                hm.put(name,password);
            }
        }
        br.close();
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\admin.txt",true);
        Iterator<Entry<String,String>> it = hm.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> next = it.next();
            String names = next.getKey();
            String pw = next.getValue();
            String lineSeparator = System.lineSeparator();
            fos.write((lineSeparator+names+"="+pw).getBytes());
            fos.flush();
        }
        fos.close();
    }
}
