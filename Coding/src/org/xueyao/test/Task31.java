package org.xueyao.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 1. 项目根目录下已存在文件player.txt，文件中存放球员和球队存储格式如下(原始球员和球队不用程序录入，可手动建文件并在文件中录入数据)：
球员,球队（中间用，分隔），如：
杜兰特，勇士队
威少，雷霆队
库里，勇士队
石破天，湖人队
科比，湖人队
2. 程序启动时：提示用户输入球员名根据球员名找到所对应的球队
2.1 键盘录入球员名
  2.2 在player.txt中获取球员名和所属球队，验证键盘录入的球员是否存在
  是：控制台将球员的所属球队信息打印
  否：控制台提示：不存在该球员，并结束程序
例如：提示录入球员姓名检索对应球队
录入库里
展示出库里所属勇士队即完成功能
如果找不到给出相应的提示
 * @author Yao Xue
 * @date Aug 2, 2017 7:55:38 PM
 */
public class Task31 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("player.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入球员名:");
        String name = sc.nextLine().trim();
        String line = null;
        HashMap<String ,String> map = new HashMap<String,String>();
        
        while ((line = br.readLine())!=null) {
            String[] split = line.split("，");
            map.put(split[0],split[1]);
        }
        
        br.close();
        Set<String> keySet = map.keySet();
        Iterator<String> it = keySet.iterator();
        boolean exists = false;
        String temp = null;
        while (it.hasNext()) {
            String key = it.next();
            if (key.equals(name)) {
                exists = true;
                temp = map.get(key);
            } 
        }
        if (exists) {
            System.out.println(temp);
        } else {
            System.out.println("不存在该球员");
        }
    }
}
