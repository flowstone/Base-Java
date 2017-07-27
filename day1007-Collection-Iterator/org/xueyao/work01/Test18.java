package org.xueyao.work01;

import java.util.ArrayList;

/**
 * 编写一个deleteElements方法，接收一个ArrayList,ArrayList中存放元素的类型不确定，
 * 在deleteElements方法的删除ArrayList中的第一个和最后一个元素
 * @author Yao Xue
 * @date Jul 27, 2017 11:00:43 AM
 */
public class Test18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("你好");
        list.add("JavaEE");
        list.add("欢迎入坑");
        deleteElements(list);
        System.out.println(list);
    }
    
    public static <E> void deleteElements(ArrayList<?> e) {
            e.remove(0);
            e.remove(e.size()-1);
            
    }
}
