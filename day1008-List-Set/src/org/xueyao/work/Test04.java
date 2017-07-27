package org.xueyao.work;

import java.util.HashSet;

/**
 * 1.   先判断hashCode()
    2.  再判断equals()

 * @author Yao Xue
 * @date Jul 27, 2017 7:57:42 PM
 */
public class Test04 {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<Person>();
        hashSet.add(new Person("赵灵儿"));
        hashSet.add(new Person("李逍遥"));
        hashSet.add(new Person("林月如"));
        hashSet.add(new Person("阿奴"));
        hashSet.add(new Person("阿奴"));
        
        for (Person p : hashSet) {
            System.out.println(p);
        }
        
       
        
    }
}
