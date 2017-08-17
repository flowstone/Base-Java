package org.xueyao.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yao Xue
 * @date Aug 14, 2017 8:24:27 PM
 */
public class ListMethodDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("柳岩");
        list.add("范冰冰");
        list.add("李冰冰");
        list.add("林心如");
        System.out.println(list);
        
        list.add(2,"刘亦菲");
        System.out.println(list);
    }
}
