package org.xueyao.day008_06;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 8:18:39 PM
 */
public class Demo2_Final {
    public static void main(String[] args) {
        final int num = 10;
        //num = 20;
        System.out.println(num);
        
        final Person person = new Person("ÕÅÈý",23);
    }
}


class Person {
    private String name;
    private int age;
    
    public Person() {
        
    }

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
