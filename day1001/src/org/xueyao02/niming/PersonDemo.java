package org.xueyao02.niming;
/**
 * 匿名对象：没有名字的对象
 *      特点：简化格式，只能使用一次
 *      作业：作业参数传递
 * @author Yao Xue
 * @date Jul 19, 2017 10:05:46 AM
 */
public class PersonDemo {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("小明");
        p.setAge(18);
        p.walk();
        
        //匿名对象
        new Person();
        new Person().setName("小丽");
        
        String name = new Person().getName();
        System.out.println(name);  //null
        
        walk(new Person("李四", 23));
        
        getPerson();
        
    }

    public static Person getPerson() {
//        Person person = new Person("小华",13);
//        return person;
        return new Person("小丽", 24);
    }

    private static void walk(Person person) {
        // TODO Auto-generated method stub
        person.walk();
    }
}
