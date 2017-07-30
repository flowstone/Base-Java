package org.xueyao.work01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/**
 * 使用键盘循环录入:书名,价格.创建一个Map集合,key存储书名,value存储书的价格. 录入以下5本书数据:{Java=32.5,C++=25,PHP=28.6,UI=21.3,Python=10.2} 要求;
1.删除集合中的C++这本书
2.Java的这本书涨价为38.5元 
3.使用keySet和entrySet两种不同方式对集合遍历输出

 * @author Yao Xue
 * @date Jul 30, 2017 3:30:17 AM
 */
public class Test23 {
    public static void main(String[] args) {
        Map<String,String> book = new HashMap<String,String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"本数据:");
        }
        System.out.println(book);
        book.remove("C++");
        book.put("Java","38.5");
        
        Iterator<String> it = book.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = book.get(key);
            System.out.println(key+"="+value);
            
        }
        System.out.println("-----------");
        Iterator<Entry<String,String>> it2 = book.entrySet().iterator();
        while (it2.hasNext()) {
            Entry<String,String> next = it2.next();
            String lang = next.getKey();
            String price = next.getValue();
            System.out.println(lang+"="+price);
        }
        
    }
}
