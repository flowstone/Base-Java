package me.xueyao.test03;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 31, 2017 4:30:48 PM
 */
public class Test03_03 {
    public static void main(String[] args) {
        File dir = inputFile();
        //创建Map集合
        Map<String,Integer> map = new HashMap<String, Integer>();
        getFileType(dir,map);
        //遍历map
        for (Entry<String,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" 类型的文件有"+ entry.getValue()+"个");
        }
    }
    /**
     * 根据用户输入的路径字符串创建文件对象
     */
    public static File inputFile() {
        //创建键盘输入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入 一个文件夹路径:");
        //接收用户输入的路径
        String filePath = sc.nextLine();
        //根据路径字符串创建文件对象
        File dir = new File(filePath);
        if (!dir.exists()) {
            throw new RuntimeException("你输入的文件路径不存在!");
        }
        //判断是否是文件夹
        if (!dir.isDirectory()) {
            throw new RuntimeException("你输入的路径不是文件夹路径!!");
        }
        
        return dir;
    }
    
    public static void getFileType(File f, Map<String,Integer> map) {
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                getFileType(file,map);
            }
        } else {
            //获得文件名
            String fileName = f.getName();
            //获得文件扩展名
            String key = fileName.substring(fileName.lastIndexOf(".")+1);
            //判断map是否包含key
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+1);
            } else {
                map.put(key, 1);
            }
        }
    }
    
}
