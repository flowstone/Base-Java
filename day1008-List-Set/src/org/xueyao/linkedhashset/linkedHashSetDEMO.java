package org.xueyao.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Yao Xue
 * @date Jul 27, 2017 6:13:29 PM
 */
public class linkedHashSetDEMO {
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        ls.add("e");
        ls.add("c");
        ls.add("b");
        ls.add("a");
        System.out.println(ls);
        
        Iterator<String> it = ls.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        for (String s : ls) {
            System.out.println(s);
        }
    }
}
