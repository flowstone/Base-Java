package org.xueyao.work1;

import java.util.HashSet;

/**
 * @author Yao Xue
 * @date Jul 27, 2017 8:17:43 PM
 */
public class Test05 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<Person>();
        hashSet.add(new Person("赵灵儿",18));
        hashSet.add(new Person("李逍遥", 19));
        hashSet.add(new Person("林月如", 18));
        hashSet.add(new Person("阿奴", 16));
        hashSet.add(new Person("阿奴", 16));
        
        for (Person p : hashSet) {
            System.out.println(p);
        }
    }
}
