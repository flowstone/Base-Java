package org.xueyao04.list;

import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 19, 2017 11:33:21 AM
 */
public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("����");
        arrayList.add("����");
        arrayList.add("����");
        
        for (int i = 0; i < arrayList.size(); i++) {
            String string = arrayList.get(i);
            System.out.println(string);
            
            if ("����".equals(string)) {
                arrayList.remove(i);
                i--;
            }
            
        }
        System.out.println(arrayList);
    }
}
