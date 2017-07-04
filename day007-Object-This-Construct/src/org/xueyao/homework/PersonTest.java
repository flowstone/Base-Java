package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jul 4, 2017 8:52:29 AM
 */
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person("ÍÞ¹þ¹þ");
        person.method5();
        int[] arr = new int[3];
        person.method6(arr);
        double num =  person.method2(4);
        System.out.println("num:"+num);
        arr = person.method3();
        
        person.method12(person);
    }
}
