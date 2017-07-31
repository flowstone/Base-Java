package org.xueyao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Yao Xue
 * @date Jul 30, 2017 8:23:20 PM
 */
public class Test {
    public static void main(String[] args) throws IOException {
        // 用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要搜索的球员和球队(姓名,球队):");
        String search = sc.nextLine();
        String[] split2 = search.split(",");
        // 判断条件
        BufferedReader br = new BufferedReader(new FileReader("player.txt"));
        HashMap<String, String> map = new HashMap<String, String>();
        String message;
        while ((message = br.readLine()) != null) {
            String[] split = message.split(",");
            map.put(split[0], split[1]);
        }
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String name = it.next();
            String team = map.get(name);
            // System.out.println(name + "," + team);
        }
        Set<Entry<String, String>> set2 = map.entrySet();
        Iterator<Entry<String, String>> it2 = set2.iterator();
        while (it2.hasNext()) {
            Entry<String, String> entry = it2.next();
            String name = entry.getKey();
            String team = entry.getValue();
            if (split2[0] == name && split2[1] == team) {
                System.out.println("您所查找的球员为:" + name + "," + team);
            } else {
                System.out.println("您所查找的信息不存在.");
            }

        }
    }

}

